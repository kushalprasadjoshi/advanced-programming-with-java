package chap06web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LifeCycleServlet extends HttpServlet{
    public void init(ServletConfig config) {
        System.out.println("Servlet Initialized");
    }

    public void service(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("Service called");
    }

    public void destroy() {
        System.out.println("Destroy called.");
    }
}


