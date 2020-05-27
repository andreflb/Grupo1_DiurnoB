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
import javax.swing.plaf.nimbus.FileChooserPainter;
import javax.swing.plaf.nimbus.AbstractRegionPainter.PaintContext;
import java.awt.Toolkit;
	

	public class GestaoPage extends JFrame {

		private JPanel contentPane;

		
		public GestaoPage() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 923, 755);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLUE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton Manage = new JButton("Manage");
			Manage.setBounds(20, 26, 117, 29);
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
			Stats.setBounds(20, 66, 117, 29);
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
			
			setResizable(false);
		}
	}

