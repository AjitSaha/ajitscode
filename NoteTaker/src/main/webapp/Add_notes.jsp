<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>
	<div class="container-fluid  p-6 ">
		<%@include file="Navbar.jsp"%>
	</div>
	<br>
	<div class="container">
			<h2>Create a New Note</h2>
			<form action="SaveNoteServlet" method="post">
				<div class="form-group">
					<label for="title">Note Title</label> 
					<input 
					type="text" 
					id="title"
					name="title" 
					required placeholder="Enter Title" 
					autocomplete="off"
					aria-describedby="titleHelp">
					<div id="titleHelp" class="form-text">Enter a descriptive
						title for your note</div>
				</div>
				<div class="form-group">
					<label for="content">Note Content</label>
					<textarea id="content" name="content" required
						placeholder="Write your note content here..."></textarea>
				</div>
				<button type="submit">Save Note</button>
			</form>
		</div>
</body>
</html>