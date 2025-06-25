package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller   // 아래의 클래스 Controller 라고 Annotation 을 이용해서 선언해 주는 것, 이렇게 작성하면 import org.springframework.stereotype.Controller; 이 자동으로 임포트 됨
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeeYou(Model model) {
        model.addAttribute("username", "유준성");
        return "greetings";     // 응답페이지 설졍 : templetes 안의 greetings.mustache를 찾아서 브라우저로 전송하는 기능
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname","jun seong");
        return "goodbye";
    }

}









