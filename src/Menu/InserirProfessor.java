package Menu;

import java.util.Scanner;

import Dao.Dao;
import Dao.DaoArrayList;
import Entidades.Professor;

public class InserirProfessor extends ItemdeMenu {
		Scanner sc = new Scanner (System.in);
		public static Professor professor;
		
		@Override
		public String getDescricao() {
		return "InserirProfessor";
}
		@Override
 public boolean executar() {
	 
	 System.out.print("Digite o nome do professor: ");
	 String nome = sc.nextLine();
	 System.out.print("Digite o CPF do professor: ");
	 int cpf = sc.nextInt();
	 System.out.print("Digite a formação do professor: ");
	 String formacao = sc.next();
	 System.out.print("Digite o salário R$: ");
	 double salario = sc.nextDouble();	 
	 
	 new Professor (nome, cpf, formacao, salario);
	
	 
	 Dao dao = new DaoArrayList();
	 dao.inserirp(professor);
	 System.out.print ("");
	 System.out.println("Professor cadastrado com sucesso!");
	 System.out.println("------------------------------");
	 
	 return false;
}
}
