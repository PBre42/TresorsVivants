package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Correspondance;

@Repository
public interface CorrespondanceRepository extends JpaRepository<Correspondance,Long>{

}
