package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.config.AppConfig;
import demo.util.Credentails;
import springprograms.Account;

public class MainApp 
{
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        Credentails credentials = context.getBean(Credentails.class);
        credentials.displayCredentials();

       
        
        
    }

}
