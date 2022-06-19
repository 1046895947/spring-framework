package com.myf;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zgx
 * @date 2022年05月15日 20:42
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext(String... configLocations){
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
		// 指定必须存在的属性，在主流程调用initPropertySources的地方后面会调用验证参数存在的方法
		getEnvironment().setRequiredProperties("user.name");
		// 往systemProperties中添加属性
		getEnvironment().getSystemProperties().put("myf","myf");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
