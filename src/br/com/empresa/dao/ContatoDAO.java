package br.com.empresa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.empresa.exception.BOException;
import br.com.empresa.exception.BOValidationException;
import br.com.empresa.vo.ContatoVO;

public class ContatoDAO implements IContatoDAO {

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
		EntityManager em = HibernateUtil.getEntityManager();
		ContatoVO contatoAux = em.find(ContatoVO.class, contatoVO);//Não precisa colocar o .getId pois a classe ja sabe quem é o id
		return contatoAux;

	}

	@Override
	public List<ContatoVO> listarContatos(String nome, Date datini, Date datter) throws BOException {
		// TODO Auto-generated method stub
		return null;
	}

}
