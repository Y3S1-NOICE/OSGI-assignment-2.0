package com.questionbank.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.questionbank.service.IQuestionBankService;
import com.questionbank.service.QuestionBankServiceImpl;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegisteration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Question Bank started!");
		
		IQuestionBankService publisherQuestionBankService = new QuestionBankServiceImpl();
		publishServiceRegisteration = context.registerService(IQuestionBankService.class.getName(), publisherQuestionBankService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Question bank publisher stopped!");
		publishServiceRegisteration.unregister();
	}
}
