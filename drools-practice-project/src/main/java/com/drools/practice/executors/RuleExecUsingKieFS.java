package com.drools.practice.executors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.builder.model.KieSessionModel;
import org.kie.api.builder.model.KieSessionModel.KieSessionType;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.conf.ClockTypeOption;

public class RuleExecUsingKieFS {

	public static void main(String[] args) throws FileNotFoundException {

		KieServices kieServices = KieServices.Factory.get();
		
		KieModuleModel kieModuleModel = kieServices.newKieModuleModel();
		
		KieBaseModel kieBaseModel1 = kieModuleModel.newKieBaseModel("KBase1")
				.setDefault(true)
				.setEqualsBehavior(EqualityBehaviorOption.EQUALITY)
				.setEventProcessingMode(EventProcessingOption.STREAM);
		
		KieSessionModel kieSessionModel1 = kieBaseModel1.newKieSessionModel("KSession1")
				.setDefault(true)
				.setType(KieSessionType.STATEFUL)
				.setClockType(ClockTypeOption.get("realtime"));
		
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		
		kieFileSystem.writeKModuleXML(kieModuleModel.toXML());
		
		
		  InputStream inputStream = new
		  FileInputStream("/home/pbarate/Desktop/Sample1.xls");
		  
		  kieFileSystem.write("src/main/resources/com/drools/practice/rules/ruleSet1.drl", "package com.drools.practice.rules import com.drools.practice.facts.Person; rule &quot;Good Morning&quot; when person:Person(time gt;= 0, time &lt; 12) then person.setGreet(&quot;Good Morning &quot;+ person.getName()); end" );
						
		  kieFileSystem.write("src/main/resources/com/drools/practice/dtables/Sample1.xls",
							  kieServices.getResources().newInputStreamResource(inputStream));
							 
		 
		  System.out.println("Exiting from the RuleExecUsingKieFS");
		 
	}

}
