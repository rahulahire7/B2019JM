package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBApplication;
import com.model.Register;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("saveserv1");
	String s1=request.getParameter("rno");
	String s2=request.getParameter("fname");
	String s3=request.getParameter("pass");
	String s4=request.getParameter("bal");
	System.out.println("saveserv2");
	int rno=Integer.parseInt(s1);
	double bal=Double.parseDouble(s4);
	
	Register r=new Register();
	System.out.println("saveserv3");
	r.setRno(rno);
	r.setFname(s2);
	r.setPass(s3);
	r.setBal(bal);
	
	System.out.println("saveserv4");
	
	DBApplication db=new DBApplication();
	List<Register> lst=new LinkedList<Register>();
	lst.add(r);
	System.out.println("test1");
	int i=db.saveData(lst);
	System.out.println("test2 i value"+i);
	if(i>0)
	{
		System.out.println("test3");
		response.sendRedirect("Login.jsp");
	}
	System.out.println("test4");
	
	
	
	
	
	
		
		
		
	}
}
