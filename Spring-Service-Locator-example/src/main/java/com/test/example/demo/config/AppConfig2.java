package com.test.example.demo.config;


import com.test.example.demo.service.*;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public FactoryBean<?> getBean() {
		ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(PaymentRegistry.class);
		return bean;
	}

	@Bean
	public PaymentService getGooglePay() {
		return new GooglePay();
	}

	@Bean
	public PaymentService getVisaPay() {
		return new VisaPay();
	}

	@Bean
	public PaymentService gePaytm() {
		return new Paytm();
	}

	@Bean
	public PaymentSelector gePaymentSelector() {
		PaymentService[] serviceArray = {gePaytm(),getVisaPay(),getGooglePay()};
		PaymentSelector paymentSelector = new PaymentSelector(serviceArray);
		return paymentSelector;
	}

}
