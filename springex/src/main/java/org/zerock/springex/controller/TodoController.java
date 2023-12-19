package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.springex.dto.TodoDTO;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    /*
    * TodoController의 @RequestMapping의 value값은 "/to\do"이고
    * list()는 /list 이므로 최종 경로는 /to\do/list가 된다.*/
    @RequestMapping("/list")
    public void list(){
        log.info("todo list.....");
    }

    //@RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet(){
        log.info("todo register.......");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO){
        log.info("POST todo register........");
        log.info(todoDTO);
    }
}
