package com.epam.training.sportsbetting;

import com.epam.training.sportsbetting.service.SportBettingServiceConfig;
import com.epam.training.sportsbetting.service.SportsBettingService;
import com.epam.training.sportsbetting.ui.Input;
import com.epam.training.sportsbetting.ui.View;
import com.epam.training.sportsbetting.ui.ViewConfig;
import org.springframework.context.annotation.*;

import javax.inject.Inject;

@Configuration
@Import({SportBettingServiceConfig.class, ViewConfig.class})
public class AppConfig {

    @Inject
    private SportsBettingService sportsBettingService;

    @Inject
    private View view;


    @Bean
    @Primary
    public App app(){
        return new App(view,sportsBettingService,input());
    }

    @Bean
    @Lazy
    public Input input(){
        return new Input();
    }

}
