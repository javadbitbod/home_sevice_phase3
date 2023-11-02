package org.example.ripository;


import org.example.entity.Order;
import org.example.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {



    Optional<Score> findScoreByOrder(Order order);
}
