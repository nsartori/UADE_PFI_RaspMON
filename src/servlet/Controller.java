package servlet;

import gui.vo.Cliente;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import delegate.ClienteDelegate;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer page=1;
		String action="";
		
		HttpSession session= request.getSession();
		session.setMaxInactiveInterval(60);
		
	
		System.out.println(request.getParameter("action"));

		
		if(request.getParameter("action")!=null && "altaCliente".equals(request.getParameter("action")))
		{
			System.out.println("########################");
			System.out.println("Controller nuevo Cliente");
			System.out.println("########################");
			
			Cliente cliente = new Cliente();
			
			
			boolean activo;
			
			if(request.getParameter("activo").equals("yes")){
				activo=true;
			}else activo=false;
			
			int idCliente =  Integer.parseInt(request.getParameter("IDCliente"));
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				//System.out.println(request.getParameter("fechaAlta"));
				date = formatter.parse(request.getParameter("fechaAlta"));
				System.out.println(date);
				//System.out.println(formatter.parse(request.getParameter("fechaAlta")));

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			cliente.setActivo(activo);
			cliente.setCodigoCliente(Integer.parseInt(request.getParameter("codigoCliente")));
			cliente.setDescripcion(request.getParameter("Descipcion"));
			cliente.setFechaAlta(date);
			cliente.setIDCliente(idCliente);
			
			ClienteDelegate cliDelegate= new ClienteDelegate();
			
			System.out.println("Resultado Controller= "+cliDelegate.altaCliente(cliente));
			//request.setAttribute("creado", cliDelegate.altaCliente(cliente));
			
			page=1;
			
		}	
		
		
		switch (page){
		case 1:{
			request.setAttribute("pagina", "Cliente");
			this.getServletContext().getRequestDispatcher("/jsp/ClienteABM.jsp").include(request, response);              
		};break;
		default:{
			request.setAttribute("validado", "0");
			this.getServletContext().getRequestDispatcher("/jsp/Login.jsp").include(request, response);
		}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
