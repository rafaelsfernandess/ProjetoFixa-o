package br.com.empresa.dao;

import java.util.Date;
import java.util.List;

import br.com.empresa.exception.BOException;
import br.com.empresa.exception.BOValidationException;
import br.com.empresa.vo.ContatoVO;

public interface IContatoDAO {
	public abstract void salvarContato(ContatoVO contatoVO) throws BOValidationException, BOException;
	
	
	public abstract void excluirContato(ContatoVO contatoVO) throws BOValidationException, BOException;
	
	
	public abstract ContatoVO buscarContatoPorId(ContatoVO contatoVO) throws BOException;
		
		
	public List<ContatoVO> listarContatos(String nome, Date datini, Date datter) throws BOException;

}
