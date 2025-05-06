package br.com.apiprojeto.apiprojeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "O nome é obrigatorio!!")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres!!")
    @Column(name = "nome_completo", length = 200, nullable = false)
    private String nome;

    @Email(message = "Insira um email válido!!")
    @NotBlank(message = "O email é obrigatorio")
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @NotBlank(message = "A Senha é obrigatorio!!")
    @Column(name = "senha", columnDefinition = "TEXT", nullable = false)
    private String senha;

    @NotBlank(message = "O telefone é obrigatorio!!")
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;

    public Usuario(String email, Integer id, String nome, String senha, String telefone) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
