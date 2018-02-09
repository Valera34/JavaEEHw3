package AnikeeenkoHw3;

/**
 * Hello world!
 *
 */
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Information info = (Information) context.getBean("info");
        System.out.println(info.toString());
    }
}
