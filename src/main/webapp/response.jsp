<%--
  Created by IntelliJ IDEA.
  User: zhuan
  Date: 2020/4/22
  Time: 7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.5.0.min.js"></script>
    <!--要想代码指向需要bean.xml配置不拦截js-->
    <script>
        $(function () {
            $("#btn").click(function () {
                //alert("hello button");
                //发送ajax请求
                $.ajax({
                    //编写json的格式并设置属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"Tom","password":"123","age":18}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            });
        });
    </script>
</head>
    <br/>
    <button id="btn">发送ajax请求</button>
<body>
</body>
</html>
