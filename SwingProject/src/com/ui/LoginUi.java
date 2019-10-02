package com.ui;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import com.dao.ProjectDao;
import com.model.Login;
import com.model.Register;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class  LoginUi  implements ActionListener {
	JFrame frm;
	JPanel p1;
	JLabel lunm,lpass;
	JTextField tfnm,tunm;
	JTextField tpass;
	JButton blogin,bback;

	public  LoginUi (){
		frm=new JFrame();
		frm.setSize(400,400);
		frm.setVisible(true);

		p1=new JPanel();
		frm.add(p1);

		GridLayout gl=new GridLayout(3,2);
		p1.setLayout(gl);
		p1.setBackground(Color.white);
		lunm=new JLabel("User Name");
		lpass=new JLabel("Password");

		tunm=new JTextField(10);
		tpass=new JTextField(10);

		p1.add(lunm);
		p1.add(tunm);
		p1.add(lpass);
		p1.add(tpass);

		bback=new JButton("Home");
		blogin=new JButton("login");
		p1.add(blogin);
		p1.add(bback);

		blogin.addActionListener(this);
		bback.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean b=false;
		Object login = null;
		System.out.println("hi..");
		if(e.getSource()==blogin){
			System.out.println("hello...");
			String uname=tunm.getText();
			//char  pass[]=tpass.getPassword();
			String strpass=tpass.getText();
			
			Login  l=new  Login ();
			l.setUserName(uname);
			l.setPassword(strpass);
			List< Login > lst=new ArrayList< Login >();
			lst.add(l);
			ProjectDao p=new ProjectDao();
			p.getConnection();
			b=p.log_in(lst);
			if(b){
				MainUi f=new MainUi();
				frm.dispose();
			}
		}
		if(e.getSource()==bback){
			Home h=new Home();
			frm.dispose();
		}
	}		
}







