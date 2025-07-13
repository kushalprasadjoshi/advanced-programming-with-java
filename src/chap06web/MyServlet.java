package chap06web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;

@WebServlet("/demo")  // This maps the servlet to URL /demo
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); // Optional, but recommended
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello from MyServlet</h1>");
    }
}
