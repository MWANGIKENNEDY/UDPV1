package com.user.data.portal.user.data.portal.controllers;

import com.user.data.portal.user.data.portal.services.TicketsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketsControllers {

    private TicketsService ticketsService;

    public TicketsControllers(TicketsService ticketsService) {
        this.ticketsService = ticketsService;
    }

    @GetMapping(value = "/tickets")
    public String listStudents(){
        return "index";
    }
}
