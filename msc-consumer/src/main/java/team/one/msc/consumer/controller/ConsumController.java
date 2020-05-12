package team.one.msc.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * 简单测试
     *
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public String getId(@PathVariable int id) {
        log.info("ConsumController.getId,入参id={}", id);
        return "收到：" + id;
    }

}
