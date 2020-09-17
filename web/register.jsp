<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>MovieEcho|注册</title>
		<link rel="stylesheet" href="css/base.css" />
		<link rel="stylesheet" href="css/register.css" />
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

			<div id="register">
				<div id="register-content">
					<h1>用户注册</h1>
					<form action="enrollServlet" method="post">
						<div class="password">
							<div class="username">
								<label for="username">名称:</label>
								<input type="text" name="username" id="username" placeholder="请输入名称(不超过10位)" />
							</div>
							<label for="password">密码:</label>
							<input type="password" name="password" id="password" placeholder="请输入密码(不超过10位)" />
						</div>
						<div class="comfirm">
							<label for="confirm">确认密码:</label>
							<input type="password" name="confirm" id="confirm" placeholder="请确认密码" />
						</div>
						<div>
							<label for="sex">性别:</label>
							<div id="gender">
								<input type="radio" name="sex" checked id="sex" value="male"><span id="sex">男</span>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="radio" name="sex" value="female"><span id="sex" >女</span>
							</div>
						</div>


						<div class="hobby">
							<label for="hobby">影视爱好:</label>
							<input type="text" name="hobby" id="hobby" placeholder="兴趣爱好" />
						</div>
						<p id="agree">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点击【注册】按钮，即代表您已同意
							<a href="register.html">用户协议</a>
							和<a href="register.html">《隐私条款》</a>
						</p>
						<button type="submit" id="btn">注册</a></button>
						<button type="submit" id="btn"><a href="../login.html">返回</a></button>
					</form>
					<div id="bottom">
						<img src="img/login/insert1.png" />
					</div>
				</div>

			</div>
		</div>

	</body>
</html>
