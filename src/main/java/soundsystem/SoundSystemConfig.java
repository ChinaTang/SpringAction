package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:blankConfig.xml")
public class SoundSystemConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
