package priv.lint.introducingpropertiesfiles;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
@ConfigurationProperties(prefix = "student")
@PropertySource("classpath:student.properties")
public class Student {
    int id;
    int age;
    String name;
    /*
    * 这里就出现了一个问题：
    * 在properties文件中传过来的值只有使用String类型来进行接收
    * */
}
