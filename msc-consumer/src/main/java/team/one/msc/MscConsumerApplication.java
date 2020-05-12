package team.one.msc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableEurekaClient 表示本项目是一个Eureka Client实例
 */
@EnableEurekaClient
@SpringBootApplication
public class MscConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscConsumerApplication.class, args);
    }

}
