package br.com.viaweb.appcomprecerto.service;

import java.util.List;

import br.com.viaweb.appcomprecerto.model.Produto;

public interface IProdutoService {

	public Produto criarProduto(Produto produto);
	public Produto alterarProduto(Produto produto);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);
	public Produto buscarPorId(Integer id);
}
