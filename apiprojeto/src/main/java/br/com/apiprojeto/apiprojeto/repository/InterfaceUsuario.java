package br.com.apiprojeto.apiprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiprojeto.apiprojeto.entity.Usuario;

public interface InterfaceUsuario extends JpaRepository<Usuario, Integer> {

}
