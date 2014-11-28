package MavenDemo;

import main.java.MavenDemo.BeanOne;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        System.out.println( "Hello World!" );
        BeanOne beanOne = new BeanOne();
        System.out.println("Before: " + beanOne.toString());
        try {
            BeanUtils.copyProperty(beanOne, "id", 1);
            BeanUtils.copyProperty(beanOne, "name", "kumar");
            BeanUtils.copyProperty(beanOne, "company", "thapovan");

            System.out.println("after: " + beanOne.toString());
            System.out.println("id: " + beanOne.m_iId);
            System.out.println("testing orion");
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
