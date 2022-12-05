package yogiyodelivery.common;


import yogiyodelivery.FrontappApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FrontappApplication.class })
public class CucumberSpingConfiguration {
    
}
