<link rel="stylesheet" href="/css/style.css">

<div class="container">
    <h2>Login</h2>

    <form action="login" method="post">
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <button type="submit">Login</button>
    </form>

    <p>New User? <a href="register">Register here</a></p>

    <p style="color:red;">
        ${error}
    </p>
</div>
