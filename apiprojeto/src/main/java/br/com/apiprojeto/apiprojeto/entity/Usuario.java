package br.com.apiprojeto.apiprojeto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

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

}
