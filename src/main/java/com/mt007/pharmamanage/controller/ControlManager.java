package com.mt007.pharmamanage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlManager {
    @RequestMapping(value = "/ControlManager", method = RequestMethod.GET)
    public String rootmap() {
        return "Amar Server";
    }
}
