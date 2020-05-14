package team.one.msc.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lankk on 2020/5/13.
 *
 * @author lankk
 * @date 2020/5/13
 */
@Slf4j
@RestController
@RequestMapping("/pvd")
public class ProviderController {
    /**
     * ${provider.unique.flag:NULL-flag} 表示 只有provider.unique.flag为null时，providerFlag 的值为 NULL-flag
     * ，否则 providerFlag 为 provider.unique.flag 的值
     */
    @Value("${provider.unique.flag:NULL-flag}")
    private String providerFlag;

估计快了就
    /***
     * 9800击破简历模板
     */
    @GetMapping("/test/{id}")
    public String testId(@PathVariable int id) {
        log.info("ProviderController.testId,id={}", id);
        return providerFlag + ",provide id=" + id;
    }
}
