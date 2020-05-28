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

public class ProdutoPage extends JFrame {

	private JPanel contentPane;
	private PlaceholderTextField designacao;
	private PlaceholderTextField codigo;
	private PlaceholderPasswordField preco;

	public ProdutoPage() {
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
		
		designacao = new PlaceholderTextField();
		designacao.setBounds(99, 109, 179, 26);
		designacao.setPlaceholder("Designação");
		designacao.setOpaque(true);

		MenuLogin.add(designacao);
		designacao.setColumns(10);
		
		codigo = new PlaceholderTextField();
		codigo.setBounds(99, 146, 179, 26);
		codigo.setPlaceholder("Código");
		codigo.setOpaque(true);

		MenuLogin.add(codigo);
		codigo.setColumns(10);
		
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
		
		preco = new PlaceholderPasswordField();
		preco.setOpaque(true);
		preco.setPlaceholder("Preço");
		preco.setBounds(99, 183, 179, 26);
		MenuLogin.add(preco);
		
		JComboBox Tipo_produto = new JComboBox();
		Tipo_produto.setBounds(99, 220, 179, 22);
		MenuLogin.add(Tipo_produto);
		Tipo_produto.addItem("Snacks");
		Tipo_produto.addItem("Drink");
		Tipo_produto.addItem("Hot Drink");
		
			
		setResizable(false);
	}
}
