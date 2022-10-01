package br.com.coura.CouraForum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coura.CouraForum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	List<Topico> findByCursoNome(String nomeCurso);

}
