package com.telusko_springbootweb;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// The service method will be called whenever a request is sent from the browser to our service
//Tomcat default port is 8080
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("Service method called");
    }
}
