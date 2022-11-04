package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t01.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S04T01N01SanmiguelalonsoGonzaloApplication {

    public static void main(String[] args) {
        SpringApplication.run(S04T01N01SanmiguelalonsoGonzaloApplication.class, args);
        System.out.println("The App is working...");
        System.out.println("- Click below to check them or open your browser and try - ");
        System.out.println("http://localhost:9000/HelloWorld?nom=Manolo");;
        System.out.println("http://localhost:9000/HelloWorld");
        System.out.println("http://localhost:9000/HelloWorld2/Macarena");
        System.out.println("http://localhost:9000/HelloWorld2");
    }

}
