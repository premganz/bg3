package org.spo.svc3.trx.pgs.m99.task;

import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spo.cms3.svc.PageService;
import org.spo.cms3.svc.SocketConnector;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.ifs3.dsl.controller.TrxInfo;
import org.spo.ifs3.dsl.model.AbstractTask;
import org.spo.ifs3.template.web.Constants;
import org.spo.svc3.trx.pgs.m99.cmd.LA01T;
import org.spo.svc3.trx.pgs.m99.handler.M99Handler;
import org.spo.svc3.trxdemo.pgs.c01.cmd.CA01T;
import org.spo.svc3.trxdemo.pgs.mc.cmd.PostContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component 
public class M9901 extends AbstractTask {

	@Autowired 
	public PageService pageService; 
	

	private static final Logger logger = LoggerFactory.getLogger(M9901.class);
	
	private SocketConnector connector=new SocketConnector();
	
	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {

		String contentId= dataId;
		String response="";
		String response_content="";

		response = pageService.readUpPage("templates", contentId);

		String dataId_Content="" ;
		if(dataId.equals("LA01T")){
			//regular Menu can be mapped with A01T content
			dataId_Content = "A01T";

		}

		response_content = pageService.readUpPage("templates", dataId_Content);

		try{
			Gson gson = new Gson();
			Type typ = new TypeToken<LA01T>(){}.getType();//FIXME right now only string works
			LA01T cmd_menu= gson.fromJson(response,typ);		

			typ = new TypeToken<CA01T>(){}.getType();//FIXME right now only string works
			CA01T cmd= gson.fromJson(response_content,typ);		
			if(cmd.getPage_content_type_cd().equals("1")){
				String contentId1 = cmd.getPage_content_text();
				response = pageService.readUpPage("posts", contentId1);
				String response_meta = pageService.readUpPage("posts", contentId1+"_meta");
				response=response.equals("")?"<p>blank reply</p>":response;				
				cmd.setPage_content_text(response);	
				PostContent contentObj = new PostContent();
				contentObj.setHtmlContent(response);
				contentObj.setMeta(response_meta);
				cmd.setPage_content_meta(response_meta);
				cmd.setContentObject(contentObj);
			}
			info.addToModelMap("menu",cmd_menu);
			info.addToModelMap("message",cmd);
			System.out.println(cmd.toString());

		}catch(Exception e){
			System.out.println("Error during messagePayload processing from  TestResourceServerException on" );
			e.printStackTrace();
		}

		return M99Handler.EV_INIT_01;
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {
		if(event.startsWith("EV_DTL")){
			String dataId = event.replaceAll("EV_DTL_","");
			NavEvent navEvent = M99Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId=dataId;
			return navEvent;
		}
		else if(event.startsWith("EV_ABOUT")){			
			NavEvent navEvent = M99Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId="B01T";
			return navEvent;
		}
		else if(event.startsWith("EV_BLOG")){		
			NavEvent navEvent = M99Handler.EV_SWITCH_TO_BLOG_LANDING;
			navEvent.dataId="LB01T";
			return navEvent;
		}
		return M99Handler.EV_INIT_01;
	}

	@Override
	public String processAjaxEvent(String event, TrxInfo info) {
		return "";
	}

	public SocketConnector getConnector() {
		return connector;
	}

	public void setConnector(SocketConnector connector) {
		this.connector = connector;
	}

	@Override
	public NavEvent initView(TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}




}
