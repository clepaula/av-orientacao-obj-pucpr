package Menu;

import java.util.ArrayList;

import Dao.Dao;
import Dao.DaoArrayList;
import Entidades.Aluno;

public class ListarAluno extends ItemdeMenu {
	@Override
	public String getDescricao() {
		return "ListarAluno";
}
	@Override
 public boolean executar () {
	 Dao dao = new DaoArrayList();
	 ArrayList<Aluno> alunos = dao.listar();
	 for (int i=0; i < alunos.size(); i++) {
		 Aluno atual = alunos.get(i);
		 System.out.println(atual.getNome() + "-" + atual.getCpf() + " - " + atual.getRa() + " - " + atual.getPeriodo());
	 }
	 return false;
	 
}
}