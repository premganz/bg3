package org.spo.svc3.trxdemo.pgs.mc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spo.cms3.svc.PageService;
import org.spo.cms3.svc.SocketConnector;
import org.spo.ifs3.template.web.Constants;
import org.spo.svc3.trxdemo.pgs.mc.cmd.PostContent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ContentPageController {

    private static final Logger logger = LoggerFactory
            .getLogger(ContentPageController.class);

   
 
    
	private SocketConnector connector=new SocketConnector();
	
	
	 @RequestMapping(value="/content/{contentId}", method = RequestMethod.GET)
	 public String fetchPost(    final PostContent content, final BindingResult bindingResult, final ModelMap model,
			 @PathVariable String contentId) {
		 if (bindingResult.hasErrors()) {
			 return "seedstartermng";
		 }

		 System.out.println(content.getHtmlContent());
		 logger.info("Searching "+contentId  );

		 PageService svc = new PageService();
		 String response = svc.readUpPage("posts", contentId);
content.setHtmlContent(response);
		 response=response.equals("")?"<p>blank reply</p>":response;
		 model.clear();
		 model.addAttribute("message", content);
		 return "post" ;
	 }
	 
	 
	
	
}
