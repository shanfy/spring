package com.lagou.edu;

/**
 * @author 应癫
 */
public class LogUtils {

	public void beforeMethod() {
		System.out.println("前置通知");
	}
	public void afterMethod() {
		System.out.println("后置通知");
	}
}
