package com.niit.bej;

import com.niit.bej.bean.ConfigBean;
import com.niit.bej.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
        Movie movie1 = applicationContext.getBean(Movie.class);
        System.out.println(movie1.getMovieName());
    }
}
