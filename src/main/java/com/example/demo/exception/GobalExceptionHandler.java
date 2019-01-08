package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = "com.example.demo.controller")
public class GobalExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public String exception1(HttpServletRequest request,Exception ex,Object handler){

        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
        System.out.println("ggg");
        System.out.println("jjj");
        return ex.getMessage();

        //System.out.println("ggg");
    }


}
