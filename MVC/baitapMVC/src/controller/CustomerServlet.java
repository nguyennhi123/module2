package controller;

import entity.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private Customer customer = new Customer();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createCustomer(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    edit(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                break;
            default:
        }


        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    showCreate(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    showEdit(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    delete(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }

    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        List<Customer> customers = this.customer.getAllCustomer();
        request.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createCustomer(HttpServletRequest request,HttpServletResponse response ) throws SQLException{
        int idcustomer = 0;
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String sex = request.getParameter("sex");
        int idemployers = Integer.parseInt(request.getParameter("idemployers"));
        Customer customer = new Customer(idcustomer,name,idemployers,phone,sex);
        this.customer.create(customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("message", "New customer was created");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showCreate(HttpServletRequest request,HttpServletResponse response)throws SQLException{
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            requestDispatcher.forward(request,response);

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void edit(HttpServletRequest request,HttpServletResponse response)throws SQLException,IOException{

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String sex = request.getParameter("sex");
        int idcustomer = Integer.parseInt(request.getParameter("id"));
        int idemployers = Integer.parseInt(request.getParameter("idemployers"));
        Customer customer = new Customer(idcustomer,name,idemployers,phone,sex);
        this.customer.edit(customer);
        response.sendRedirect("customer");


    }
    private void showEdit(HttpServletRequest request,HttpServletResponse response)throws SQLException{
        int idcustomer = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customer.getCustomer(idcustomer);
        RequestDispatcher requestDispatcher;
        if (customer==null){
            requestDispatcher = request.getRequestDispatcher("error.jsp");
        }else {
            request.setAttribute("customers",customer);
            requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void delete(HttpServletRequest request,HttpServletResponse response)throws SQLException,IOException{
        int idcustomer = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customer.getCustomer(idcustomer);
        this.customer.delete(customer);
        response.sendRedirect("customer");

    }

}
