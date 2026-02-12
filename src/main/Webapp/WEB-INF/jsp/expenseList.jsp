<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <h2>Expense List</h2>

    <c:forEach var="exp" items="${expenses}">
        <div style="border-bottom:1px solid #ccc; padding:10px;">
            <h4>${exp.name}</h4>
            <p>Amount: ${exp.amount}</p>
            <p>Date: ${exp.date}</p>

            <a href="/expense/edit/${exp.id}">Edit</a>
        </div>
    </c:forEach>
</div>
