package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.Entity.Note;
import com.Fact.FactoryProvider;
 
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try 
		{
			int noteId=Integer.parseInt(request.getParameter("note_id"));
			Session s=FactoryProvider.getFactory().openSession();
			s.beginTransaction();
			
			Note note=s.get(Note.class, noteId);
			s.delete(note);
			s.getTransaction().commit();
			s.close();
			response.sendRedirect("Show_Note.jsp");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	 

}
