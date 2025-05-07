package Tin.dev;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/home")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name"); // nhận từ form

        response.getWriter().println("<html><body>");
        if (name != null && !name.isEmpty()) {
            response.getWriter().println("<h1>Xin chào, " + name + "!</h1>");
        } else {
            response.getWriter().println("<h1>Hello from Servlet!</h1>");
        }
        response.getWriter().println("</body></html>");
    }

}
