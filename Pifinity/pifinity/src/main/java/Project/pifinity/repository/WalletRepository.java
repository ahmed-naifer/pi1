package Project.pifinity.repository;

import Project.pifinity.entity.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WalletRepository extends CrudRepository <Wallet,Long> {
}
