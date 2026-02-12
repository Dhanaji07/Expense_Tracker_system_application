<%@ include file="header.jsp" %>

<div class="container">
    <h2>Add New Expense</h2>

    <form action="add" method="post">
        <input type="text" name="name" placeholder="Expense Name" required>
        <input type="number" name="amount" placeholder="Amount" required>
        <input type="date" name="date" required>
        <textarea name="description" placeholder="Description"></textarea>

        <button type="submit">Add Expense</button>
    </form>
</div>
