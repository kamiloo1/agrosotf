package com.example.agrosoft1.crud.repository;

import com.example.agrosoft1.crud.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Buscar usuario por email
    Optional<Usuario> findByEmail(String email);

    // Buscar usuario por email y contraseña
    Usuario findByEmailAndContrasena(String email, String contrasena);
}
