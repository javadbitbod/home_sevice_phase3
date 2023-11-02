package org.example.repository;


import org.example.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServicesRepository extends JpaRepository<Service,Long> {
    Optional<Service> findServiceByName(String name);

}

