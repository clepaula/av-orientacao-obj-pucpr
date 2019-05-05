package Menu;

import java.util.Scanner;

import Dao.Dao;
import Dao.DaoArrayList;
import Entidades.Aluno;

public class InserirAluno extends ItemdeMenu {
	Scanner sc = new Scanner (System.in);
	
		public static Aluno aluno; 
	
	@Override
	public String getDescricao() {
		return "InserirAluno";
	}

	@Override
 public boolean executar() {
		 
	 System.out.print("Digite o nome do aluno: ");
	 String nome = sc.nextLine();
	 System.out.print("Digite o CPF do aluno: ");
	 int cpf = sc.nextInt();
	 System.out.print("Digite o RA do aluno: ");
	 int ra = sc.nextInt();
	 System.out.print("Digite o Período: ");
	 int periodo = sc.nextInt();	
	 	 		 
	 new Aluno (nome, cpf, ra, periodo);
	 	 
	 Dao dao = new DaoArrayList();
	 
	 dao.inserir(aluno);
	 System.out.print ("");
	 System.out.println("Aluno cadastrado com sucesso!");
	 System.out.println("------------------------------");
	 		 
	 	return false;
 }
	
}
