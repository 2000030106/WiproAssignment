<%@ taglib prefix="wipro_form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Enrollment Form</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('/images/solarsystem.png');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            position: relative;
			background-color:yellow;
        }

        /* Overlay for background dimming */
        body::before {
            content: "";
            position: fixed;
            top: 0;
            left: 0;
            height: 100%;
            width: 100%;
            background-color: rgba(255, 255, 255, 0.85); /* light white overlay */
            z-index: -1;
        }

        .form-container {
            width: 600px;
            margin: 50px auto;
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        input[type="checkbox"], input[type="radio"] {
            width: auto;
            margin-right: 5px;
        }

        .inline-group {
            display: flex;
            gap: 15px;
            flex-wrap: wrap;
            margin-bottom: 10px;
        }

        .field-container {
            margin-bottom: 15px;
        }

        .error {
            color: red;
            font-size: 0.85em;
            margin-top: -10px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Enrollment Form</h2>

    <wipro_form:form action="submit" modelAttribute="student">

        <!-- First Name -->
        <div class="field-container">
            <label>First Name:</label>
            <wipro_form:input path="firstName" />
            <wipro_form:errors path="firstName" cssClass="error" />
        </div>

        <!-- Last Name -->
        <div class="field-container">
            <label>Last Name:</label>
            <wipro_form:input path="lastName" />
            <wipro_form:errors path="lastName" cssClass="error" />
        </div>

        <!-- Gender -->
        <div class="field-container">
            <label>Gender:</label>
            <div class="inline-group">
                <wipro_form:radiobutton path="gender" value="Male" /> Male
                <wipro_form:radiobutton path="gender" value="Female" /> Female
            </div>
            <wipro_form:errors path="gender" cssClass="error" />
        </div>

        <!-- Date of Birth -->
        <div class="field-container">
            <label>Date of Birth:</label>
            <wipro_form:input path="dob" />
            <wipro_form:errors path="dob" cssClass="error" />
        </div>

        <!-- Email -->
        <div class="field-container">
            <label>Email:</label>
            <wipro_form:input path="email" />
            <wipro_form:errors path="email" cssClass="error" />
        </div>

        <!-- Section -->
        <div class="field-container">
            <label>Section:</label>
            <div class="inline-group">
                <wipro_form:radiobutton path="section" value="Graduate" /> Graduate
                <wipro_form:radiobutton path="section" value="Post Graduate" /> Post Graduate
                <wipro_form:radiobutton path="section" value="Research" /> Research
            </div>
            <wipro_form:errors path="section" cssClass="error" />
        </div>

        <!-- Country -->
        <div class="field-container">
            <label>Country:</label>
            <wipro_form:select path="country" items="${countryOptions}" />
            <wipro_form:errors path="country" cssClass="error" />
        </div>

        <!-- First Attempt -->
        <div class="field-container">
            <label>First Attempt?</label>
            <wipro_form:checkbox path="firstAttempt" value="true" /> Yes
        </div>

        <!-- Subjects -->
        <div class="field-container">
            <label>Subjects:</label>
            <wipro_form:select path="subjects" items="${subjectOptions}" multiple="true" />
            <wipro_form:errors path="subjects" cssClass="error" />
        </div>

        <input type="submit" value="Register" />

    </wipro_form:form>
</div>

</body>
</html>
