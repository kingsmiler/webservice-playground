package org.xman.ws.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "servlet1",
        urlPatterns = {"/s1", "/s1/*"},
        loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "msg", value = "hello world")
        })
public class Servlet1 extends HttpServlet {
    private String msg;

    public Servlet1() {
        System.out.println("load on startup");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        msg = this.getInitParameter("msg");

        System.out.println("init=========");
    }

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(msg);
        System.out.println(msg);
    }
}
