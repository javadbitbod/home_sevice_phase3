package org.example.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.dto.ServiceDTO;
import org.example.dto.SubServiceDTO;
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
    @Transactional
    @PostMapping("/add-sub-service")
    public void addSubService(@RequestBody @Valid SubServiceDTO subServiceDTO) {
        adminService.addSubService(subServiceDTO);
    }
}