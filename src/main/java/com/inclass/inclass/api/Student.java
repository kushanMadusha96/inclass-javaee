package com.inclass.inclass.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "student", value = "/std",loadOnStartup = 3)
public class Student extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init student servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String id = req.getParameter("id");
            System.out.println(id);
            System.out.println(req.getHeader("abc"));
    }
}
