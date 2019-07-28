package com.drools.practice.executors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Assert;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.builder.model.KieSessionModel;
import org.kie.api.builder.model.KieSessionModel.KieSessionType;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
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
		
		
		kieServices.newKieBuilder(kieFileSystem).buildAll();
		
		KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
		
		KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem).buildAll();
		
		Assert.assertEquals(0, kieBuilder.getResults().getMessages(Message.Level.ERROR).size());
		
		
		  InputStream inputStream = new
		  FileInputStream("/home/pbarate/Desktop/Sample1.xls");
		  
		  kieFileSystem.write("src/main/resources/com/drools/practice/rules/ruleSet1.drl", "package com.drools.practice.rules import com.drools.practice.facts.Person; rule &quot;Good Morning&quot; when person:Person(time gt;= 0, time &lt; 12) then person.setGreet(&quot;Good Morning &quot;+ person.getName()); end" );
						
		  kieFileSystem.write("src/main/resources/com/drools/practice/dtables/Sample1.xls",
							  kieServices.getResources().newInputStreamResource(inputStream));
		  
		  InputStream drlInStream = new
				  FileInputStream("/home/pbarate/Desktop/GreetingRule.drl");
		  kieFileSystem.write("src/main/resources/com/drools/practice/rules/myDRL.txt", kieServices.getResources().newInputStreamResource(drlInStream).setResourceType(ResourceType.DRL));
							 
		  kieFileSystem.writeKModuleXML(kieModuleModel.toXML());
		 
		  System.out.println("Exiting from the RuleExecUsingKieFS");
		 
	}

}
