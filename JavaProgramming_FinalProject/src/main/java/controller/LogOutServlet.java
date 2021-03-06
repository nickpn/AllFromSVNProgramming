package controller;

import dao.Dao;
import dao.impl.RoleDao;
import dao.impl.UserDao;
import model.Role;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "/logout")
public class LogOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dao<Role> roleDao = new RoleDao();
        HttpSession session = req.getSession();
        //Обнуляю сессию
        if (!(session.getAttribute("admin") == null)) {
            session.removeAttribute(roleDao.getById(1).getRoleName());
        }
        if (!(session.getAttribute("user") == null)) {
            session.removeAttribute(roleDao.getById(2).getRoleName());
        }
        if (!(session.getAttribute("mandator") == null)) {
            session.removeAttribute(roleDao.getById(3).getRoleName());
        }

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}