package br.com.empresa.bo;

import java.util.Date;
import java.util.List;

import br.com.empresa.dao.ContatoDAO;
import br.com.empresa.dao.IContatoDAO;
import br.com.empresa.exception.BOException;
import br.com.empresa.exception.BOValidationException;
import br.com.empresa.vo.ContatoVO;

public class ContatoBO implements IContatoBO {

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
		
		IContatoDAO contatoDAO = new ContatoDAO();
		if(contatoVO == null || contatoVO.getId()==null) {
			throw new BOException("Não é possivel consultar o contato passando um objeto nulo ou invalido");
		}
	
		
		return contatoDAO.buscarContatoPorId(contatoVO);
	}

	@Override
	public List<ContatoVO> listarContatos(String nome, Date datini, Date datter) throws BOException {
		// TODO Auto-generated method stub
		return null;
	}

}
