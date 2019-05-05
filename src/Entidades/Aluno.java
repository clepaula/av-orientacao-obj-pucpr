package Entidades;

public class Aluno extends Pessoa {
	Integer ra;
	Integer periodo;
	public Aluno(String nome, Integer cpf, Integer ra, Integer periodo) {
		super(nome, cpf);
		this.ra = ra;
		this.periodo = periodo;
	}
	public Integer getRa() {
		return ra;
	}
	public void setRa(Integer ra) {
		this.ra = ra;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
}
