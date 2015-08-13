package hibernate.srv;

import hibernate.bean.ClienteBean;
import hibernate.dao.ClienteDAO;

import java.util.ArrayList;
import java.util.Iterator;

import gui.vo.Cliente;


public class Negocio {
	
	private ClienteBean vo2bean(Cliente cliente){
		
		ClienteBean cBean=new ClienteBean();
		
		cBean.setActivo(cliente.isActivo());
		cBean.setCodigoCliente(cliente.getCodigoCliente());
		cBean.setDescripcion(cliente.getDescripcion());
		cBean.setFechaAlta(cliente.getFechaAlta());
		cBean.setIDCliente(cliente.getIDCliente());
		return cBean;
	}
	
	private Cliente bean2vo (ClienteBean cBEAN)
	{
		Cliente  cliente = new Cliente();
		
		cliente.setActivo(cBEAN.isActivo());
		cliente.setCodigoCliente(cBEAN.getCodigoCliente());
		cliente.setDescripcion(cBEAN.getDescripcion());
		cliente.setFechaAlta(cBEAN.getFechaAlta());
		cliente.setIDCliente(cBEAN.getIDCliente());
		
		return cliente;
	}
	
	public boolean altaCliente(Cliente cliente)
	{
		System.out.println("########################");
		System.out.println("Negocio nuevo usuario");
		System.out.println("########################");
		
		ClienteBean cBean=vo2bean(cliente);
		ClienteDAO cDao= new ClienteDAO();
		
		return cDao.altaCliente(cBean);
		
		
	}
	public boolean bajaCliente(Cliente cliente)
	{
		ClienteBean cBean=vo2bean(cliente);
		ClienteDAO cDao= new ClienteDAO();
		
		return cDao.bajaCliente(cBean);
	}
	
	public Cliente modificacionCliente(Cliente cliente)
	{
		ClienteDAO cDao= new ClienteDAO();
		ClienteBean cBEAN= vo2bean(cliente);
		ClienteBean cBEANResp = cDao.modificacionCliente(cBEAN);
		
		return bean2vo(cBEANResp);
		
	}
	
	public ArrayList<Cliente> listaCliente()
	{
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		
		ClienteDAO cDAO = new ClienteDAO();
		
		ArrayList<ClienteBean> listaCBEAN=cDAO.listaCliente();
		
		Iterator<ClienteBean> it=listaCBEAN.iterator();
		
		while(it.hasNext())
		{
			ClienteBean auxClienteBean =it.next();
			Cliente auxCliente=bean2vo(auxClienteBean);
			listaCliente.add(auxCliente);
		}
		
		return listaCliente;
		
	}

}
