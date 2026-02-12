<%@ include file="header.jsp" %>

<div class="container">
    <h2>Update Expense</h2>

    <form action="/expense/update" method="post">
        <input type="hidden" name="id" value="${expense.id}">

        <input type="text" name="name" value="${expense.name}" required>
        <input type="number" name="amount" value="${expense.amount}" required>
        <input type="date" name="date" value="${expense.date}" required>
        <textarea name="description">${expense.description}</textarea>

        <button type="submit">Update Expense</button>
    </form>
</div>
