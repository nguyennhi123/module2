package com.codegym.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.codegym.model.Customer;
import com.codegym.service.CustomerSevice;
import com.codegym.service.CustomerSevicelmpl;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerSevice customerSevice = new CustomerSevicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action==null){
    action = "";
}
switch (action){
    case "create":
        createCustomer(request,response);
        break;
    case "edit":
        updateCustomer(request,response);
        break;
    case "delete":
        deleteCustomer(request,response);
        default:
            break;

}

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action == null){
    action = "";
}
switch (action){
    case "create":
        sho
}
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response){
int id = Integer.parseInt(request.getParameter("id"))
    }
}
