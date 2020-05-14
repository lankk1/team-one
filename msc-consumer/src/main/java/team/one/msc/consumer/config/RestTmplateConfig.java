package team.one.msc.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lankk on 2020/5/14.
 *
 * @author lankk
 * @date 2020/5/14
 */
@Configuration
public class RestTmplateConfig {

    /**
     * 注解 @Bean 表示这是由spring管理的类，返回值 RestTemplate 就是要管理的类，方法名 restTemplate 是类的id
     * <p>
     * 和下面在xml文件的配置相同
     * <bean id="restTemplate" class="org.springframework.web.client.RestTemplate"/>
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
