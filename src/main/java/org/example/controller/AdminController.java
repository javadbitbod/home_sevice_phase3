package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.AdminService;
import org.example.service.ClientService;
import org.example.service.ExpertService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final ExpertService expertService;
    private final ClientService clientService;
}
