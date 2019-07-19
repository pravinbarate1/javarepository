package com.sample.executor;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.PackageBuilderResults;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

import com.sample.facts.Person;


public class GreetTest {

	public static void main(String[] args) {
		
		GreetTest greetTest = new GreetTest();
		greetTest.executeRules();

	}
	
	public void executeRules() {
		
		
		String ruleFile = "src/main/resources/com/sample/rules/GreetingRule.drl";
		 
		File file = new File(ruleFile);

		/*
		 * InputStream inputStream = getClass().getResourceAsStream(ruleFile);
		 * 
		 * Reader reader = new InputStreamReader(inputStream);
		 */
		
		KieServices kieServices = KieServices.Factory.get();
		
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		
		kieFileSystem.write(ResourceFactory.newFileResource(file));
		
		KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem).buildAll();
		
		KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
		
		KieSession kieSession = kieContainer.newKieSession();
		
		Person p = new Person();
		p.setName("Pravin");
		p.setTime(12);
		
		kieSession.insert(p);
		
		kieSession.fireAllRules();
		
		System.out.println(p.getGreet());
		
		 
	}

}
