package com.gen.gamesGeneration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.gamesGeneration.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);

}