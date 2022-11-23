package br.com.empresa.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.empresa.bo.ContatoBO;
import br.com.empresa.bo.IContatoBO;
import br.com.empresa.exception.BOException;
import br.com.empresa.exception.BOValidationException;
import br.com.empresa.vo.ContatoVO;

public class ServicoBeanLocal implements IServicoBeanLocal {

	@Override
	public void salvarContato(ContatoVO contatoVO) throws BOValidationException, BOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirContato(ContatoVO contatoVO) throws BOValidationException, BOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ContatoVO buscarContatoPorId(ContatoVO contatoVO) throws BOException {
		
		IContatoBO contatoBO = new ContatoBO();
		
		return contatoBO.buscarContatoPorId(contatoVO);
	}

	@Override
	public List<ContatoVO> listarContatos(String nome, Date datini, Date datter) throws BOException {
		// TODO Auto-generated method stub
		return null;
	}


}
