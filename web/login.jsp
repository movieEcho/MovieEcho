<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>MovieEcho|登录</title>
		<link rel="stylesheet" href="css/base.css" />
		<link rel="stylesheet" href="css/login.css" />
	</head>
	<body>
		<div id="scene">
			<div id="header">
				<div id="header-content">
					<div id="logo">
						<img src="img/background/logo.png" />
					</div>
					<div id="nav">
						<ul id="choose">
							<li><a id="page3" href="html/personalCenter.html">个人中心</a></li>
							<li><a id="page2" href="html/movieSearch.html">影视搜索</a></li>
							<li><a id="page1" href="html/index.html">电影空间</a></li>

						</ul>
					</div>
				</div>
			</div>


			<div id="login">
				<div id="login-content">
					<h1>用户登录</h1>
					<form action="loginServlet" method="post">
						<div class="uid">
							<label for="userId">用户名:</label>
							<input type="text" name="userId" id="userId" placeholder="请输入用户ID号" />
						</div>
						<div id="">
							<label for="password">密码:</label>
							<input type="password" name="password" id="password" placeholder="请输入密码" />
						</div>
						<button type="submit" id="btn">登录</button>
						<p class="signin">
							还未注册账号，点此
							<a href="register.html">注册</a>
						</p>
					</form>
					<div id="bottom">
						<img src="img/login/insert1.png" />
					</div>
				</div>

			</div>

		</div>



	</body>
</html>
