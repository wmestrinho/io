package Servlets;

import data.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




/**
 * Created by WagnerMestrinho on 1/29/17.
 */
@WebServlet(name = "Servlet", urlPatterns = "/userProfile")
public class Servlet extends HttpServlet {
    private final static String filePath = "/userInfo.json";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        int age = Integer.parseInt(request.getParameter("age"));
        String city = request.getParameter( "city");
        String county = request.getParameter( "county");



        User user = new User(firstName, lastName, age, city,county);
        user.writeUserToDisk(filePath);

        request.getSession().setAttribute("result","User Information added to file!");

        String nextJSP = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);



    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
