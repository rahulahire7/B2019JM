package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<Product> lst=null;
	public void init()
	{
		lst=new LinkedList<Product>();
	}
	
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int prodId=Integer.parseInt(request.getParameter("pid"));
		String prodName=request.getParameter("pname");
		double prodPrice=Double.parseDouble(request.getParameter("pprice"));
		int prodQty=Integer.parseInt(request.getParameter("pqty"));
		Product p1=new Product(prodId, prodName, prodPrice, prodQty);
		lst.add(p1);
		
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession(true);
		session.setAttribute("shop",lst);
		pw.print("DO you want to add more product");
		pw.print("<a href='Product.jsp'>YES</a>");
		pw.print("<a href='Cart.jsp'>YES</a>");
		
		//pw.print("<a href='CartController'>NO</a>");
				
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
