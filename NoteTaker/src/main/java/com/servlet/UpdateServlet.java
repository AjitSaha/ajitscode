package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.Entity.Note;
import com.Fact.FactoryProvider;

 
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		try 
		{
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			int id=Integer.parseInt(request.getParameter("noteid").trim());
			
			Session s=FactoryProvider.getFactory().openSession();
			s.beginTransaction();
			
			Note note=s.get(Note.class, id);
			note.setTitle(title);
			note.setContent(content);
			s.getTransaction().commit();
			s.close();
			response.sendRedirect("Show_Note.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
