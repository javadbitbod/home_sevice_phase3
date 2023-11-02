package ir.maktab.hwfinal03.ripository;

import ir.maktab.hwfinal03.entity.Order;
import ir.maktab.hwfinal03.entity.SubService;
import ir.maktab.hwfinal03.entity.enumeration.OrderStatus;
import ir.maktab.hwfinal03.entity.users.Client;
import ir.maktab.hwfinal03.entity.users.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query("select o from Order o where o.client.id = :id")
    List<Order> findOrdersByClientId(Long id);

    @Query("select o from Order o where o.expert.id = :id")
    List<Order> findOrdersByExpertId(Long id);

    @Query("select o from Order o where o.subService.id = :id")
    List<Order> findOrdersBySubServiceId(Long id);

    List<Order> findOrdersByClient(Client client);

    List<Order> findOrdersByExpert(Expert expert);

    List<Order> findOrdersBySubService(SubService subService);

    List<Order> findOrdersByOrderStatus(OrderStatus orderStatus);

    @Query("select count(o.client.id) from Order o where o.client.id= :id")
    int countOrdersByClientId(Long id);

    @Query("select count(o.client.email) from Order o where o.client.email= :email")
    Integer countOrdersByClientEmail(String email);
}
