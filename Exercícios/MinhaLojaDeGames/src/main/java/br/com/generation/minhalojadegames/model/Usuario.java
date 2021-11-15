package br.com.generation.minhalojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo nome não pode fica em branco.")
	@Size(min = 2, max = 100, message = "O atributo nome é no mínimo 2 e no máximo 100 caracteres.")
	private String nome;
	
	@NotBlank(message = "O atributo usuário não pode fica em branco.")
	@Size(min = 2, max = 100, message = "O atributo usuário é no mínimo 2 e no máximo 100 caracteres.")
	private String usuario;
	
	@NotNull(message = "O atributo senha não pode fica em branco.")
	@Size(min = 5, message = "O atributo senha é no mínimo 8 caracteres.")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
