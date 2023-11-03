package org.example.impl;

import org.example.dto.ServiceDTO;
import org.example.service.AdminService;
import org.example.service.ServiceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ServiceServiceImplTest {

    @Autowired
    private ServiceService serviceService;
    @Autowired
    private AdminService adminService;

    @Test
    void findServiceByName() {
        adminService.addService(new ServiceDTO("testServiceForService"));
        assertNotNull(serviceService.findServiceByName("testServiceForService"));
    }

}