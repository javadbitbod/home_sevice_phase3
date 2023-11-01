package ir.maktab.hwfinal03.ripository;

import ir.maktab.hwfinal03.entity.Offers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offers,Long> {
}
