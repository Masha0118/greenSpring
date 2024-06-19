package polymorphism;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

public class BeanFactory {
	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTv();
		} else if (beanName.equals("lg")) {
			return new LgTv();
		}
		return null;
	}
}
