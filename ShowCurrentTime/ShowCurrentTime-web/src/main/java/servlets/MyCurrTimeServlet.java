package servlets; 
import java.io.IOException; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import javax.ejb.*; 
import myTime.*; 
import DBPack.*;
public class MyCurrTimeServlet extends HttpServlet implements javax.servlet.Servlet { 
    @EJB 
    private TimeGeter TG; 
    
    @EJB
    private Persistancer Pers;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        TimeContainer tc=TG.getTimeContainer();
        String timeString = Integer.toString(tc.Hours)+":"+Integer.toString(tc.Minutes);
        request.getSession().setAttribute("result", timeString); 
        RequestDispatcher rd = request.getRequestDispatcher( "index.jsp"); 
        rd.forward(request, response); 
        
        Pers.addElem(request.getRemoteAddr(), request.getHeader("User-Agent"), timeString);
    } 
} 