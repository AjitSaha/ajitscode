<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Brilliant Note Taking App</title>
    
    <%@include file="All_css_js.jsp"%>
</head>
<body>
   <div class="container-fluid p-6">
   <%@include file="Navbar.jsp"%>
   </div>
    
    <div class="main-content">
        <h1 class="welcome-message">Welcome to NoteTaker</h1>
        <div class="note-grid">
            <div class="note-card">
                <h2 class="note-title">Project Ideas</h2>
                <p class="note-content">1. AI-powered personal assistant<br>2. Sustainable energy app<br>3. Virtual reality education platform</p>
            </div>
            <div class="note-card">
                <h2 class="note-title">Daily Goals</h2>
                <p class="note-content">- Meditate for 15 minutes<br>- Read 30 pages<br>- Work on coding project<br>- Exercise for 30 minutes</p>
            </div>
            <div class="note-card">
                <h2 class="note-title">Meeting Notes</h2>
                <p class="note-content">Discussed Q3 goals and strategies. Action items: prepare market analysis, schedule follow-up with clients.</p>
            </div>
            <div class="note-card">
                <h2 class="note-title">Book Recommendations</h2>
                <p class="note-content">1. "Atomic Habits" by James Clear<br>2. "The Innovator's Dilemma" by Clayton Christensen<br>3. "Sapiens" by Yuval Noah Harari</p>
            </div>
        </div>
    </div>
    <script src="https://kit.fontawesome.com/your-fontawesome-kit.js" crossorigin="anonymous"></script>
</body>
</html>


