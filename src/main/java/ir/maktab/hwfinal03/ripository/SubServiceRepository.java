package ir.maktab.hwfinal03.ripository;

import ir.maktab.hwfinal03.entity.Services;
import ir.maktab.hwfinal03.entity.SubService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface SubServiceRepository extends JpaRepository<SubService,Long> {
    Optional<SubService> findByDescriptionAndService(String description, Services service);

}
