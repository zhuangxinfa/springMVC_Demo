<%--
  Created by IntelliJ IDEA.
  User: zhuan
  Date: 2020/4/18
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
<form action="param/saveAccount" method="post">
    昵称:<input type="text" name="username" /><br/>
    密码:<input type="text" name="password" /><br/>
    金额:<input type="text" name="money" /><br/>
    用户姓名:<input type="text" name="user.uname" /><br/>
    用户年龄:<input type="text" name="user.age" /><br/>
    <input type="submit" value="提交" /><br/>
</form>
--%>
<!--数据是集合类型该怎么办？list和map-->
<%--
<form action="param/saveAccount" method="post">
    昵称:<input type="text" name="username" /><br/>
    密码:<input type="text" name="password" /><br/>
    金额:<input type="text" name="money" /><br/>
    <!--存进Account中的list中去-->
    用户姓名:<input type="text" name="listtest[0].uname" /><br/>
    用户年龄:<input type="text" name="listtest[0].age" /><br/>
    <!--存进Account中的map中去-->
    用户姓名:<input type="text" name="map[one].uname" /><br/>
    用户年龄:<input type="text" name="map[one].age" /><br/>

    <input type="submit" value="提交" /><br/>
</form>
--%>
<%--
<form action="param/saveUser" method="post">
    用户姓名:<input type="text" name="uname" /><br/>
    用户年龄:<input type="text" name="age" /><br/>
    出生日期:<input type="text" name="date" /><br/>

    <input type="submit" value="提交" /><br/>
</form>
--%>
<a href="param/testServerlet">serverlet原生的API</a>
</body>
</html>
