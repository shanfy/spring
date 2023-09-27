package com.lagou.edu;

import org.springframework.beans.factory.FactoryBean;

public class B implements FactoryBean<A> {
	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}
}
