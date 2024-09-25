<%@page import="com.Entity.Note"%>
<%@page import="com.Fact.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>

<%@include file="All_css_js.jsp"%>
</head>
<body>

	<div class="container-fluid p-4">
		<%@include file="Navbar.jsp"%>

	</div>

	<%
	int noteid = Integer.parseInt(request.getParameter("note_id"));
	Session s = FactoryProvider.getFactory().openSession();
	Note note = s.get(Note.class, noteid);
	%>
	<div class="container">
		<h2>Update Note</h2>
		<form action="UpdateServlet" method="post">
			<input value="<%=note.getId()%>" name="noteid" type="hidden" />
			<div class="form-group">
				<label for="title">Note Title</label> 
				<input 
				type="text" 
				id="title"
				name="title" 
				required 
				placeholder="Enter Title" 
				autocomplete="off"
				aria-describedby="titleHelp" value="<%=note.getTitle()%>">
				<div id="titleHelp" class="form-text">Enter a descriptive
					title for your note</div>
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea id="content" name="content" required
					placeholder="Write your note content here..."><%=note.getContent()%></textarea>
			</div>
			<button type="submit">Save</button>
		</form>
	</div>
</body>
</html>