package br.com.claudsan.docker.aplicacaodocker.repository;

import br.com.claudsan.docker.aplicacaodocker.model.Pessoa;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "pessoas", path = "pessoas")
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long> {
        List<Pessoa> findByNome(@Param("nome") String nome);
}
