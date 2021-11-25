package com.mami.lc.config;

import com.mami.lc.api.AmountFormatter;
import com.mami.lc.api.CreditCardFormatter;
import com.mami.lc.api.PhoneFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.mami.lc.controllers")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneFormatter());
        registry.addFormatter(new CreditCardFormatter());
        registry.addFormatter(new AmountFormatter());
    }
}
