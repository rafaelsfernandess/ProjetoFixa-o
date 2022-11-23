package br.com.empresa.service;

import java.util.Date;
import java.util.List;

import br.com.empresa.exception.BOException;
import br.com.empresa.exception.BOValidationException;
import br.com.empresa.vo.ContatoVO;

public interface IServicoBeanLocal {

	/**
	 * Salva um contato existente.
	 * 
	 * @param contatoVO
	 * @throws BOValidationException
	 * @throws BOException
	 */
	public abstract void salvarContato(ContatoVO contatoVO) throws BOValidationException, BOException;
	
	/**
	 * Exclui um contato existente.
	 * 
	 * @param contatoVO
	 * @throws BOValidationException
	 * @throws BOException
	 */
	public abstract void excluirContato(ContatoVO contatoVO) throws BOValidationException, BOException;
	
	/**
	 * Busca um contato a partir do código de identificação.
	 * 
	 * @param contatoVO
	 * @return
	 * @throws BOException
	 */
	public abstract ContatoVO buscarContatoPorId(ContatoVO contatoVO) throws BOException;
	
	/**
	 * Lista todos os contatos a partir de um desses 3 parâmetros;
	 * 
	 * @param nome
	 * @param datini
	 * @param datter
	 * @return
	 * @throws BOException
	 */
	public List<ContatoVO> listarContatos(String nome, Date datini, Date datter) throws BOException;

}
