package BarrosCompany.ModestoDiscord.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Champion {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("nome")
	@Expose
	private String nome;
	@SerializedName("dica")
	@Expose
	private String dica;
	@SerializedName("representacao")
	@Expose
	private String representacao;

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

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public String getRepresentacao() {
		return representacao;
	}

	public void setRepresentacao(String representacao) {
		this.representacao = representacao;
	}

}