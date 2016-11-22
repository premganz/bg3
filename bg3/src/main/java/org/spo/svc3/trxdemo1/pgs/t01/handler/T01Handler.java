package org.spo.svc3.trxdemo1.pgs.t01.handler;

import org.spo.ifs3.dsl.controller.AbstractHandler;
import org.spo.ifs3.dsl.controller.DSLConstants.EventType;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.svc3.trxdemo1.pgs.t01.task.T0101;
import org.spo.svc3.trxdemo1.pgs.t01.task.T0102;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class T01Handler extends AbstractHandler{

   
   @Autowired
   T0101 c0101;
   
   @Autowired
   T0102 c0102;
   
   public static final NavEvent EV_INIT_01 =  NavEvent.create(EventType.REFRESHPAGE);
   public static final NavEvent EV_INIT_02 =  NavEvent.create(EventType.REFRESHPAGE, "c01/C0102");
   public static final NavEvent EV_SWITCH_TO_DTL =  NavEvent.create(EventType.TASKSET, "02");
   public static final NavEvent EV_REFRESH_CONTENT =  NavEvent.create(EventType.TASKSET, "01");
   public static final NavEvent EV_REFRESH_NEW_SUB_LAND =  NavEvent.create(EventType.TRXSWITCH, "C01");
   public static final NavEvent EV_SWITCH_TO_OVV =  NavEvent.create(EventType.TRXSWITCH, "M01");
  
  
   @Override
   public void configureChannel() {
			taskChannel.put("01",c0101);
			taskChannel.put("02",c0102);
   }
   
   
  
    
	
	
	
	
	
	
}
