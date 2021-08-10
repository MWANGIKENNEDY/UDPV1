package com.user.data.portal.user.data.portal.services;

import com.user.data.portal.user.data.portal.models.Tickets;

import java.util.List;

public interface TicketsService {
    public List<Tickets> getAllTickets();
    public void createTicket(Tickets tickets);
    public void updateTicket(Tickets tickets);
    public void deleteTicket(Long id);
}
