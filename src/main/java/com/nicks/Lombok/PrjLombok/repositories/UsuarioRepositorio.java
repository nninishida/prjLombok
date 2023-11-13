package com.nicks.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicks.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
