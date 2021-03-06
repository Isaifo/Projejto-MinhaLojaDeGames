package minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import minhaLojaDeGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTituloContainingIgnoreCase(String titulo);
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
