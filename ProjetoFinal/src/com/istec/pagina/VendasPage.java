package com.istec.pagina;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
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

import com.istec.main.Dados;
import com.istec.objectos.Produto;
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
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
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
			FlowLayout flowLayout1 = (FlowLayout) Snacks.getLayout();
			flowLayout1.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Snacks", null, Snacks, null);
			
			
			
			if(Dados.getinstance().getProdutos() != null) {
			
			ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
			for (Produto p: produtos) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				Snacks.add(lblNewLabel);
			}
		}
			
			
			JPanel Drinks = new JPanel();
			FlowLayout flowLayout2 = (FlowLayout) Drinks.getLayout();
			flowLayout2.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Drinks", null, Drinks, null);
			
			
			
			if(Dados.getinstance().getProdutos() != null) {
			
			ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
			for (Produto p: produtos) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				Drinks.add(lblNewLabel);
			}
		}
			
			JPanel HotDrinks = new JPanel();
			FlowLayout flowLayout3 = (FlowLayout) HotDrinks.getLayout();
			flowLayout3.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Hot Drinks", null, HotDrinks, null);
			
			
			
			if(Dados.getinstance().getProdutos() != null) {
			
			ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
			for (Produto p: produtos) {
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				HotDrinks.add(lblNewLabel);
			}
		}
			
			
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 283, 579);
			contentPane.add(panel);
			panel.setLayout(new GridLayout(0, 3, 0, 0));
			
			JLabel Nome = new JLabel("Nome");
			Nome.setVerticalAlignment(SwingConstants.TOP);
			panel.add(Nome);
			
			JLabel Quantidade = new JLabel("Quantidade");
			Quantidade.setVerticalAlignment(SwingConstants.TOP);
			panel.add(Quantidade);
			
			JLabel Preco = new JLabel("Preco");
			Preco.setVerticalAlignment(SwingConstants.TOP);
			panel.add(Preco);
			
			JButton Voltar = new JButton("Back");
			Voltar.setBounds(805, 0, 89, 23);
			contentPane.add( Voltar);
			Voltar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					GestaoPage gestaop = new GestaoPage();
					gestaop.setVisible(true);
					dispose();
					
				}
			});
			Voltar.setBounds(805, 0, 89, 23);
			contentPane.add(Voltar);
			
			setResizable(false);
		}
}
