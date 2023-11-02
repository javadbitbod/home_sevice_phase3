package ir.maktab.hwfinal03.ripository;


import ir.maktab.hwfinal03.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServicesRepository extends JpaRepository<Services,Long> {
    Optional<Services> findServiceByName(String name);

}

