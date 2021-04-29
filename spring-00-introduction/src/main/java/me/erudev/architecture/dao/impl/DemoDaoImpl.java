package me.erudev.architecture.dao.impl;

import me.erudev.architecture.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2021/4/29 16:18
 */
public class DemoDaoImpl implements DemoDao {


    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
