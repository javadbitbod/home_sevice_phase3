package ir.maktab.hwfinal03.ripository;

import ir.maktab.hwfinal03.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
