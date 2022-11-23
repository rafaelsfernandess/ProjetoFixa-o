package br.com.empresa;

import br.com.empresa.dao.ContatoDAO;
import br.com.empresa.exception.BOException;

public class Principal {

	public Principal() {
	}

	public static void main(String[] args) throws BOException {

		Principal p = new Principal();
		
		p.inserirContatos();
		p.listarContatos();
		p.editarContato();
		p.listarContatos();
		p.excluirContato();
		p.listarContatos();
		
	}

	private void excluirContato() {
		// TODO Auto-generated method stub
		
	}

	private void listarContatos() throws BOException {
		ContatoDAO contato = new ContatoDAO();
		contato.buscarContatoPorId();
		
	}

	private void editarContato() {
		// TODO Auto-generated method stub
		
	}

	private void inserirContatos() {		
		
	}

}
