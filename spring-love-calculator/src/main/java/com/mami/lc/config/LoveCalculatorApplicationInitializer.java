package com.mami.lc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.logging.Logger;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {


        Logger logger = Logger.getLogger(LoveCalculatorApplicationInitializer.class.getName());
        logger.info("\n =======================================> message from onStartup method");


        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
        webApplicationContext.setConfigLocations("classpath:/app-config.xml");

        //create a dispatcher servlet object

        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // register the dispatcher servlet with yhe servlet context object

        ServletRegistration.Dynamic myDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);

        // load on startup like in xml

        myDispatcherServlet.setLoadOnStartup(1);

        //url mapping
        myDispatcherServlet.addMapping("/mywebsite.com/*");




    }
}
