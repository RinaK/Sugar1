package com.sugarpro;
 
import java.io.IOException;
import java.util.*;

import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
 
public class EditLinkDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        long id = Long.parseLong(req.getParameter("id"));
        String shohin = req.getParameter("shohin");
        String pricea = req.getParameter("pricea");
        int price=Integer.parseInt(pricea);
        String password = req.getParameter("password");
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        LinkData data = (LinkData)manager.getObjectById(LinkData.class,id);
        data.setShohin(shohin);
        data.setPrice(price);
        data.setPassword(password);
        manager.close();
        resp.sendRedirect("index.html");
    }
}