package com.generation.mercadodopovo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.mercadodopovo.model.Produto;
import com.generation.mercadodopovo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository; // Repositório para acessar os dados dos produtos

    /**
     * Retorna uma lista de produtos saudáveis.
     * 
     * @return Lista de produtos saudáveis.
     */
    public List<Produto> recomendarProdutosSaudaveis() {
        // Busca todos os produtos e filtra os que são saudáveis
        return produtoRepository.findBySaudavelTrue(); // Método que busca produtos saudáveis
    }
}