package filter;

import model.Model;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/list")
public class ListFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("List filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        Model model = Model.getInstance();
//        if (model.list().isEmpty()) {
//            HttpServletRequest req = (HttpServletRequest) request;
//            String name = req.getParameter("name");
//            req.setAttribute("emptyList", name);
//            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/add");
//            requestDispatcher.forward(request, response);
//        } else {
//            chain.doFilter(request, response);
//        }
        // TODO: 04.09.2019 Сделать еще один сервлет, для которого сделать переадресацию
        // TODO: 04.09.2019 https://www.codejava.net/java-ee/servlet/
    }

    @Override
    public void destroy() {
        System.out.println("List filter destroy");
    }
}
