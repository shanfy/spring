import com.lagou.edu.A;
import com.lagou.edu.B;
import com.lagou.edu.LagouBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @Author 应癫
 */
public class IocTest {

	/**
	 *  Ioc 容器源码分析基础案例
	 */
	@Test
	public void testIoC() {
		// ApplicationContext 是容器的高级接口，BeanFacotry是基础容器（顶级容器/根容器，规范了/定义了容器的基础行为）
		// ApplicationContext：Spring应用上下文，官方称之为
		// IoC容器（错误的认识：容器就是map而已；准确来说，map是ioc容器的一个成员，
		// 叫做单例池, singletonObjects,容器是一组组件和过程的集合，包括BeanFactory、单例池、BeanPostProcessor等以及之间的协作流程）

		/**
		 * Ioc容器创建管理Bean对象的，Spring Bean是有生命周期的
		 * 构造器执行、初始化方法执行、Bean后置处理器的before/after方法、：AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * Bean工厂后置处理器初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * Bean后置处理器初始化：AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//可以在创建applicationContext对象的时候将refresh设置为false,然后手动调用刷新容器
		// applicationContext.refresh();

		//LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
		// UserConfiguration.InnerUser lagouBean = applicationContext.getBean(UserConfiguration.InnerUser.class);
		//System.out.println(lagouBean);

		A a = applicationContext.getBean(A.class);
		System.out.println(a.getB());

		B b = applicationContext.getBean(B.class);
		System.out.println(b.getA());
		//System.out.println(applicationContext.getBean(A.class));
		//System.out.println(applicationContext.getBean(B.class));
	}



	/**
	 *  Ioc 容器源码分析基础案例
	 */
	@Test
	public void testAOP() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
		lagouBean.print();
	}

	@Test
	public void testSystem(){
		Map properties = System.getProperties();
		Map getenv = System.getenv();
		System.out.println(properties);
	}
}
