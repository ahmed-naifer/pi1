package Project.pifinity.repository;

import Project.pifinity.entity.Investment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvestmentRepo extends CrudRepository<Investment,Long> {
}
