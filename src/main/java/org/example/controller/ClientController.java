package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.ClientDTO;
import org.example.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final OrderService orderService;
    private final OfferService offerService;
    private final ServiceService serviceService;
    private final SubServiceService subServiceService;
    private final WalletService walletService;

    @PostMapping("/client-signup")
    @ResponseBody
    public void signUp(@RequestBody ClientDTO clientDTO) {
        clientService.clientSignUp(clientDTO);
    }
}