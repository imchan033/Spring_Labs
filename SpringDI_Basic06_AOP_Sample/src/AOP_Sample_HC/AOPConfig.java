package AOP_Sample_HC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
  @Bean
  public SwitchAspect switchLog() {
    return new SwitchAspect();
  }
  
  @Bean
  public Switch switchOn() {
    return new SwitchOn();
  }
  
  @Bean
  public Switch switchOff() {
    return new SwitchOff();
  }

}
