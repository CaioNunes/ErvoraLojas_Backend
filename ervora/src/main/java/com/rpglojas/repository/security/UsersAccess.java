package com.rpglojas.repository.security;

import com.rpglojas.models.security.UserAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersAccess extends JpaRepository<UserAccess, Long> {
    boolean existsByToken(String token);
}
