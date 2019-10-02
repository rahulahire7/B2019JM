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

public class  MainUi  {
	JFrame frm;
	JPanel p1;
	JLabel lunm,lpass;
	JTextField tfnm,tunm;
	JPasswordField tpass;
	JButton blogin,bback;

	public MainUi() {
		frm=new JFrame();
		frm.setSize(400,400);
		frm.setVisible(true);

		p1=new JPanel();
		frm.add(p1);

		p1.setBackground(Color.white);
		lunm=new JLabel("ABCD BANK");
		p1.add(lunm);
	}
		
}







