package com.lagou.edu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author 应癫
 * @create 2019/12/3 11:46
 */
// @Component("LagouBean")
public class LagouBean implements BeanNameAware, InitializingBean,
		ApplicationContextAware {

/*	@Autowired
	private ItBean itBean;*/

	@Autowired
	private Map<String, Object> maps;
/*
	public void setItBean(ItBean itBean) {
		this.itBean = itBean;
	}*/

	/**
	 * 构造函数
	 */
	public LagouBean(){
		System.out.println("LagouBean 构造器...");
	}


	/**
	 * InitializingBean 接口实现
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LagouBean afterPropertiesSet...");
	}

	public void print() {
		System.out.println("print方法业务逻辑执行");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext....");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName....");
	}
	public void initMethod(){
		System.out.println("initMethod......");
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
}
