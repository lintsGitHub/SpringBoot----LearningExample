package priv.lint.introducingpropertiesfiles;



import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    private Student student;
    @org.junit.Test
    public void test(){
        System.out.println(student);
    }

}
