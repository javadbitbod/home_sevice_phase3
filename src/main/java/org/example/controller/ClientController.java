package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.ClientDTO;
import org.example.dto.OrderDTO;
import org.example.service.*;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/edit-client-password/{clientId}/{newPassword}")
    public void editClientPassword(@PathVariable Long clientId,@PathVariable String newPassword) {
        clientService.editClientPassword(clientId, newPassword);
    }

    @PostMapping("/create-order")
    public void createOrder(@RequestBody OrderDTO orderDTO) {
        clientService.createOrder(orderDTO);
    }
    @PutMapping("/change-order-status-to-STARTED/{orderId}")
    public ResponseEntity<String> changeOrderStatusToStarted(@PathVariable Long orderId) {
        clientService.changeOrderStatusToStarted(orderId);
        return ResponseEntity.ok().body("Order status has been changed into STARTED.");
    }

    @PutMapping("/change-order-status-to-DONE/{orderId}")
    public ResponseEntity<String> changeOrderStatusToDone(@PathVariable Long orderId) {
        clientService.changeOrderStatusToDone(orderId);
        return ResponseEntity.ok().body("Order status has been changed into DONE");
    }
    @PutMapping("/pay-by-wallet/{orderId}/{clientId}")
    public ResponseEntity<String> payByWallet(@PathVariable Long orderId, @PathVariable Long clientId) {
        clientService.payByWallet(orderId, clientId);
        return ResponseEntity.ok().body("Payment operation successfully done.");
    }
}