package team.one.msc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MscProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscProviderApplication.class, args);
    }

}
