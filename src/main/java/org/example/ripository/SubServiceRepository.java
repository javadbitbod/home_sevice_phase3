package org.example.ripository;

import org.example.entity.Services;
import org.example.entity.SubService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface SubServiceRepository extends JpaRepository<SubService,Long> {
    Optional<SubService> findByDescriptionAndService(String description, Services service);
    @Query("select s from SubService s join s.expertList e where e.id = :id")
    List<SubService> findByExpertId(Long id);

    @Query("select s from SubService s where s.service.id = :id")
    List<SubService> findSubServicesByServiceId(Long id);

    List<SubService> findSubServicesByService(Services service);

    Optional<SubService> findSubServiceByDescription(String description);

    List<SubService> findSubServicesByServiceName(String name);


}