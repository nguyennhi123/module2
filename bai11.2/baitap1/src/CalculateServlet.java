import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "CalculateServlet",urlPatterns = "/Calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double price = Double.parseDouble(request.getParameter("Price"));
        double discount = Double.parseDouble(request.getParameter("Discount"));
        String product = request.getParameter("product");
        double discountAmount = price*discount/100;
        double discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>product: "+product+"</h1>");
        writer.println("<h1>Price:" + price+"</h1>");
        writer.println("<h1>Discount:" + discount+"%"+"</h1>");
        writer.println("<h1>discountAmount: "+discountAmount+"</h1>");
        writer.println("<h1>discountPrice: " +discountPrice+"</h1)>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
