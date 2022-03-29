package jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
@SequenceGenerator(name = "endereco", sequenceName = "sq_tb_endereco", allocationSize = 1)
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6917454861956228808L;

	public Endereco() {
		this.ativo = true;
		this.dataCadastro = LocalDateTime.now();
		this.dataAtualizacao = LocalDateTime.now();
	}

	public Endereco(String rua, Integer numero, String bairro, String cep, String complemento, String cidade,
			String uf) {
		this();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco")
	private Long id;

	@Column(name = "ds_rua", length = 50, nullable = false)
	private String rua;

	@Column(name = "nr_endereco")
	private Integer numero;

	@Column(name = "ds_bairro", length = 30, nullable = false)
	private String bairro;

	@Column(name = "ds_cep", length = 9, nullable = false, unique = true)
	private String cep;

	@Column(name = "ds_complemento", length = 90)
	private String complemento;

	@Column(name = "ds_cidade", length = 40, nullable = false)
	private String cidade;

	@Column(name = "sg_uf", length = 2, nullable = false)
	private String uf;

	@OneToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;

	@Column(name = "st_ativo")
	private Boolean ativo;

	@Column(name = "dt_cadastro")
	private LocalDateTime dataCadastro;

	@Column(name = "dt_atualizacao")
	private LocalDateTime dataAtualizacao;
	
	@OneToOne(mappedBy = "aluno")
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
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
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Endereco \n[id= " + id + "\nrua= " + rua + "\nnumero= " + numero + "\nbairro= " + bairro + "\ncep= " + cep
				+ "\ncomplemento= " + complemento + "\ncidade= " + cidade + "\nuf= " + uf + "\naluno= " + aluno + "\nativo= "
				+ ativo + "\ndataCadastro= " + dataCadastro + "\ndataAtualizacao= " + dataAtualizacao + "]";
	}


	
	
	
}
