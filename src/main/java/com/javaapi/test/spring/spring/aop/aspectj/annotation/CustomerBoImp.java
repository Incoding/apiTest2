package com.javaapi.test.spring.spring.aop.aspectj.annotation;

import org.springframework.stereotype.Component;

@Component
public class CustomerBoImp  implements CustomerBo {
	@Override
	public void addCustomer() {
        if (true) {
            throw new RuntimeException();
        }
        System.out.println(CustomerBoImp.class.getSimpleName());
	}

	@Override
	public String addCustomerReturnValue() {
		return null;
	}

	@Override
	public void addCustomerThrowException() throws Exception {
	}

	@Override
	public void addCustomerAround(String name) {
	}

}
