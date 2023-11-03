package org.example.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.dto.ServiceDTO;
import org.example.dto.SubServiceDTO;
import org.example.entity.users.enums.UserStatus;
import org.example.service.AdminService;
import org.example.service.ClientService;
import org.example.service.ExpertService;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/edit-sub-service/{id}/{newBasePrice}/{newDescription}")
    public void editSubService(@PathVariable Long id, @PathVariable double newBasePrice, @PathVariable String newDescription) {
        adminService.editSubService(id, newBasePrice, newDescription);
    }
    @PutMapping("/confirm-expert/{expertId}")
    public void confirmExpert(@PathVariable Long expertId){
        adminService.editExpertStatus(expertId, UserStatus.CONFIRMED);
    }
    @PostMapping("/add-expert-to-sub-service/{expertId}/{subServiceId}")
    public void addExpertToSubService(@PathVariable Long expertId, @PathVariable Long subServiceId) {
        adminService.addExpertToSubService(expertId, subServiceId);
    }
}
