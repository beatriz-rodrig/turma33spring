package com.gen.gamesGeneration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo nome deve ter no mínimo 05 e no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "O atributo usuário não pode ser vazio")
	@Email(message = "O atributo usuário deve ser um email")
	private String usuario;

	@NotNull(message = "O atributo senha é obrigatório")
	@Size(min = 8, max=100, message = "O atributo senha deve ter no mínimo 8 caracteres")
	private String senha;


	// Primeiro método Construtor - Com os atributos
	public Usuario(long id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}

	// Segundo método Construtor - Sem os atributos
	public Usuario() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}



}
