<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
			background-color:skyblue;
        }
        .form-container {
            width: 400px;
            margin: 100px auto;
            border: 1px solid #ddd;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            font-weight: bold;
        }
        label, input, select {
            display: block;
            width: 100%;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            width: auto;
            display: block;
            margin: 0 auto;
            padding: 5px 15px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Spring MVC Form Demo - Registration</h2>
        <form action="${pageContext.request.contextPath}/submitForm" method="post">
            <label>User Name:</label>
            <input type="text" name="username" required />

            <label>Password:</label>
            <input type="password" name="password" required />

            <label>Email:</label>
            <input type="email" name="email" required />

            <label>Birthday (mm/dd/yyyy):</label>
            <input type="text" name="birthday" required />

            <label>Profession:</label>
            <select name="profession">
                <option value="Developer">Developer</option>
                <option value="Tester">Tester</option>
            </select>

            <input type="submit" value="Register" />
        </form>
    </div>
</body>
</html>
