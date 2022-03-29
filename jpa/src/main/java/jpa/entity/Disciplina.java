package jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_disciplina")
@SequenceGenerator(name = "disciplina", sequenceName = "sq_tb_disciplina", allocationSize = 1)
public class Disciplina implements Serializable {

	private static final long serialVersionUID = 3660463895016062555L;

	public Disciplina() {
		this.ativo = true;
		this.dataCadastro = LocalDateTime.now();
		this.dataAtualizacao = LocalDateTime.now();
	}

	public Disciplina(String nome, Integer cargaHoraria) {
		this();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	@Id
	@GeneratedValue(generator = "disciplina", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "nm_disciplina", length = 40, nullable = true)
	private String nome;

	@Column(name = "ds_carga_horaria")
	private Integer cargaHoraria;

	@Column(name = "st_ativo")
	private boolean ativo;

	@Column(name = "dt_cadastro")
	private LocalDateTime dataCadastro;

	@Column(name = "dt_atualizacao")
	private LocalDateTime dataAtualizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Override
	public String toString() {
		return "Disciplina\n id: " + id + "\n nome: " + nome + "\n cargaHoraria: " + cargaHoraria + "\n ativo: " + ativo
				+ "\n dataCadastro: " + dataCadastro + "\n dataAtualizacao: " + dataAtualizacao;
	}

}
