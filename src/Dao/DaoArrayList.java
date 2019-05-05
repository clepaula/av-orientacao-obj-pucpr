package Dao;

import java.util.ArrayList;

import Entidades.Aluno;
import Entidades.Professor;

public class DaoArrayList implements Dao {

	private static ArrayList<Aluno> bd = new ArrayList<Aluno>();
	private static ArrayList<Professor> bdp = new ArrayList<Professor>();

	@Override
	public void inserir(Aluno aluno) {
		bd.add(aluno);
		
	}
	@Override
	public void inserirp(Professor professor) {
		bdp.add(professor);
		
	}

	@Override
	public ArrayList<Aluno> listar() {
		return bd;
	}

@Override
public ArrayList<Professor> listarp() {
	return bdp;
}
}

/*public abstract class DaoArrayList implements Dao {
	private static  ArrayList<Aluno> bd = new ArrayList <Aluno>();
	private static  ArrayList<Professor> bdp = new ArrayList <Professor>();

	public void inserir(Aluno aluno) {
		bd.add(aluno);
	}

	public ArrayList<Aluno> listar1() {
		return bd;
	}

	@Override
	public void inserir(Professor professor) {
		bdp.addAll(bdp);
	
	}

	@Override
	public ArrayList<Professor> listarp() {
			return bdp;
	}

	@Override
	public ArrayList<Aluno> listar() {
		return bd;
		}

}*/
