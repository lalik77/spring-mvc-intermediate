package com.mami.lc.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.logging.Logger;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

       Logger logger = Logger.getLogger(LoveCalculatorApplicationInitializer.class.getName());
       logger.info("\n === > message from onStartup method");

    }
}
