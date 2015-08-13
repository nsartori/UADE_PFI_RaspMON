package delegate;

import gui.vo.Cliente;
import hibernate.srv.Negocio;

public class ClienteDelegate {
	
	
	
	public String altaCliente(Cliente cliente)
	{
		Negocio negocio = new Negocio();
		System.out.println("########################");
		System.out.println("Delegate nuevo Cliente");
		System.out.println("########################");
		
		if(negocio.altaCliente(cliente)){		
			return "usuario Creado Satisfactoriamente";
		}else return null;
					
	}

}
