package com.charan.learnspringframework;

import com.charan.learnspringframework.game.GamingConsole;
import com.charan.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new SuperContraGame();
    }
}