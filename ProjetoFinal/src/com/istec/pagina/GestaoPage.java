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
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
	

	public class GestaoPage extends JFrame {

		private JPanel contentPane;

		
		public GestaoPage() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 641);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLUE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton Manage = new JButton("Manage");
			Manage.setBounds(20, 13, 117, 29);
			contentPane.add(Manage);
			Manage.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Clicou no Back!");
				}
			});
			Manage.setOpaque(true);
			Manage.setBorderPainted(false);
			
			JButton Stats = new JButton("Stats");
			Stats.setBounds(20, 53, 117, 29);
			contentPane.add(Stats);
			Stats.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Clicou no Registo!");
				}
			});
			Stats.setOpaque(true);
			Stats.setBorderPainted(false);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(146, 123, 702, 426);
			contentPane.add(tabbedPane);
			
			JPanel panel = new JPanel();
			panel.setBounds(147, 13, 610, 82);
			contentPane.add(panel);
			
			JButton Adicionar = new JButton("Add");
			Adicionar.setOpaque(true);
			Adicionar.setBorderPainted(false);
			Adicionar.setBounds(781, 13, 98, 82);
			contentPane.add(Adicionar);
			
			JButton AddDrink = new JButton("AddDrink");
			AddDrink.setBounds(757, 560, 89, 23);
			contentPane.add(AddDrink);
			
			JToggleButton Snacks = new JToggleButton("Snacks");
			Snacks.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (Snacks.isSelected()) {
						Snacks.setBackground(Color.RED);
					}
					else {
						Snacks.setBackground(Color.BLUE);
					}
				}
			});
			Snacks.setBounds(218, 99, 121, 23);
			contentPane.add(Snacks);
			
			JToggleButton Drinks = new JToggleButton("Drinks");
			Drinks.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (Drinks.isSelected()) {
						Drinks.setBackground(Color.RED);
					}
					else {
						Drinks.setBackground(Color.BLUE);
					}
				}
			});
			Drinks.setBounds(347, 99, 121, 23);
			contentPane.add(Drinks);
			
			JToggleButton HotDrinks = new JToggleButton("HotDrinks");
			HotDrinks.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (HotDrinks.isSelected()) {
						HotDrinks.setBackground(Color.RED);
					}
					else {
						HotDrinks.setBackground(Color.BLUE);
					}
				}
			});
			HotDrinks.setBounds(478, 99, 121, 23);
			contentPane.add(HotDrinks);
			
			setResizable(false);
		}
	}

