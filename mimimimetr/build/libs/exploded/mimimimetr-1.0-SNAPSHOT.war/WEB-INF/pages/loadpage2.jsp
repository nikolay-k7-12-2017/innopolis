<%--
  Created by IntelliJ IDEA.
  User: kolja
  Date: 15.02.2019
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page2</title>
</head>
<p>
<h2 align="center" style="color:#000000"> Мимимиметр </h2>
</p>

<p align="center"> <strong> Кто из них мимимишнее? Кликни по фотографии! </strong>
</p>
<body>
<img src="images/logo.jpg"/>
<table border="1">

    <caption>Report</caption>

    <tr>
        <td><p> summa contracts: </td>
        <td><p>duration: </p></td>

    </tr>



    <div style="overflow: scroll;height: 300px;width: 450px;">
        <p align="center">Plannned cases:</p>
        <p style=”text-align:left;line-height:2;">

        <p>
            <img src="${outPicture}"/>
            Дата выполнения: <c:out value="${outPicture}">
        </p>

        </c:out> Описание: <c:out value="${nach.name}"> </c:out>

        </p>
    </div>

</table>

<a href="<c:url value="/logautPage"/>">TEST</a>

</body>
</html>
