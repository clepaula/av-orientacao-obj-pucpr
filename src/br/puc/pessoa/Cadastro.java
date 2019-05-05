package br.puc.pessoa;
import java.util.Scanner;

import Menu.InserirAluno;
import Menu.InserirProfessor;
import Menu.ItemdeMenu;
import Menu.ListarAluno;
import Menu.ListarProfessor;
import Menu.Sair;

public class Cadastro {
		public static void main(String[] args) {			
			Scanner sc = new Scanner (System.in);
					
			ItemdeMenu [] principal = new ItemdeMenu [] {
					new InserirAluno (),
					new ListarAluno (),
					new InserirProfessor (),
					new ListarProfessor (),
					new Sair ()
								
			};
			boolean sair = false;
			do {
			for (int i = 0; i < principal.length; i++) {
				System.out.println( i + " - " + principal [i].getDescricao());			
		}
			System.out.println ("Digite a opção desejada: ");
			int opcao = Integer.parseInt(sc.nextLine ());
			sair = principal [opcao].executar();
				
				}
			while (!sair);	
		sc.close();
			
}
		}




