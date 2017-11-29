package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:soundsystem/app.properties")

public class CDPlayerConfig {

    @Bean
    public MediaPlayer getCdPlayer(){
        return new CDPlayer(getSgtPeppers());
    }

    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc(){
        return new BlankDisc(environment.getProperty("disc.title")
                ,environment.getProperty("disc.artist"));
    }

    @Bean
    public SgtPeppers getSgtPeppers(){
        return new SgtPeppers();
    }

}
