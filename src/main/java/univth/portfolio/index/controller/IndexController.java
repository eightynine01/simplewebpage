package univth.portfolio.index.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 1:19
 */
@Controller
@Slf4j
public class IndexController {
    @GetMapping("/test")
    public String test(){
        log.info("test","");
        return "/test";
    }
}
