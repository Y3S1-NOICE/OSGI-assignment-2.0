package com.examgenerator.activator;

import com.examgenerator.service.ExamGeneratorServiceImpl;
import com.examgenerator.service.IExamGeneratorService;
import com.questionbank.service.IQuestionBankService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegisteration;
	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Exam Generator started!");
		serviceReference = context.getServiceReference(IQuestionBankService.class.getName());
		IQuestionBankService questionBankService = (IQuestionBankService)context.getService(serviceReference);
		
		IExamGeneratorService publisherExamGeneratorService = new ExamGeneratorServiceImpl(questionBankService);
		publishServiceRegisteration = context.registerService(IExamGeneratorService.class.getName(), publisherExamGeneratorService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Exam Generator stopped!");
		context.ungetService(serviceReference);
		publishServiceRegisteration.unregister();
	}


}
