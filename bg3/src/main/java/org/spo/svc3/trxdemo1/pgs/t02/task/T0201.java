package org.spo.svc3.trxdemo1.pgs.t02.task;

import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spo.cms3.svc.PageService;
import org.spo.cms3.svc.SocketConnector;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.ifs3.dsl.controller.TrxInfo;
import org.spo.ifs3.dsl.model.AbstractTask;
import org.spo.svc3.trxdemo1.pgs.t01.cmd.CX99Connector;
import org.spo.svc3.trxdemo1.pgs.t01.cmd.CX99T;
import org.spo.svc3.trxdemo1.pgs.t02.cmd.LA99T;
import org.spo.svc3.trxdemo1.pgs.t02.handler.T02Handler;
import org.spo.svc3.trxdemo1.pgs.t02.cmd.LA99T;
import org.spo.svc3.trxdemo1.pgs.t02.handler.T02Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class T0201 extends AbstractTask {



	@Autowired
	public PageService svc ;
	private static final Logger logger = LoggerFactory.getLogger(T0201.class);

	
	private SocketConnector connector=new SocketConnector();
	
	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {
		//here the dataId is used in the context of the template
		String templateId= dataId;
		String response="";
		String response_content="";

		response = svc.readUpPage("templates", "LA01T");

		String dataId_Content="" ;
			//regular Menu can be mapped with A01T content
			dataId_Content = dataId+"_1";

	

		try{
			Gson gson = new Gson();
			Type typ = new TypeToken<LA99T>(){}.getType();//FIXME right now only string works
			LA99T cmd_menu= gson.fromJson(response,typ);		

			typ = new TypeToken<CX99T>(){}.getType();//FIXME right now only string works
			CX99T cmd= new CX99Connector().prepareContent(svc,dataId_Content);		
			
			info.addToModelMap("menu",cmd_menu);
			info.addToModelMap("message",cmd);
			System.out.println(cmd.toString());

		}catch(Exception e){
			System.out.println("Error during messagePayload processing from  TestResourceServerException on" );
			e.printStackTrace();
			
		}

		return T02Handler.EV_INIT_01;
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {
		if(event.startsWith("EV_DTL")){
			String dataId = event.replaceAll("EV_DTL_","");
			NavEvent navEvent = T02Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId=dataId;
			return navEvent;
		}else if(event.startsWith("EV_SUB_LAND")){
			String dataId = event.replaceAll("EV_SUB_LAND_","");
			NavEvent navEvent = T02Handler.EV_SWITCH_SUB_LAND;
			navEvent.dataId=dataId;
			return navEvent;
		}else if(event.startsWith("EV_SHORTCUT")){
			String dataId = event.replaceAll("EV_SHORTCUT_","");
			NavEvent navEvent = T02Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId=dataId;
			return navEvent;
		}
		else if(event.startsWith("EV_ABOUT")){			
			NavEvent navEvent = T02Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId="B01T";
			return navEvent;
		}
		else if(event.startsWith("EV_BLOG")){		
			NavEvent navEvent = T02Handler.EV_SWITCH_TO_BLOG_LANDING;
			navEvent.dataId="LB01T";
			return navEvent;
		}
		return T02Handler.EV_INIT_01;
	}

	@Override
	public NavEvent processViewResult(String event, Object form, TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
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
