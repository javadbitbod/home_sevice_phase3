package ir.maktab.hwfinal03.ripository;

import ir.maktab.hwfinal03.entity.Offer;
import ir.maktab.hwfinal03.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OfferRepository extends JpaRepository<Offer,Long> {
    List<Offer> findOffersByOrder(Order order);

    @Query("select o from Offer o where o.order.id = :id")
    List<Offer> findOffersByOrderId(Long id);

    @Query("select o from Offer o where o.order.id = :id and o.isAccepted = true")
    Optional<Offer> findAcceptedOfferByOrderId(Long id);

    @Query("select o from Offer o where o.expert.id = :id and o.isAccepted = true")
    List<Offer> findAcceptedOffersByExpertId(Long id);
}
