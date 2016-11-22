package org.spo.svc3.trxdemo1.def;

import org.spo.ifs3.template.web.Constants;
import org.springframework.stereotype.Component;
@Component
public class ConstantsTestImpl implements Constants {

	public String getRepoPath() {
		if(!System.getProperty("os.name").startsWith("Windows")){
			return "/usr/local/share/data-cms/lc";
		}else{
			return "C:/works/campus/data-cms-backup/lc";
		}
	}

	public String getLandingPage() {
		return "trx/M01/A01T";
	}

	public int getPortNumber() {
		// TODO Auto-generated method stub
		return 8087;
	}

}
