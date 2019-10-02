package com.ui;
import java.awt.GridLayout;

import javax.swing.*;


import java.awt.event.*;

public class Home implements ActionListener {
	JFrame frm;
	JPanel p1;
	JButton bregister,blogin;
	
	public Home(){
		frm=new JFrame();
		frm.setSize(400,400);
		frm.setVisible(true);
		
		p1=new JPanel();
		frm.add(p1);
	
		GridLayout gl=new GridLayout(1,2);
		p1.setLayout(gl);
		
		bregister=new JButton("Register Here");
		blogin=new JButton("Login");
		p1.add(bregister);
		p1.add(blogin);
		bregister.addActionListener(this);
		blogin.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==bregister){
			
			Registration r=new Registration();
			frm.dispose();
		}
		if(e.getSource()==blogin){
			LoginUi l=new LoginUi();
			frm.dispose();
		}
		
		
	}
}







