package minhaLojaDeGames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minhaLojaDeGames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoRepository, Long> {

	public Optional<Produto> findByNome(String nome);
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
