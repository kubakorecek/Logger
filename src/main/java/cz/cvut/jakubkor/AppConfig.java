package cz.cvut.jakubkor;

import cz.cvut.jakubkor.service.LoggerService;
import cz.cvut.jakubkor.service.SlackService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public  Logger logger(){
        return new Logger(loggerService());
    }

    @Bean
    public LoggerService loggerService(){
        return new SlackService();
    }

}
