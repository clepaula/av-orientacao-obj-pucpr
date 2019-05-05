package Dao;

import java.util.ArrayList;
import Entidades.Aluno;
import Entidades.Professor;

	public interface Dao {
		void inserir(Aluno aluno);
		ArrayList<Aluno> listar();
		void inserirp (Professor professor);
		ArrayList<Professor> listarp();	

	}


