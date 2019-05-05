package Entidades;

public class Professor extends Pessoa{
	String formacao;
	Double salario;
	public Professor(String nome, Integer cpf, String formacao, Double salario) {
		super(nome, cpf);
		this.formacao = formacao;
		this.salario = salario;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
