package controller;


import entity.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;

    @WebServlet(name = "CustomerServlet", urlPatterns = "/Customer")
public class CustomerServlet extends HttpServlet {
        private Customer customerDAO = new Customer();

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "createCustomer":
                    try {
                        createCustomer(request, response);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "edit":
                    try {
                        updateCustomer(request, response);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    break;
                case "delete":
                    break;
                    default:
                        break;


            }

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "createCustomer":
                    ShowCreateCustomer(request, response);
                    break;
                case "edit":
                    try {
                        showEditCustomer(request, response);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "delete":
                    try {
                        deleteCustomer(request,response);
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                case "view":
                    break;
                default:
                    try {
                        listCustomer(request, response);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException {
            List<Customer> customers = this.customerDAO.getAllCustomer();
            request.setAttribute("customers", customers);

            RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String customerName = request.getParameter("customerName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            int idcustomer = 0;
            Customer newCustomer = new Customer(idcustomer, customerName, phone, address);
            this.customerDAO.createCustomer(newCustomer);
            RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/create.jsp");
            request.setAttribute("message", "New customer was created");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.getStackTrace();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }

        private void ShowCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/create.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
               e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            String customerName = request.getParameter("customerName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            int idcustomer = Integer.parseInt(request.getParameter("id"));
            Customer customernew = new Customer(idcustomer, customerName, phone, address);

            this.customerDAO.edit(customernew);
            response.sendRedirect("Customer");
        }

        private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
            int idcustomer = Integer.parseInt(request.getParameter("id"));
            Customer customerNew = this.customerDAO.getCustomer(idcustomer);
            RequestDispatcher dispatcher;
            if (customerNew == null) {
                dispatcher = request.getRequestDispatcher("error-404.jsp");
            } else {
                request.setAttribute("customer", customerNew);
                dispatcher = request.getRequestDispatcher("Customer/edit.jsp");
            }
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private void deleteCustomer(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException, SQLException {
            int idcustomer = Integer.parseInt(request.getParameter("id"));
            Customer customerNew = this.customerDAO.getCustomer(idcustomer);
            this.customerDAO.delete(customerNew);
            response.sendRedirect("Customer");
        }
    }




