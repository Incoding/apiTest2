package com.javaapi.test.spring.spring.custom.customlog.handler;



import com.javaapi.test.spring.spring.custom.customlog.enums.ChildNameEnum;
import com.javaapi.test.spring.spring.custom.customlog.enums.ServiceNameEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface CustomLogHandler {

    ServiceNameEnum serviceName();

    ChildNameEnum childName();

}
