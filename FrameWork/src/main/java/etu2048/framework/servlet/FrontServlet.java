package etu2048.framework.servlet;

import java.io.*;
import java.util.HashMap;

import etu2048.framework.Mapping;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/*")
public class FrontServlet extends HttpServlet {

    HashMap<String, Mapping> mappingUrls;

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpServletMapping m= request.getHttpServletMapping();
        PrintWriter out = response.getWriter();
        //out.println("<h1>" + request.getQueryString() + "</h1>");
        out.println("<h1>" + m.getMatchValue()+"</h1>");

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException ,ServletException {
        processRequest(request,response);
    }

    public void destroy() {
    }
}