package br.com.coura.CouraForum.controller.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coura.CouraForum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>  {
	
	Curso findByNome(String nome);

}
