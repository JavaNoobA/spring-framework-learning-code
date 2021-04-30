package me.erudev.spring.basic_dl.withanno;

import me.erudev.spring.basic_dl.withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author pengfei.zhao
 * @date 2021/4/30 9:52
 */
public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ": " + bean);
        });
    }
}
