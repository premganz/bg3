package org.spo.svc3.trx.pgs.m99.task;

import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.ifs3.dsl.controller.TrxInfo;
import org.spo.ifs3.dsl.model.AbstractTask;
import org.spo.svc3.trx.pgs.m99.handler.M99Handler;
import org.springframework.stereotype.Component;
@Component
public class M9902 extends AbstractTask {

	@Override
	public NavEvent initView(TrxInfo info) {
		return null;
	}

	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {

		return M99Handler.EV_INIT_02;
	
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public NavEvent processViewResult(String event,String json,  TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String processAjaxEvent(String event, TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
