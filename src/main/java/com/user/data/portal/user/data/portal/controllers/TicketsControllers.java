package com.user.data.portal.user.data.portal.controllers;

import com.user.data.portal.user.data.portal.services.TicketsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TicketsControllers {

    private TicketsService ticketsService;

    public TicketsControllers(TicketsService ticketsService) {
        this.ticketsService = ticketsService;
    }

    @GetMapping(value = "/tickets")
    public String listStudents(Model model){
        model.addAttribute("tickets",ticketsService.getAllTickets());
        return "index";
    }

    @GetMapping(value = "/hello")
    public String test(Model model){
        model.addAttribute("tickets",ticketsService.getAllTickets());
        System.out.println("test1");
        return "fragments/footer :: tickets";
    }

}
