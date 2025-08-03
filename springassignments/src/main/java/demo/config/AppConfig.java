package demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("demo")
@PropertySource("classpath:datafile.properties")
public class AppConfig {

}
