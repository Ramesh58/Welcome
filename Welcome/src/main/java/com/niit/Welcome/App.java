package com.niit.Welcome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new FileSystemXmlApplicationContext("Beans.xml");
        WelcomeMessage messageBean=(WelcomeMessage)context.getBean("WelcomeMessageBean");
        System.out.println(messageBean.getMessage());
        
        Car car=(Car)context.getBean("carObj");
        System.out.println(car.getColor());
        
    }
}
