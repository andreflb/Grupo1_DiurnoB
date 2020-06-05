package com.istec.pagina;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JToolBar;
public class VendasPage extends JFrame {

	private JPanel contentPane;
                                     
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendasPage frame = new VendasPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			
			
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VendasPage() {
			JPanel contentPane;
		
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 641);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLUE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JTabbedPane AdicionarProduto = new JTabbedPane(JTabbedPane.TOP);
			AdicionarProduto.setBounds(303, 11, 581, 579);
			contentPane.add(AdicionarProduto);
			
			JPanel Snacks = new JPanel();
			AdicionarProduto.addTab("Snacks", null, Snacks, null);
			
			JPanel Drinks = new JPanel();
			AdicionarProduto.addTab("Drinks", null, Drinks, null);
			
			JPanel HotDrinks = new JPanel();
			AdicionarProduto.addTab("Hot Drinks", null, HotDrinks, null);
			
			setResizable(false);
		}
}
