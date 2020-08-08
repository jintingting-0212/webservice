package com.huawei.demo_webservice.service.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;

import org.apache.cxf.bus.spring.SpringBus;

import org.apache.cxf.jaxws.EndpointImpl;

import org.apache.cxf.transport.servlet.CXFServlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.huawei.demo_webservice.service.IService;

import org.springframework.beans.factory.annotation.Autowired;





@Configuration

public class WebServiceConfig {

 

@Autowired

private IService service;

 

@Bean("cxfServletRegistration")

public ServletRegistrationBean<CXFServlet> dispatcherServlet() {

// 注册servlet 拦截/webServiceDemo开头的请求。

// 将默认的“/services/*”修改为“/webServiceDemo/*”。
	

	return new ServletRegistrationBean<CXFServlet>(new CXFServlet(),"/webServiceDemo/*");
	}


	@Bean(name = Bus.DEFAULT_BUS_ID)

	public SpringBus springBus() {

		return new SpringBus();

	}


	@Bean

	public Endpoint endpoint() {

		EndpointImpl endpoint = new EndpointImpl(springBus(), service);
		endpoint.publish("/api");	// 这里相当于把接口发布在了路径/services/api下,WSDL文档路径为http://localhost:8080/webServiceDemo/api?wsdl
		return	endpoint;

	}

}