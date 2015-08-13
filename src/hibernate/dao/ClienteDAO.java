package hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import hibernate.bean.ClienteBean;
import hibernate.hbt.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;



public class ClienteDAO {

	public Session userSession(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		return session;
	}
	
	public boolean altaCliente(ClienteBean cliente)
	{
		System.out.println("########################");
		System.out.println("ClienteDAO nuevo Cliente");
		System.out.println("########################");
		
		Session session=userSession();
		
		try {
			//session.persist(cliente);
			session.save(cliente);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
	}
	
	public boolean bajaCliente(ClienteBean cliente)
	{
		Session session=userSession();
		
		if(getOne(cliente.getIDCliente())==null){
			try {
				session.delete(cliente);
				session.getTransaction().commit();
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				session.getTransaction().rollback();
				return false;
			}
		}else return false;
	}
	
	public ClienteBean modificacionCliente(ClienteBean cliente)
	{
		Session session=userSession();
		
		try {
			session.persist(cliente);
			session.getTransaction().commit();
			return cliente;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

	public ArrayList<ClienteBean> listaCliente()
	{	
		
		Session session = userSession();
		Query q = session.createQuery("from ClienteBean");
		
		@SuppressWarnings("unchecked")
		List<ClienteBean> listaCBean = (List<ClienteBean>) q.list();
		
		if(listaCBean.isEmpty()){
			return null;
		}else return (ArrayList<ClienteBean>) listaCBean;
		
	}
	
	private ClienteBean getOne(int idCliente )
	{
		ClienteBean cBean = new ClienteBean();
		
		Session session=userSession();
		
		Query q = session.createQuery("from ClienteBean where idCliente=::id_cliente");
		q.setParameter("id_cliente", idCliente);
		
		@SuppressWarnings("unchecked")
		List<ClienteBean> listacBean= (List<ClienteBean>) q.list();
		cBean =listacBean.get(0);
		
		if(listacBean.isEmpty()){
			return null;
		}else return cBean;
		
	}
}
