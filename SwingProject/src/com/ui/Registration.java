package com.ui;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

import com.dao.ProjectDao;
import com.model.Register;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Registration implements ActionListener {
	JFrame frm;
	JPanel p1;
	JLabel lrno,lfnm,lunm,lpass;
	JTextField trno,tfnm,tunm;
//	JPasswordField tpass;
	JTextField tpass;
	JButton bsave,bback;
	
	public Registration(){
		frm=new JFrame();
		frm.setSize(400,400);
		frm.setVisible(true);
		
		p1=new JPanel();
		frm.add(p1);
	
		GridLayout gl=new GridLayout(5,2);
		p1.setLayout(gl);
		
		p1.setBackground(Color.white);
		lrno=new JLabel("Reg No");
		lfnm=new JLabel("First Name");
		lunm=new JLabel("User Name");
		lpass=new JLabel("Password");
		
		trno=new JTextField(10);
		tfnm=new JTextField(10);
		tunm=new JTextField(10);
		//tpass=new JPasswordField(10);
		tpass=new JTextField(10);
		
		p1.add(lrno);
		p1.add(trno);
		p1.add(lfnm);
		p1.add(tfnm);
		p1.add(lunm);
		p1.add(tunm);
		p1.add(lpass);
		p1.add(tpass);
		
		bback=new JButton("Home");
		bsave=new JButton("Save");
		p1.add(bsave);
		p1.add(bback);
		
		bsave.addActionListener(this);
		bback.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==bsave){
			int rno=Integer.parseInt(trno.getText());
			String fname=tfnm.getText();
			String uname=tunm.getText();
			//char  pass[]=tpass.getPassword();
			//String strpass=pass.toString();
			String strpass=tpass.getText();
			System.out.println("UI PASS :"+strpass);
			
			Register r=new Register();
			r.setRegNo(rno);
			r.setFirstName(fname);
			r.setUserName(uname);
			r.setPassword(strpass);
			List<Register> lst=new ArrayList<Register>();
			lst.add(r);
			
			ProjectDao p=new ProjectDao();
			//p.getConnection();
			int i=p.saveData(lst);
			if(i>0){
				LoginUi l=new LoginUi();
				frm.dispose();
			}
			
			
		}
		if(e.getSource()==bback){
			Home h=new Home();
			frm.dispose();
		}
		
		
	}
}







