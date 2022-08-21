package top.mofeideyu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.mofeideyu.spring.config.AppConfig;
import top.mofeideyu.spring.service.HelloService;

public class SpringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService bean = ac.getBean(HelloService.class);
		bean.hello();
	}
}
