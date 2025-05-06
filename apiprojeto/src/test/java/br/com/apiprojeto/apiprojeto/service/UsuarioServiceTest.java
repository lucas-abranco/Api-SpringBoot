package br.com.apiprojeto.apiprojeto.service;

import br.com.apiprojeto.apiprojeto.entity.Usuario;
import br.com.apiprojeto.apiprojeto.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @InjectMocks
    private UsuarioService usuarioService;

    @Mock
    private UsuarioRepository usuarioRepository;

    @Test
    public void deveRetornar() {

        Usuario usuario = new Usuario("lucas@email.com", 1, "lucas", "senha2", "215587948");

        Mockito.when(usuarioRepository.findAll()).thenReturn(Collections.singletonList(usuario));

        List<Usuario> usuarios = usuarioService.listarUsuario();

        System.out.println(usuarios);

        assertEquals(2, usuarios.size());
    }
}