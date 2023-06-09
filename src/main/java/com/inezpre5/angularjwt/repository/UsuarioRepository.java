package com.inezpre5.angularjwt.repository;

import com.inezpre5.angularjwt.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByDocumento(String nu);
    boolean existsByDocumento(String nu);
    boolean existsByEmail(String email);
}
