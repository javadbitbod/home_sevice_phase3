package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.ExpertDTO;
import org.example.dto.OfferDTO;
import org.example.dto.OrderDTO;
import org.example.entity.enums.OrderStatus;
import org.example.service.ExpertService;
import org.example.service.OfferService;
import org.example.service.OrderService;
import org.example.service.SubServiceService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/expert")
@RequiredArgsConstructor
public class ExpertController {

    private final ExpertService expertService;
    private final OrderService orderService;
    private final SubServiceService subServiceService;
    private final OfferService offerService;

    @PostMapping("/expert-signup")
    public void signup(@RequestBody ExpertDTO expertDTO) {
        try {
            expertService.expertSignUp(expertDTO);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/create-offer")
    public void createOffer(@RequestBody OfferDTO offerDTO) {
        expertService.createOffer(offerDTO);
    }
    @GetMapping("/show-WAITING-orders")
    public List<OrderDTO> findWaitingOrders(){
        return expertService.findOrdersByOrderStatus(OrderStatus.WAITING_FOR_EXPERT_OFFER);
    }
    @GetMapping("/show-expert-score/{id}")
    public int showExpertScore(@PathVariable Long id){
        return expertService.findById(id).getScore();
    }
}