package com.rpglojas.repository.security;

import com.rpglojas.models.security.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findUsuarioById(Long id);

    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByNomeOrEmail(String nome, String email);

    List<Usuario> findByIdIn(List<Long> userIds);

    Optional<Usuario> findByNome(String nome);

    boolean existsByEmail(String email);

    Optional<Long> countBy();
}
