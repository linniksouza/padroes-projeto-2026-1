package br.estacio.amazonas.padroesjee.repositories;

import br.estacio.amazonas.padroesjee.models.Produto;

import java.util.List;

public interface ProdutosRepository {

    List<Produto> buscarProdutos();

    void salvar(Produto produto);

}
