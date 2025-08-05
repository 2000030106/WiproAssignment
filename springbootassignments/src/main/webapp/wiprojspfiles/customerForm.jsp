<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #e3f2fd, #fce4ec);
            margin: 40px;
        }

        .form-container {
            background: #ffffff;
            padding: 30px 40px;
            max-width: 550px;
            margin: auto;
            box-shadow: 0 8px 20px rgba(0,0,0,0.15);
            border-radius: 12px;
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #00695c;
        }

        label {
            display: block;
            margin-top: 18px;
            font-weight: bold;
            color: #37474f;
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 6px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 15px;
            color: #1a237e; /* Text color when typing */
        }

        input:focus, select:focus {
            outline: none;
            border: 1px solid #4caf50;
            box-shadow: 0 0 5px rgba(76, 175, 80, 0.5);
            background-color: #f1f8e9;
        }

        .error {
            color: red;
            font-size: 0.9em;
            margin-top: 3px;
        }

        button {
            margin-top: 25px;
            width: 100%;
            padding: 12px;
            background-color: #0288d1;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
        }

        button:hover {
            background-color: #0277bd;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Customer Form</h2>
    <form:form action="${pageContext.request.contextPath}/save" method="post" modelAttribute="customer">
        <label>Name:</label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>

        <label>Email:</label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>

        <label>Age:</label>
        <form:input path="age"/>
        <form:errors path="age" cssClass="error"/>

        <label>Gender:</label>
        <form:select path="gender">
            <form:option value="" label="-- Select --"/>
            <form:option value="Male"/>
            <form:option value="Female"/>
        </form:select>
        <form:errors path="gender" cssClass="error"/>

        <label>Birthday:</label>
        <form:input path="birthday" type="date"/>
        <form:errors path="birthday" cssClass="error"/>

        <label>Phone:</label>
        <form:input path="phone"/>
        <form:errors path="phone" cssClass="error"/>

        <button type="submit">Save Customer</button>
    </form:form>
</div>

</body>
</html>
