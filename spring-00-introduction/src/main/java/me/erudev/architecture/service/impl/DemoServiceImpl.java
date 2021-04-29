package me.erudev.architecture.service.impl;

import me.erudev.architecture.dao.DemoDao;
import me.erudev.architecture.factory.BeanFactory;
import me.erudev.architecture.service.DemoService;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/29 16:19
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    public DemoServiceImpl() throws ClassNotFoundException {
        for (int i = 0; i < 10; i++) {
            DemoDao demoDao = (DemoDao)BeanFactory.getBean("demoDao");
            System.out.println(demoDao);
        }
    }

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
