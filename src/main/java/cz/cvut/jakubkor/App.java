package cz.cvut.jakubkor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        System.out.println("test");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Logger logger = (Logger)context.getBean("logger");
        logger.log("test log", Level.ERROR);
    }

}
