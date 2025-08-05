<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Customer Success</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(to right, #e0f7fa, #f1f8e9);
            padding: 50px;
        }

        .card {
            background: linear-gradient(to bottom, #ffffff, #f9f9f9);
            max-width: 650px;
            margin: 0 auto;
            border-radius: 16px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
            padding: 40px;
            border: 1px solid #ddd;
        }

        h2 {
            color: #2e7d32;
            text-align: center;
            margin-bottom: 30px;
        }

        .field {
            margin: 18px 0;
            font-size: 16px;
        }

        .label {
            font-weight: bold;
            color: #37474f;
        }

        .value {
            margin-left: 10px;
            font-weight: 600;
            padding: 4px 10px;
            border-radius: 6px;
        }

        .value.name { background-color: #ffe0b2; color: #bf360c; }
        .value.email { background-color: #e1f5fe; color: #0277bd; }
        .value.age { background-color: #f3e5f5; color: #6a1b9a; }
        .value.gender { background-color: #fff9c4; color: #f57f17; }
        .value.birthday { background-color: #dcedc8; color: #33691e; }
        .value.phone { background-color: #ffccbc; color: #d84315; }
    </style>
</head>
<body>
    <div class="card">
        <h2>Customer Details Submitted Successfully!</h2>
        <div class="field">
            <span class="label">Name:</span>
            <span class="value name">${customer.name}</span>
        </div>
        <div class="field">
            <span class="label">Email:</span>
            <span class="value email">${customer.email}</span>
        </div>
        <div class="field">
            <span class="label">Age:</span>
            <span class="value age">${customer.age}</span>
        </div>
        <div class="field">
            <span class="label">Gender:</span>
            <span class="value gender">${customer.gender}</span>
        </div>
        <div class="field">
            <span class="label">Birthday:</span>
            <span class="value birthday">${customer.birthday}</span>
        </div>
        <div class="field">
            <span class="label">Phone:</span>
            <span class="value phone">${customer.phone}</span>
        </div>
    </div>
</body>
</html>
