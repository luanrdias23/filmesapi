package br.com.fiap.filmesapi;

import java.util.List;

import br.com.fiap.filmesapi.model.Filme;
import br.com.fiap.filmesapi.service.FilmeService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("filme")
public class FilmeResource {
	
	FilmeService service = new FilmeService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Filme> index() {
		return service.findAll();
	}

}
