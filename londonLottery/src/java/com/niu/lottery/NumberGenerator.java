/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niu.lottery;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "NumberGenerator", urlPatterns = {"/NumberGenerator"})
public class NumberGenerator extends HttpServlet {
    
    private List<Integer> expected;
    public Set<Integer> Lottery() 
    {
      Set<Integer> expected;
      Random random = new Random();
      Set<Integer> intSet = new HashSet<>();
      while (intSet.size() < 6) {
          intSet.add(random.nextInt(49) + 1);
      }
      //expected = intSet;
        // Do required initialization
      return intSet;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NumberGenerator</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NumberGenerator at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Set<Integer> numbers = this.Lottery();
         int[] ints = new int[numbers.size()];
        Iterator<Integer> iter = numbers.iterator();
        for (int i = 0; iter.hasNext(); ++i) {
            ints[i] = iter.next();
            request.setAttribute("port1", ints[0]);
            request.setAttribute("port2", ints[1]);
            request.setAttribute("port3", ints[2]);
            request.setAttribute("port4", ints[3]);
            request.setAttribute("port5", ints[4]);
            request.setAttribute("port6", ints[5]);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    /**
     * @return the expected
     */
    public List<Integer> getExpected() {
        return expected;
    }

    /**
     * @param expected the expected to set
     */
    public void setExpected(List<Integer> expected) {
        this.expected = expected;
    }

}
