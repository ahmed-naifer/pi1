package Project.pifinity.repository;

import Project.pifinity.entity.Returns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReturnRepo extends JpaRepository<Returns, Long> {
}
