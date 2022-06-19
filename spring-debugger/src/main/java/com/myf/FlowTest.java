package com.myf;

import com.myf.entity.Apple;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zgx
 * @date 2022年05月15日 01:33
 */
public class FlowTest {
	public static void main(String[] args) {
//		MyClassPathXmlApplicationContext xmlApplicationContext = new MyClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-${user}.xml");
		Apple bean = applicationContext.getBean(Apple.class);
		System.out.println(bean.getName());
	}
}
