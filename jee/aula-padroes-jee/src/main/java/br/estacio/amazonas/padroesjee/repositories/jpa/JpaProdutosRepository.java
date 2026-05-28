package br.estacio.amazonas.padroesjee.repositories.jpa;

import br.estacio.amazonas.padroesjee.models.Produto;
import br.estacio.amazonas.padroesjee.repositories.ProdutosRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

@RequestScoped
public class JpaProdutosRepository implements ProdutosRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Produto> buscarProdutos() {
        TypedQuery<Produto> query = this.em.createQuery("select p from Produto p", Produto.class);

        return query.getResultList();
    }

    @Override
    public void salvar(Produto produto) {
        this.em.persist(produto);
    }
}
