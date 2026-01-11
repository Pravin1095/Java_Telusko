package com.telusko_springbootweb;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {

        //We need to strart the tomcat server and also keep it running with
        //await so that browser sends a request and servlet's service method will
        //be called
        
        Tomcat tomcat = new Tomcat();
        tomcat.start();
        tomcat.getServer().await();
        System.out.println( "Hello World!" );
    }
}
