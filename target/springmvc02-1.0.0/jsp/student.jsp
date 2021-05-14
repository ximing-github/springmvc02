<%--
  Created by IntelliJ IDEA.
  User: 惜名
  Date: 2021/5/13
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>学生管理</title>
        <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    </head>
    <body>
        <h1 align="center">${msg}</h1>
        <div align="center">

                <table >
                    <tr>
                        <td><a href="jsp/addStudent.jsp">注册学生</a></td>
                    </tr>
                    <tr>
                        <td><a href="jsp/selectStudent.jsp">查询学生</a></td>
                    </tr>

                </table>

        </div>

    </body>
</html>
