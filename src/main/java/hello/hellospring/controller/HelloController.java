package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    /**
     * 사용자가 http://localhost:8080/hello로 접근하면 톰캣 서버가 GetMapping 되어 있는 hello 메서드를 찾아 실행한다
     * 메서드가 문자열로 반환하면 viewResolever가 템플릿 엔진을 처리하여 사용자에게 보여주게 되는 것이다
     */
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello";
    }
}
