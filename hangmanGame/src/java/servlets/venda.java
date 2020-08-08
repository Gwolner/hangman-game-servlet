package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "venda", urlPatterns = {"/venda"})
public class venda extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        float valor = Float.parseFloat(request.getParameter("valor"));
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        float valorTotal = valor * quantidade;
        String produto = request.getParameter("produto"); 
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>resultado da venda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Venda do produto:"+produto+"</h1>");
            out.println("Total a pagar: R$ "+valorTotal);
            out.println("</body>");
            out.println("</html>");
        }
    }

   
}
