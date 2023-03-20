package com.springDemo;

import com.springDemo.ICustomerDal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);

//        context.refresh(); // context değiştiği zaman projeyi yeniliyor
//        ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);

        ICustomerService customerService = context.getBean("service",ICustomerService.class);

        customerService.add();

    }
}