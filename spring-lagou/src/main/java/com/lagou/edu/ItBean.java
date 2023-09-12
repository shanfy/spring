package com.lagou.edu;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 应癫
 * 不指定bean名称时，默认是类名首字母小写
 */
@Component
public class ItBean implements BeanNameAware {
	@Autowired
	private LagouBean lagouBean;

	public void setLagouBean(LagouBean lagouBean) {
		this.lagouBean = lagouBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("ItBean>>"+name);
	}
}
