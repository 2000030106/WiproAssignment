<html>
<head>
    <title>Success</title>
    <style>
        table {
            border-collapse: collapse;
            width: 40%;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #333;
            padding: 10px;
            text-align: left;
        }
        h2 {
            color: green;
        }
    </style>
</head>
<body>
    <h2>Registration Successful</h2>

    <table>
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Username</td>
            <td>${username}</td>
        </tr>
        <tr>
            <td>Password</td>
            <td>${password}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${email}</td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td>${birthday}</td>
        </tr>
        <tr>
            <td>Profession</td>
            <td>${profession}</td>
        </tr>
    </table>
</body>
</html>
