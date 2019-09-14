<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 7/4/2019
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <title>Admin Manager</title>

    <link href="${pageContext.request.contextPath}/Content/admin/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/Content/admin/lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/Content/admin/css/style.css" rel="stylesheet">
    <%--Form--%>
    <link href="${pageContext.request.contextPath}/Content/form/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/Content/form/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/Content/form/bootstrap.min.js"></script>
    <style href="${pageContext.request.contextPath}/Content/form/form.css" rel="stylesheet"></style>
</head>

<body>
<section id="container">
    <!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
    <!--header start-->
    <header class="header black-bg">
        <div class="sidebar-toggle-box">
            <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
        </div>
        <!--logo start-->
        <a href="/homes" class="logo"><b>Fitness<span>Gym</span></b></a>
        <!--logo end-->
        <div class="nav notify-row" id="top_menu">
        </div>
        <div class="top-menu">
            <ul class="nav pull-right top-menu">
                <li><a class="logout" href="login.html"></a></li>
            </ul>
        </div>
    </header>
    <!--header end-->
    <!-- **********************************************************************************************************************************************************
        MAIN SIDEBAR MENU
        *********************************************************************************************************************************************************** -->
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <fieldset>
                    <table  class="table table-bordered">
                        <thead>
                        <tr>
                            <th scope="col">Tên khách hàng</th>
                            <th scope="col">Địa chỉ</th>
                            <th scope="col">Số điện thoại</th>
                            <th scope="col">id nhân viên</th>
                            <th scope="col" colspan="2">Chức năng</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items='${requestScope["CourseDAO"]}' var="Course">
                            <tr>
                                <td>${Course.getName()}</td>
                                <td><fmt:formatNumber type="number" maxFractionDigits="3" value="${Course.getPrice()}"/><span>VNĐ</span></td>
                                <td><img src="${pageContext.request.contextPath}/Content/images/files/pt/${Course.getImage()}"></td>
                                <td style="width: 173px;">${Course.getDescription()}</td>
                                <td>${Course.getStudyTime()}</td>
                                <td>${Course.getNameLesson()}</td>
                                <td>${Course.getDateCreate()}</td>
                                <td>${Course.getLastEdit()}</td>
                                <td><a class="btn btn-warning" href="/admins?action=editCourse&id=${Course.getId()}">edit</a></td>
                                <td><a class="btn btn-danger" href="/admins?action=delete&id=${Course.getId()}">delete</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </fieldset>

            </div>
            <!-- /row -->
        </section>
    </section>
    <!--main content end-->
    <!--footer start-->
    <footer class="site-footer">
        <div class="text-center">
            <p>
                &copy; Copyrights <strong>Nhóm 1 FitnessGym</strong>. All Rights Reserved
            </p>
            <div class="credits">
                -->
                Created with Dashio template by <a href="https://templatemag.com/">TemplateMag</a>
            </div>
            <a href="/admins" class="go-top">
                <i class="fa fa-angle-up"></i>
            </a>
        </div>
    </footer>
</section>
<a class="hpbtn" href="/admins?action=createCourse" ></a>
</body>

</html>

