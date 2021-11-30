package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Entreprise;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,Long>{

}
