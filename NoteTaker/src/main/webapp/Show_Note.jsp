<%@page import="com.Entity.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.Fact.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>
	<div class="container-fluid p-4">
		<%@include file="Navbar.jsp"%>
		<br>
	</div>
	<div class="main-content">
        <h1 class="welcome-message">All Notes:</h1>
        <div class="note-grid">
            <%
            Session s = FactoryProvider.getFactory().openSession();
            Query q = s.createQuery("from Note");
            List<Note> list = q.list();
            for (Note note : list) {
            %>
            <div class="note-card">
                <h2 class="note-title"><%=note.getTitle()%></h2>
                <p class="note-content"><%=note.getContent()%></p>
                <div class="btn-container">
                    <a href="DeleteServlet?note_id=<%=note.getId()%>" class="btn btn-outline">Delete</a>
                    <a href="Update.jsp?note_id=<%=note.getId()%>" class="btn btn-primary">Update</a>
                </div>
            </div>
            <%
            }
            s.close();
            %>
        </div>
    </div>

</body>
</html>