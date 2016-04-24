package org.spo.svc2.trx.pgs.m99.handler;

import org.spo.ifs2.dsl.controller.AbstractHandler;
import org.spo.ifs2.dsl.controller.DSLConstants.EventType;
import org.spo.ifs2.dsl.controller.NavEvent;
import org.spo.svc2.trx.pgs.m99.task.M9901;
import org.spo.svc2.trx.pgs.m99.task.M9902;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class M01Handler extends AbstractHandler{

   
   @Autowired
   M9901 m9901;
   
   @Autowired
   M9902 m9902;
   
  public static final NavEvent EV_INIT_01 =  NavEvent.create(EventType.REFRESHPAGE);
  public static final NavEvent EV_INIT_02 =  NavEvent.create(EventType.REFRESHPAGE);//loads m01/M0102
  public static final NavEvent EV_SWITCH_TO_BLOG_LANDING =  NavEvent.create(EventType.TASKSET, "02");
  public static final NavEvent EV_SWITCH_TO_CONTENT =  NavEvent.create(EventType.TRXSWITCH, "C01");
  
   @Override
   public void configureChannel() {
			taskChannel.put("01",m9901);
			taskChannel.put("02",m9902);
   }
   
   
  
    
	
	
	
	
	
	
}
