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
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import java.text.MessageFormat;
import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class VendasPage extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=30,79
	 */
                                     
	
	/**
	 * Launch the application.
	 */
	

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
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 283, 579);
			contentPane.add(panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[] {90, 90, 90};
			gbl_panel.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
			gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			
			JLabel Nome = new JLabel("Nome");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			panel.add(Nome, gbc_lblNewLabel);
			
			JLabel Quantidade = new JLabel("Quantidade");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 0;
			panel.add(Quantidade, gbc_lblNewLabel_1);
			
			JLabel Preco = new JLabel("Preco");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel_2.gridx = 2;
			gbc_lblNewLabel_2.gridy = 0;
			panel.add(Preco, gbc_lblNewLabel_2);
			
			setResizable(false);
		}
}
