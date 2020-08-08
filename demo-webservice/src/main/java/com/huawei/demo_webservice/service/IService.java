package com.huawei.demo_webservice.service;

import javax.jws.WebService;


@WebService(name="IService",targetNamespace="http://demo_webservice.huawei.com") // 命名空间，赋值一个有意义的http地址即可，不一定要写成包名倒序,只是写成包名倒序是一个约定俗成的习惯而已

public interface IService {

public String sayHello(String name);

}

