<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>
	<div class="container-fluid m-0 p-4 ">
		<%@include file="Navbar.jsp"%>
	</div>
	
	<div class="success-container">
        <div class="particles">
            <div class="particle"></div>
            <div class="particle"></div>
            <div class="particle"></div>
            <div class="particle"></div>
            <div class="particle"></div>
        </div>
        <div class="success-card">
            <div class="success-icon">
                <i class="fas fa-check-circle"></i>
            </div>
            <h1 class="success-title">Note Added Successfully</h1>
            <p class="success-message">Your brilliant idea has been captured and safely stored in your digital sanctuary.</p>
            <div class="btn-container">
                <a href="index.jsp" class="btn btn-primary">Return to Your Home</a>
                <a href="Add_notes.jsp" class="btn btn-outline">Capture Another Idea</a>
            </div>
        </div>
    </div>
</body>
</html>