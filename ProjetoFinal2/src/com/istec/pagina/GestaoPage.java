package com.istec.pagina;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
	

	@SuppressWarnings("serial")
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
					JOptionPane.showMessageDialog(null, "Clicou no Manage!");
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
					JOptionPane.showMessageDialog(null, "Clicou no Stats!");
				}
			});
			Stats.setOpaque(true);
			Stats.setBorderPainted(false);
			
			
			
			JPanel vendedorlabel = new JPanel();
			vendedorlabel.setBounds(147, 13, 610, 82);
			contentPane.add(vendedorlabel);
			
			
			
			
			JTabbedPane AdicionarProduto = new JTabbedPane(JTabbedPane.TOP);
			AdicionarProduto.setBounds(146, 106, 684, 385);
			contentPane.add(AdicionarProduto);
			
			JPanel Snacks = new JPanel();
			AdicionarProduto.addTab("Snacks", null, Snacks, null);
			
			JPanel Drinks = new JPanel();
			AdicionarProduto.addTab("Drinks", null, Drinks, null);
			
			JPanel HotDrinks = new JPanel();
			AdicionarProduto.addTab("Hot Drinks", null, HotDrinks, null);
			
			JLabel AddVendedor = new JLabel("AddVendedor");
			AddVendedor.setBounds(767, 13, 86, 66);
			AddVendedor.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gonga\\git\\Grupo1_DiurnoB\\ProjetoFinal\\addUser.png").getImage().getScaledInstance(AddVendedor.getWidth(),AddVendedor.getHeight(), Image.SCALE_DEFAULT)));
			contentPane.add(AddVendedor);
			AddVendedor.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					VendedorPage vendor = new VendedorPage();
					vendor.setVisible(true);
					dispose();
					
				}
			});
			AddVendedor.setBounds(771, 13, 98, 75);
			contentPane.add(AddVendedor);
			
			JLabel AddProduto = new JLabel("AddProduto");
			AddProduto.setBounds(758, 510, 98, 91);
			AddProduto.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\gonga\\git\\Grupo1_DiurnoB\\ProjetoFinal\\add.png").getImage().getScaledInstance(AddProduto.getWidth(),AddProduto.getHeight(), Image.SCALE_DEFAULT)));
			contentPane.add(AddProduto);
			AddProduto.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					ProdutoPage product = new ProdutoPage();
					product.setVisible(true);
					dispose();
					
				}
			});
			
			contentPane.add(AddProduto);
			
			setResizable(false);
		}
	}

