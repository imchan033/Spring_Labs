package AOP_Sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		String configLocation = "AOP_Practice/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		Product product = context.getBean("tv",Product.class);
		product.Buy();
	}

}
