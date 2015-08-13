package hibernate.srv;

import hibernate.dao.ClienteDAO;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteDAO cDAO=new ClienteDAO();
		
		cDAO.listaCliente();
	}

}
