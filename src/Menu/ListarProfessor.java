package Menu;

import java.util.ArrayList;

import Dao.Dao;
import Dao.DaoArrayList;
import Entidades.Professor;

public class ListarProfessor extends ItemdeMenu{
	@Override
	public String getDescricao() {
		return "ListarProfessor";
}
	
 	 @Override
	 public boolean executar () {
		 Dao dao = new DaoArrayList();
		 ArrayList<Professor> professores = dao.listarp();
		 for (int i=0; i < professores.size(); i++) {
			 Professor atual = professores.get(i);
			 System.out.println(atual.getNome() + "-" + atual.getCpf() + " - " + atual.getFormacao() + " - " + atual.getSalario());
		 }
		 return false;
		 
}
}

