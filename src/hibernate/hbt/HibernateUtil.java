package hibernate.hbt;

import hibernate.bean.CamionBean;
import hibernate.bean.ClienteBean;
import hibernate.bean.DetalleViajeBean;
import hibernate.bean.EquipoBean;
import hibernate.bean.InspeccionBean;
import hibernate.bean.PerfilesBean;
import hibernate.bean.PermisosBean;
import hibernate.bean.UsuarioBean;
import hibernate.bean.ViajeBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
	private static SessionFactory sessionFactory=null;
	static
	{
		try
		{
			AnnotationConfiguration config = new AnnotationConfiguration();
			config.addAnnotatedClass(ClienteBean.class);
			config.addAnnotatedClass(CamionBean.class);
			config.addAnnotatedClass(UsuarioBean.class);
			config.addAnnotatedClass(InspeccionBean.class);
			config.addAnnotatedClass(ViajeBean.class);
			config.addAnnotatedClass(PerfilesBean.class);
			config.addAnnotatedClass(EquipoBean.class);
			config.addAnnotatedClass(DetalleViajeBean.class);
			//config.addAnnotatedClass(PermisosBean.class);
			
			HibernateUtil.sessionFactory = config.buildSessionFactory();
			
		} catch (Throwable ex)
		{
			ex.printStackTrace();
			System.err.println("Initial SessionFactory creation failed." + ex);
			//throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}