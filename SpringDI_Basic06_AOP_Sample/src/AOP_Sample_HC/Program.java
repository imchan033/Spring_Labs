package AOP_Sample_HC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
    Switch sw = context.getBean("switchOff", Switch.class);
    sw.power();
  }
}