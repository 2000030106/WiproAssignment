<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot CSSJS Task</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/springcs.css">
    <script src="${pageContext.request.contextPath}/js/task.js"></script>

    <style>
        body {
            background-image: url('${pageContext.request.contextPath}/images/space.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            color: white; 
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .container {
            padding: 20px;
            background-color: yellow;
            margin: 50px auto;
            width: 600px;
            border-radius: 10px;
			text-align:center;
        }

        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
		
			
        }
		img {
		            display: block;
		            margin: 0 auto; /* Center image horizontally */
		        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Spring Boot: CSS, JS and ImagesTask</h2>

        <p>This is Spring Boot <code>Task</code></p>

        <img src="${pageContext.request.contextPath}/images/eagle.jpg" width="200"/>

        <br/><br/>
        <button onclick="showAlert()">JS Task</button>
    </div>
</body>
</html>
