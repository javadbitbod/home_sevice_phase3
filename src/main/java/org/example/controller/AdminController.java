package org.example.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.dto.ServiceDTO;
import org.example.service.AdminService;
import org.example.service.ClientService;
import org.example.service.ExpertService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final ExpertService expertService;
    private final ClientService clientService;

    @PostMapping("/add-service")
    public void addService(@RequestBody @Valid ServiceDTO serviceDTO) {
        adminService.addService(serviceDTO);
    }
}
