package com.pfy;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {


    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf)
    {
    	return hemf.getSessionFactory();
    }

}