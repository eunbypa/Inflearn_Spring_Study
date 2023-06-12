package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
// 우선순위
// Controller에 매핑되는 것을 탐색하여 있으면 실행
// 이 경우 static은 무시됨
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
