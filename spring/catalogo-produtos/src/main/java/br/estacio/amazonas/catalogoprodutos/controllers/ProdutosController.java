package br.estacio.amazonas.catalogoprodutos.controllers;

import br.estacio.amazonas.catalogoprodutos.dto.NovoProdutoDTO;
import br.estacio.amazonas.catalogoprodutos.dto.ProdutoDTO;
import br.estacio.amazonas.catalogoprodutos.services.ProdutosService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutosController {

    private ProdutosService service;

    public ProdutosController(ProdutosService service) {
        this.service = service;
    }
    
    @GetMapping
    public List<ProdutoDTO> buscarProdutos(){
        return this.service.buscarProdutos();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String inserirProduto(@RequestBody NovoProdutoDTO dto) {
        this.service.salvarProduto(dto);

        return "Produto salvo com sucesso";
    }
}
