package team.one.msc.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lankk on 2020/5/12.
 *
 * @author lankk
 * @date 2020/5/12
 */
@Slf4j
@RestController
@RequestMapping("/csm")
public class ConsumController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${provider.url}")
    private String providerUrl;

    /**
     * 简单测试
     *
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public String getId(@PathVariable int id) {
        log.info("ConsumController.getId,入参id={}", id);

        // 访问msc-provider
        String result = restTemplate.getForObject(providerUrl.concat("/pvd/test/").concat(String.valueOf(id)), String.class);
        log.info(result);
        return "传参：" + id + "，返回：" + result;
    }

}
