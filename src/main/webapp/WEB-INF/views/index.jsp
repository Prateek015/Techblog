<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Technical Blog</title>
<link rel="stylesheet" href="styles.css">
</head>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	font-family: Arial, sans-serif;
	line-height: 1.6;
	background-color: #f4f4f4;
	color: #333;
}

.container {
	width: 80%;
	margin: auto;
	overflow: hidden;
}

header {
	background: #333;
	color: #fff;
	padding-top: 30px;
	min-height: 70px;
	border-bottom: #0779e4 3px solid;
}

header h1 {
	float: left;
	margin-top: 0;
	margin-bottom: 10px;
	font-size: 24px;
}

header nav {
	float: right;
	margin-top: 10px;
}

header nav ul {
	list-style: none;
}

header nav ul li {
	display: inline;
	margin-left: 20px;
}

header nav ul li a {
	color: #fff;
	text-decoration: none;
	font-size: 16px;
}

header nav ul li a:hover {
	color: #0779e4;
}

main {
	margin-top: 20px;
}

.post {
	background: #fff;
	padding: 20px;
	margin-bottom: 20px;
	border: 1px solid #ddd;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.post h2 {
	color: #333;
	margin-bottom: 10px;
}

.post .date {
	color: #777;
	font-size: 14px;
	margin-bottom: 10px;
}

.post p {
	margin-bottom: 20px;
}

.post .read-more {
	display: inline-block;
	text-decoration: none;
	color: #0779e4;
	border: 1px solid #0779e4;
	padding: 10px 15px;
	border-radius: 5px;
	transition: background 0.3s, color 0.3s;
}

.post .read-more:hover {
	background: #0779e4;
	color: #fff;
}

footer {
	background: #333;
	color: #fff;
	text-align: center;
	padding: 20px 0;
	margin-top: 20px;
	border-top: #0779e4 3px solid;
}

footer p {
	margin: 0;
}
</style>

<body>
	<header>
		<div class="container">
			<h1>Technical Blog</h1>
			<nav>
				<ul>
					<li><a href="Login">Login</a></li>
					
					<li><a href="Register">Register</a></li>
				</ul>
			</nav>
		</div>
	</header>


	<body>
	<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Blog</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${products}" var="p">
            <tr>
                  <p>ID: ${p.id}</p>
    			<p>Blog: ${p.blog}</p>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>



<footer>
	<div class="container">
		<p>&copy; 2024 My Technical Blog. All rights reserved.</p>
	</div>
</footer>
</body></html>
