package br.estacio.amazonas.catalogoprodutos.services;

import br.estacio.amazonas.catalogoprodutos.dto.NovoProdutoDTO;
import br.estacio.amazonas.catalogoprodutos.dto.ProdutoDTO;
import br.estacio.amazonas.catalogoprodutos.models.Produto;
import br.estacio.amazonas.catalogoprodutos.repositories.ProdutosRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutosService {

    private ProdutosRepository repository;

    public ProdutosService(ProdutosRepository repository) {
        this.repository = repository;
    }
    
    public List<ProdutoDTO> buscarProdutos() {
        List<Produto> produtos = this.repository.findAll();
        List<ProdutoDTO> listaProdutos = produtos.stream().map(p -> new ProdutoDTO(p.getId(), p.getNome(), p.getPreco())).collect(Collectors.toList());

        return listaProdutos;
    }

    public void salvarProduto(NovoProdutoDTO dto) {
        Produto novo = new Produto(dto.nome(), dto.preco());
        this.repository.save(novo);
    }
}
