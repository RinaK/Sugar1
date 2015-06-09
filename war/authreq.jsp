<%@ page 
import="com.google.appengine.api.users.*" 
pageEncoding="utf-8"
contentType="text/html;charset=utf-8"
%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
<%
UserService userService = UserServiceFactory.getUserService();
User user = userService.getCurrentUser();
String msg;

if( user != null ){

  msg = "ようこそ! あなたは <b>" + user.getNickname() + "</b> という名前でログインしています。"
    + " <a href='" + userService.createLogoutURL("/") + "'>サインアウト</a>";
  
}
else {

  msg = "こんにちは! こちらから "
    + "<a href='" + userService.createLoginURL("/login") + "'>サインイン</a> してください!";
}

System.out.println( msg );
%>
<p class="round"><%= msg %></p>
</body>
</html>