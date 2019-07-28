package com.drools.practice.executors;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

public class RuleExecutor {

	public static void main(String[] args) {
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		
		
	}

}
