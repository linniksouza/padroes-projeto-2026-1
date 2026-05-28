package br.estacio.amazonas.padroesjee.controllers;

import br.estacio.amazonas.padroesjee.dto.NovoProdutoDTO;
import br.estacio.amazonas.padroesjee.dto.ProdutoDTO;
import br.estacio.amazonas.padroesjee.services.ProdutosService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/produtos")
public class ProdutosServlet extends HttpServlet {

    @Inject
    private ProdutosService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProdutoDTO> produtos = this.service.buscarProdutos();

        resp.setStatus(200);
        resp.getWriter().println(produtos);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String preco = req.getParameter("preco");
        NovoProdutoDTO dto = new NovoProdutoDTO(
            nome,
            Double.parseDouble(preco)
        );
        this.service.salvarProduto(dto);

        resp.setStatus(201);
        resp.getWriter().println("Produto salvo com sucesso");
    }
}
