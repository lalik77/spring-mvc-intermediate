package com.mami.lc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] classes = {LoveCalculatorAppConfig.class};
        return classes;
    }

    @Override
    protected String[] getServletMappings() {

        String[] arr = {"/"};
        return arr;
    }
}
