package com.rpglojas.repository.security;

import com.rpglojas.models.security.Cargo;
import com.rpglojas.models.security.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

    Optional<Cargo> findByNome(String name);

}
