package me.erudev.architecture.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author pengfei.zhao
 * @date 2021/4/29 16:34
 */
public class BeanFactory {
    private static Properties properties;

    private static Map<String, Object> cachedMap = new HashMap<>();

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error:" + e.getMessage());
        }
    }

    public static Object getBean(String beanName) {
        if (!cachedMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!cachedMap.containsKey(beanName)) {
                    try {
                        Class clazz = Class.forName(properties.getProperty(beanName));
                        Object obj = clazz.newInstance();
                        cachedMap.put(beanName, obj);
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return cachedMap.get(beanName);
    }
}
