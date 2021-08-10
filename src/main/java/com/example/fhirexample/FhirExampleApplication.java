package com.example.fhirexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

@SpringBootApplication
public class FhirExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FhirExampleApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean ServletRegisterationBean(){
        ServletRegistrationBean registeration = new ServletRegistrationBean(new SimpleRestfulServer(),"/*");
        registeration.setName("FhirServlet");
        return registeration;
    }

}
