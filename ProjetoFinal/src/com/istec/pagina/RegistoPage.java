package com.istec.pagina;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.istec.paginas.componetes.PlaceholderPasswordField;
import com.istec.paginas.componetes.PlaceholderTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import javax.swing.JComboBox;

public class RegistoPage extends JFrame {

	private JPanel contentPane;
	private PlaceholderTextField username;
	private PlaceholderPasswordField pwd;
	private PlaceholderTextField company;
	private PlaceholderTextField vat;
	private PlaceholderTextField email;
	private PlaceholderPasswordField cfn;

	
	public RegistoPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel MenuLogin = new JPanel();
		MenuLogin.setBackground(new Color(204, 204, 204, 150));
		MenuLogin.setBounds((getWidth()/2)-(365/2), (getHeight()/2)-(379/2), 365, 379);
		contentPane.add(MenuLogin);
		MenuLogin.setLayout(null);
		
		company = new PlaceholderTextField();
		company.setBounds(99, 35, 179, 26);
		company.setPlaceholder("Company Name");
		company.setOpaque(true);

		MenuLogin.add(company);
		company.setColumns(10);
		
		vat = new PlaceholderTextField();
		vat.setBounds(99, 72, 179, 26);
		vat.setPlaceholder("VAT Number");
		vat.setOpaque(true);

		MenuLogin.add(vat);
		vat.setColumns(10);
		
		username = new PlaceholderTextField();
		username.setBounds(99, 109, 179, 26);
		username.setPlaceholder("Username");
		username.setOpaque(true);

		MenuLogin.add(username);
		username.setColumns(10);
		
		email = new PlaceholderTextField();
		email.setBounds(99, 146, 179, 26);
		email.setPlaceholder("Email");
		email.setOpaque(true);

		MenuLogin.add(email);
		email.setColumns(10);
		
		JButton Registo = new JButton("Registo");
		Registo.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no Registo!");
			}
		});
		Registo.setOpaque(true);
		Registo.setBorderPainted(false);
		Registo.setBounds(213, 302, 117, 29);
		MenuLogin.add(Registo);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Clicou no Back!");
			}
		});
		Back.setOpaque(true);
		Back.setBorderPainted(false);
		Back.setBounds(50, 302, 117, 29);
		MenuLogin.add(Back);
		
		pwd = new PlaceholderPasswordField();
		pwd.setOpaque(true);
		pwd.setPlaceholder("Password");
		pwd.setBounds(99, 183, 179, 26);
		MenuLogin.add(pwd);
		
		cfn = new PlaceholderPasswordField();
		cfn.setOpaque(true);
		cfn.setPlaceholder("Confirm Password");
		cfn.setBounds(99, 220, 179, 26);
		MenuLogin.add(cfn);
		
		JComboBox Tipo_vendedor = new JComboBox();
		Tipo_vendedor.setBounds(99, 257, 179, 22);
		MenuLogin.add(Tipo_vendedor);
		Tipo_vendedor.addItem("Restauração");
		Tipo_vendedor.addItem("Farmacia");
		Tipo_vendedor.addItem("Oficina");
		
		JLabel backgroundImage = new JLabel("New label");
		backgroundImage.setBounds(0, 0, 923, 755);
		backgroundImage.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\ndrew\\git\\projetofinal\\ProjetoFinal\\POS.jpg").getImage().getScaledInstance(backgroundImage.getWidth(),backgroundImage.getHeight(), Image.SCALE_DEFAULT)));
		contentPane.add(backgroundImage);
		
		setResizable(false);
	}
}
