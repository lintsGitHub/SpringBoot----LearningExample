package priv.lint.introducingpropertiesfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    Student student;
    @RequestMapping("/test")
    public @ResponseBody String  test(){
        System.out.println(student);
        return "ok";
    }
}
