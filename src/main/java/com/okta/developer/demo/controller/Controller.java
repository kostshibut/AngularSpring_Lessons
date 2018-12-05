package com.okta.developer.demo.controller;

import com.google.gson.Gson;
import com.okta.developer.demo.entity.LoginForm;
import org.springframework.web.bind.annotation.*;

@RestController
class Controller {

    @GetMapping("/users")
    public String getUser(){
        LoginForm employee= new LoginForm();
        String employeeJsonString = new Gson().toJson(employee.getPassword());
        return employeeJsonString;
    }

    @PostMapping("/request")
    public boolean postCon(
            @RequestBody LoginForm loginForm) {
        return true;
    }


}