package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegisterDao;
import com.model.Register;

/**
 * Servlet implementation class AccountController
 */
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test1");
	int accNo =Integer.parseInt(request.getParameter("ano"));
	String custName=request.getParameter("cname");
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	int bal=Integer.parseInt(request.getParameter("bal"));
	System.out.println("test2");
	Register r=new Register();
	r.setAccNo(accNo);
	r.setCustName(custName);
	r.setUserName(uname);
	r.setPass(pass);
	r.setAccBal(bal);
	
	RegisterDao rd=new RegisterDao();
	List<Register> lst=new ArrayList<Register>();
	lst.add(r);
	
	int i=rd.saveData(lst);
	if(i>0){
		response.sendRedirect("Login.html");
	}
	
	
	}

}







