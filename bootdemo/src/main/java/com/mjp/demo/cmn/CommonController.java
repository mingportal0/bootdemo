package com.mjp.demo.cmn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CommonController {
	// 메인 페이지
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}

