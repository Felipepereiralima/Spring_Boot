package br.com.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/**
	 * A annotation @NotNull indica que um atributo não pode ser nulo.
	 * O parametro message indica a mensagem que será exibida caso o atributo seja nulo.
	 */
	
	@NotNull(message = "O atribuito título é obrigatório")
	@Size(min= 5, max = 100, message = "O atribuito título deve conter no mínimo 5 e no máximo 100 caracteres")
	private String título;
	
	@NotBlank(message = "O atribuito título é obrigatorio")
	@Size (min= 10, max = 1000, message = "O atribuito título deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
