package controller;

import entity.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "customerServlet",urlPatterns = "/Customer")
public class customerServlet extends HttpServlet {
    private Customer customer = new Customer();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action==null){
    action = "";
    }
    switch (action){
        case "create":



}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public void listCustomer(HttpServletRequest request,HttpServletResponse response){
        List<Customer>list = this.customer.getAllCustomer();
        request.setAttribute("customer",list);

    }
}
