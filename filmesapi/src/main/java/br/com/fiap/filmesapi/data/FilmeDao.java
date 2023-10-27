package br.com.fiap.filmesapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.filmesapi.model.Filme;

public class FilmeDao {
	
	List<Filme> filmes = new ArrayList<Filme>();
	
	public FilmeDao() {
		filmes.add(new Filme(1L, "James Bond", "Tiro, porrada e bomba", 8.9));
		filmes.add(new Filme(2L, "Intriga Fatal", "Um thriller cheio de mistério", 7.5));
		filmes.add(new Filme(3L, "A Corrida Maluca", "Uma comédia de ação com muitas reviravoltas", 6.8));
		filmes.add(new Filme(4L, "O Tesouro Perdido", "Uma aventura emocionante em busca de riquezas", 8.2));
	}

	public List<Filme> findAll() {
		return filmes;
	}
}
