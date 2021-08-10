package com.user.data.portal.user.data.portal.services;

import com.user.data.portal.user.data.portal.models.Tickets;
import com.user.data.portal.user.data.portal.repository.TicketsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsServiceImplementation implements TicketsService {

    private TicketsRepository ticketsRepository;

    public TicketsServiceImplementation(TicketsRepository ticketsRepository) {
        super();
        this.ticketsRepository = ticketsRepository;
    }

    @Override
    public List<Tickets> getAllTickets() {
        return ticketsRepository.findAll();
    }

    @Override
    public void createTicket(Tickets tickets) {

    }

    @Override
    public void updateTicket(Tickets tickets) {

    }

    @Override
    public void deleteTicket(Long id) {

    }
}
