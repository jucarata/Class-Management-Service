package co.edu.icesi.persistence.repository;

import co.edu.icesi.persistence.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Classes,Integer> {
}