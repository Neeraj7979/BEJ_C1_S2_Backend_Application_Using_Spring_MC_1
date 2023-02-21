package com.niit.bej.bean;

import com.niit.bej.domain.Movie;
import org.springframework.context.annotation.Bean;

public class ConfigBean {
    @Bean
    public Movie getMovieDetails() {
        return new Movie("Avatar-2", "Action", 2.30, 2023);
    }

}
