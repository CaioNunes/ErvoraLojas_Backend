package com.rpglojas.service.security;

import com.rpglojas.config.UserPrincipal;
import com.rpglojas.models.security.Usuario;
import com.rpglojas.repository.security.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = repository.findByNomeOrEmail(username, username).orElseThrow(
                () -> new UsernameNotFoundException("User not found with username or email : " + username));

        return UserPrincipal.create(usuario);
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        return UserPrincipal.create(repository.findById(id)
                .orElseThrow( () -> new UsernameNotFoundException("User not found with id: " + id)));
    }
}
