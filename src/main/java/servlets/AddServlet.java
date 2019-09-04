package servlets;

import entities.User;
import model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/add")
public class AddServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pass");
        User user = new User(name, password);
        Model model = Model.getInstance();
        String userStatus;
        if (!model.getUser(user)) {
            model.add(user);
            userStatus = "userName";
        } else {
            userStatus = "existingUser";
        }

        req.setAttribute(userStatus, name);
        doGet(req, resp);
    }
}
