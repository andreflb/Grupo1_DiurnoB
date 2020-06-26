package com.istec.pagina;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import com.istec.main.Dados;
import com.istec.objectos.Produto;
import com.istec.objectos.Vendedor;

	

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
			contentPane.add( Manage);
			 Manage.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					VendasPage vendasp = new VendasPage();
					vendasp.setVisible(true);
					dispose();
					
				}
			});
			 Manage.setBounds(20, 13, 117, 29);
			contentPane.add(Manage);
			
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
			vendedorlabel.setBackground(Color.WHITE);
			vendedorlabel.setBounds(147, 13, 610, 82);
			
			
			
			
            if(Dados.getinstance().getVendedores() != null) {

                ArrayList<Vendedor> vendedores = Dados.getinstance().getVendedores();
                for (Vendedor p: vendedores) {
                    JLabel lblNewLabel5 = new JLabel();
                    lblNewLabel5.setBounds(0, 0, 40, 40);
                    lblNewLabel5.setIcon(new ImageIcon(new ImageIcon(p.getImagemv()).getImage().getScaledInstance(lblNewLabel5.getWidth(),lblNewLabel5.getHeight(), Image.SCALE_DEFAULT)));
             
                }
            }
			
																
			JTabbedPane AdicionarProduto = new JTabbedPane(JTabbedPane.TOP);
			AdicionarProduto.setBounds(146, 106, 684, 385);
			contentPane.add(AdicionarProduto);
			
			JPanel Snacks = new JPanel();
			FlowLayout flowLayout = (FlowLayout) Snacks.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Snacks", null, Snacks, null);
			
			
			
			if(Dados.getinstance().getProdutos() != null) {
			
			ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
			
			for (Produto p: produtos) {
				 System.out.println(p.getTipo_produto());
				if (p.getTipo_produto().equals("Snacks"))
				{	
			
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				Snacks.add(lblNewLabel);
			}
			}
		}
			
			JPanel HotDrinks = new JPanel();
			FlowLayout flowLayout2 = (FlowLayout)HotDrinks.getLayout();
			flowLayout2.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Hot Drinks", null, HotDrinks, null);
			
			if(Dados.getinstance().getProdutos() != null) {
				
				ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
				for (Produto p: produtos) {
					if (p.getTipo_produto().equals("Hot Drinks"))
					{	
					JLabel lblNewLabel_2 = new JLabel();
					lblNewLabel_2.setBounds(0, 0, 40, 40);
					lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel_2.getWidth(),lblNewLabel_2.getHeight(), Image.SCALE_DEFAULT)));
					HotDrinks.add(lblNewLabel_2);
				}
			}
			}
			
				
			JPanel Drinks = new JPanel();
			FlowLayout flowLayout3 = (FlowLayout)Drinks.getLayout();
			flowLayout3.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Drinks", null, Drinks, null);
			
			if(Dados.getinstance().getProdutos() != null) {
				
				ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
				for (Produto p: produtos) {
					if (p.getTipo_produto().equals("Drinks")){
					JLabel lblNewLabel_3 = new JLabel();
					lblNewLabel_3.setBounds(0, 0, 40, 40);
					lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel_3.getWidth(),lblNewLabel_3.getHeight(), Image.SCALE_DEFAULT)));
					Drinks.add(lblNewLabel_3);
				}
			}		
 }
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
			
			JPanel panel = new JPanel();
			panel.setBounds(147, 13, 600, 75);
			contentPane.add(panel);
			
			JLabel vendelabel = new JLabel("New label");
			panel.add(vendelabel);
			
			setResizable(false);
		}
	}

