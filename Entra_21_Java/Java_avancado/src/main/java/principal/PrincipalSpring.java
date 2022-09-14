package principal;

import controller.PesquisadorController;
import controller.VacinaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses = {PesquisadorController.class, VacinaController.class})
public class PrincipalSpring {


    public static void main(String[] args) {
        SpringApplication.run(PrincipalSpring.class, args);
    }


}
