<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
  <title>mysite</title>
  <meta http-equiv="content-type" message="text/html; charset=utf-8">
  <link href="/assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="container">
  <c:import url="/WEB-INF/mysite/views/include/header.jsp"/>
  <div id="message">
    <div id="user">
      <form id="login-form" name="loginform" method="post"
            action="/user">
        <input type="hidden" name="a" value="login">
        <label class="block-label" for="email">이메일</label>
        <input id="email" name="email" type="text" value="">
        <label class="block-label">패스워드</label>
        <input name="passwd" type="password" value="">
        <input type="submit" value="로그인">
      </form>
    </div>
  </div>
  <c:import url="/WEB-INF/mysite/views/include/navigation.jsp"/>
  <c:import url="/WEB-INF/mysite/views/include/footer.jsp"/>
</div>
</body>
</html>
