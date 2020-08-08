package com.huawei.demo_webservice.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.huawei.demo_webservice.service.IService;



@WebService(name="IService", // 必须与接口中指定的name一致

targetNamespace="http://demo_webservice.huawei.com",// 与接口中的命名空间一致

endpointInterface="com.huawei.demo_webservice.service.IService") // 接口地址，接口类全路径名称（包名+类名）


@Component

public class ServiceImpl implements IService {

@Override

public String sayHello(String name) {

return "Hello " + name;

}

}

