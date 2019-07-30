package com.epam.training.sportsbetting.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ViewConfig {

    @Bean
    public View view(){
        return new ViewImplement(new Input());
    }
}
