package com.istec.pagina;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import com.istec.main.Dados;
import com.istec.objectos.Produto;
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
				if (p.getTipo_produto().equals("Snacks"))
				{	
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				Snacks.add(lblNewLabel);
			}
			}
		}
			
			JPanel Drinks = new JPanel();
			FlowLayout flowLayout2 = (FlowLayout) Drinks.getLayout();
			flowLayout2.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Drinks", null, Drinks, null);
			
			
			
			if(Dados.getinstance().getProdutos() != null) {
			
			ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
			for (Produto p: produtos) {
				if (p.getTipo_produto().equals("Drinks")){
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				Drinks.add(lblNewLabel);
			}
		}
			}
			JPanel HotDrinks = new JPanel();
			FlowLayout flowLayout3 = (FlowLayout) HotDrinks.getLayout();
			flowLayout3.setAlignment(FlowLayout.LEFT);
			AdicionarProduto.addTab("Hot Drinks", null, HotDrinks, null);
			
			
			
			if(Dados.getinstance().getProdutos() != null) {
			
			ArrayList<Produto> produtos = Dados.getinstance().getProdutos();
			for (Produto p: produtos) {
				if (p.getTipo_produto().equals("Hot Drinks"))
				{	
				JLabel lblNewLabel = new JLabel();
				lblNewLabel.setBounds(0, 0, 40, 40);
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(p.getImagem()).getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				HotDrinks.add(lblNewLabel);
			}
		}
			}
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.WHITE);
			panel.setBounds(10, 11, 283, 579);
			contentPane.add(panel);
			
			
			
			
			
			JLabel nome = new JLabel("Name");
			nome.setBounds(22, 3, 45, 13);
			panel.add(nome);
			
			JLabel quantidade = new JLabel("Qt");
			quantidade.setBounds(153, 3, 45, 13);
			panel.add(quantidade);
			
			JLabel preco = new JLabel("Price");
			preco.setBounds(208, 3, 45, 13);
			panel.add(preco);
			
			JPanel produtosPane = new JPanel();
			produtosPane.setBounds(8, 27, 245, 530);
			produtosPane.setBorder(null);
			panel.add(produtosPane);
			produtosPane.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
			
			
			
			
			
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
