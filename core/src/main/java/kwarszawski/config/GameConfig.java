package kwarszawski.config;

import kwarszawski.GuessCount;
import kwarszawski.MaxNumber;
import kwarszawski.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "kwarszawski")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:80}")
    private int maxNumber;

    @Value("${game.minNumber:20}")
    private int minNumber;

    @Value("${game.guessCount:8}")
    private int guessCount;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
