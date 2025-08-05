<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <title>Enrollment Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e6ffee;
        }
        .container {
            width: 600px;
            margin: 50px auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            color: #4CAF50;
        }
        p {
            font-size: 16px;
            margin-bottom: 10px;
        }
        .label {
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Registration Successful!</h2>

    <p><span class="label">Name:</span> ${student.firstName} ${student.lastName}</p>
    <p><span class="label">Gender:</span> ${student.gender}</p>
    <p><span class="label">Date of Birth:</span> ${student.dob}</p>
    <p><span class="label">Email:</span> ${student.email}</p>
    <p><span class="label">Section:</span> ${student.section}</p>
    <p><span class="label">Country:</span> ${student.country}</p>
    <p><span class="label">First Attempt?:</span> <c:choose>
        <c:when test="${student.firstAttempt}">Yes</c:when>
        <c:otherwise>No</c:otherwise>
    </c:choose></p>
    <p><span class="label">Subjects:</span> 
        <c:forEach var="subj" items="${student.subjects}">
            ${subj}<c:if test="${!fn:contains(student.subjects[student.subjects.size()-1], subj)}">, </c:if>
        </c:forEach>
    </p>
</div>

</body>
</html>
