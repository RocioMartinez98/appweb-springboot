package com.appwebspringboot.repository;
import com.appwebspringboot.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //estereotipo, hereda de @Component
public interface PersonaRepository extends JpaRepository<Persona,Long>{


}
