package com.Entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Pagination 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		Query q=session.createQuery("from Note");
		
		q.setFirstResult(1);
		q.setMaxResults(9);
		List<Note> lis=q.list();
		
		for(Note note:lis)
		{
			System.out.println(note.getId()+" : "+note.getTitle()+" : "+note.getContent()+" : "+note.getAddeddate());
		}
		
		sf.close();
		session.close();

	}

}
