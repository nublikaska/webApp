import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello2")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("hello1" + req.getMethod());
        HttpSession httpSession =  req.getSession();
        if(httpSession.getValue("name") == null) {
            httpSession.putValue("name", "hello session");
            resp.getWriter().append("no session");
        } else {
            resp.getWriter().append((String)httpSession .getValue("name"));
        }
    }
}
