package br.estacio.amazonas.catalogoprodutos.repositories;

import br.estacio.amazonas.catalogoprodutos.models.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long> {}
