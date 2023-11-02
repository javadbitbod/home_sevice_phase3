package org.example.ripository;


import org.example.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServicesRepository extends JpaRepository<Services,Long> {
    Optional<Services> findServiceByName(String name);

}

