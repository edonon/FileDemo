package com.userweb.demo.action.controller;

import com.userweb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class indexCtrl {
    @Autowired
    @Qualifier("userImp")
    private UserService userImp;
    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        List lst = userImp.getAll();
        return  mav;
    }
}
