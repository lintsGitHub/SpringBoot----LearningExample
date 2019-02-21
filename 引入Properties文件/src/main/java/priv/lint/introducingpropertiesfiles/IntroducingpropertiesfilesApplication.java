package priv.lint.introducingpropertiesfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Student.class)
public class IntroducingpropertiesfilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroducingpropertiesfilesApplication.class, args);
    }

}
