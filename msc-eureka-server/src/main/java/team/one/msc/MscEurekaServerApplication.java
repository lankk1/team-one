package team.one.msc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 表示开启Eureka Server功能
 */
@EnableEurekaServer
@SpringBootApplication
public class MscEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscEurekaServerApplication.class, args);
    }

}
