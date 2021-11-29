package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Competence;

@Repository
public interface CompetenceRepository extends JpaRepository<Competence,Long>{

}
