package Entidades;

public class Pessoa {
	String nome;
	Integer cpf;
			
public Pessoa(String nome, Integer cpf) {
	this.nome = nome;
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getCpf() {
	return cpf;
}
public void setCpf(Integer cpf) {
	this.cpf = cpf;
}
}
