package com.rpglojas.service.security;

import com.rpglojas.enums.security.RoleName;
import com.rpglojas.models.security.Cargo;
import com.rpglojas.models.security.Usuario;
import com.rpglojas.repository.security.CargoRepository;
import com.rpglojas.repository.security.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CargoRepository cargoRepository;

    public List<Usuario> getUsuarios()  {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioByUsername(String username){
        return usuarioRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("Not found user with username: " + username));
    }

//    public void createUser() {
//        Usuario usuario = new Usuario();
//        usuario.setNome("Caio Nunes");
//        usuario.setEmail("caiofelipe147@gmail.com");
//        usuario.setSenha("teste123");
//        usuario.setCargo(new Cargo(RoleName.ROLE_ADMIN.getDescricao()));
//
//        usuarioRepository.save(usuario);
//    }
//
//    public void createCargo() {
//        Cargo cargo = new Cargo(RoleName.ROLE_ADMIN.getDescricao());
//
//        cargoRepository.save(cargo);
//    }
}
