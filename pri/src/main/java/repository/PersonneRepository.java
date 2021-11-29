package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long>{
	
}
