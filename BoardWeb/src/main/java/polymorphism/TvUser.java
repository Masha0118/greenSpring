package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {
	public static void main(String[] args) {
		
//		BeanFactory factory = new BeanFactory();
//		Tv tv = (Tv)factory.getBean(args[0]);
//		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
	}
}
