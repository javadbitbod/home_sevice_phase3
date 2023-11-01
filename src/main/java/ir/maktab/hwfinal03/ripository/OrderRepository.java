package ir.maktab.hwfinal03.ripository;

import ir.maktab.hwfinal03.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
