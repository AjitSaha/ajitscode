package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.Entity.Note;
import com.Fact.FactoryProvider;

 
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public SaveNoteServlet() {
        super();
         
    }	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
		      String title=request.getParameter("title");
		      String content=request.getParameter("content");
		      
		      Note note=new Note(title,content,new Date());
//   	      System.out.println(note.getId()+"  "+note.getTitle());
		      
		      Session session=FactoryProvider.getFactory().openSession();
		      
		      session.beginTransaction();
		      session.save(note);
		      session.getTransaction().commit();
		      session.close();
		      
//		      response.setContentType("text/html");
//		      PrintWriter out=response.getWriter();
//		      out.println("<h1> Note Succesfully added</h1>");
		      
		      response.sendRedirect("submit.jsp");
		      
		      
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		 
	}

}
