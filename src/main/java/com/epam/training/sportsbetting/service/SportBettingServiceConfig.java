package com.epam.training.sportsbetting.service;

import com.epam.training.sportsbetting.ui.Input;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportBettingServiceConfig {

    @Bean
    public SportsBettingService sportsBettingService(){
        return new SportsBettingImplement(new Input(),new GameData());
    }


}
