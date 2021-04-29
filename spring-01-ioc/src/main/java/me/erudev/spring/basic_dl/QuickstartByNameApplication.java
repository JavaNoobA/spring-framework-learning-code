package me.erudev.spring.basic_dl;

import me.erudev.spring.basic_dl.person.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengfei.zhao
 * @date 2021/4/29 16:56
 */
public class QuickstartByNameApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
    }
}
