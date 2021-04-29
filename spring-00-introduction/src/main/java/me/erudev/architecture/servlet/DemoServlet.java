package me.erudev.architecture.servlet;

import me.erudev.architecture.dao.DemoDao;
import me.erudev.architecture.factory.BeanFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author pengfei.zhao
 * @date 2021/4/29 16:22
 */
@WebServlet(urlPatterns = "/demo")
public class DemoServlet extends HttpServlet {

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(demoDao.findAll().toString());
    }
}
