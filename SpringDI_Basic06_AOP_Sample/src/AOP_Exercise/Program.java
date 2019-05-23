package AOP_Exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
    Forecast forecast = ctx.getBean("cloudForecast", Forecast.class);
    forecast.weatherTomorrow();
  }
}
