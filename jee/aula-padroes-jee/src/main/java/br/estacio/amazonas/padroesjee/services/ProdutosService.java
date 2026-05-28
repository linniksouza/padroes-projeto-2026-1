package br.estacio.amazonas.padroesjee.services;

import br.estacio.amazonas.padroesjee.dto.NovoProdutoDTO;
import br.estacio.amazonas.padroesjee.dto.ProdutoDTO;
import br.estacio.amazonas.padroesjee.models.Produto;
import br.estacio.amazonas.padroesjee.repositories.ProdutosRepository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class ProdutosService {

    @Inject
    private ProdutosRepository repository;

    public List<ProdutoDTO> buscarProdutos() {
        List<Produto> produtos = this.repository.buscarProdutos();
        List<ProdutoDTO> listaProdutos = (
            produtos
                .stream()
                .map(p -> (
                    new ProdutoDTO(
                        p.getId(),
                        p.getNome(),
                        p.getPreco()
                    )
                ))
                .collect(Collectors.toList())
        );

        return listaProdutos;
    }

    @Transactional
    public void salvarProduto(NovoProdutoDTO dto) {
        Produto produto = new Produto(dto.nome(), dto.preco());
        this.repository.salvar(produto);
    }
}
