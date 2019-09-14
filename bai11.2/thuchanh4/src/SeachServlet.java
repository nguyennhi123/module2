import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SeachServlet",urlPatterns = "/seach")
public class SeachServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("name","tên");
        dictionary.put("morning","buổi sáng");
        dictionary.put("sun","mặt trời");
        dictionary.put("hello","xin chào");
        String seach = request.getParameter("seach");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(seach);
        if (result!=null){
            writer.println("world: "+seach);
            writer.println("result: "+ result);
        }else {
            writer.println("not found");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
