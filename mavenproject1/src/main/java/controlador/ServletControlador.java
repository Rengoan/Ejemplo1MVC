package controlador;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador {
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        
        //1.Procesamos los parametros
        String base = request.getParameter("base");
        String altura = request.getParameter("altura");
        
        //2.Creamos los JavaBeans que vamos a usar en nuestra aplicacion
        Rectangulo rec = new Rectangulo(4,5);
    }
}
