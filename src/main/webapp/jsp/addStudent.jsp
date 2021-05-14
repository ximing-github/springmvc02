<%--
  Created by IntelliJ IDEA.
  User: 惜名
  Date: 2021/5/13
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>

<html>
    <head>
        <title>注册学生</title>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.2.1.js"></script>
        <script type="text/javascript">
            $(function (){
                $("button").click(function(){
                    //alert("msg")
                    $.ajax({
                        url:"ajax.do",
                        data:{
                            name:"李四",
                            age:"20"
                        },
                        type:"post",
                        //dataType:"json",
                        success:function (data){
                            alert(data);
                        }
                    })
                })
            })
        </script>
    </head>

    <body>
        <div align="center">
            <form action="${pageContext.request.contextPath}/addStudent.do" method="post">
                学生姓名<input type="text" name="name"><br/>
                学生年龄<input type="text" name="age"><br/>
                       <input type="submit" value="提交">

            </form>
            <button>提交ajax请求</button>
        </div>
    </body>
</html>
