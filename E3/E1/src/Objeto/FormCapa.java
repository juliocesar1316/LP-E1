package Objeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.util.HashSet;

public class FormCapa extends JFrame {

	private JPanel contentPane;
	private JTextField input_marca;
	private JTextField input_cor;
	private JTextField input_prot;
	private JTextField input_material;
	private JTextField input_preco;

	/**
	 * Launch the application.
	 * @param c2 
	 */

	ArrayList<String> capa = new ArrayList();
	int sizeCapa = capa.size();
		
	HashSet<String> capaHash= new HashSet();
	int sizeCapaHash = capaHash.size();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCapa frame = new FormCapa();
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
	public FormCapa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(53, 91, 61, 23);
		contentPane.add(lblNewLabel);
		
		input_marca = new JTextField();
		input_marca.setBounds(53, 113, 243, 32);
		contentPane.add(input_marca);
		input_marca.setColumns(10);
		
		JTextPane titleForm = new JTextPane();
		titleForm.setBackground(UIManager.getColor("Button.background"));
		titleForm.setDisabledTextColor(new Color(0, 0, 0));
		titleForm.setForeground(new Color(0, 0, 0));
		titleForm.setEnabled(false);
		titleForm.setFont(new Font("Tahoma", Font.PLAIN, 34));
		titleForm.setBounds(172, 11, 338, 46);
		titleForm.setText("Cadastro de capacete");
		contentPane.add(titleForm);
		
		input_cor = new JTextField();
		input_cor.setColumns(10);
		input_cor.setBounds(53, 183, 243, 32);
		contentPane.add(input_cor);
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaterial.setBounds(337, 91, 61, 23);
		contentPane.add(lblMaterial);
		
		input_prot = new JTextField();
		input_prot.setColumns(10);
		input_prot.setBounds(337, 183, 243, 32);
		contentPane.add(input_prot);
		
		input_material = new JTextField();
		input_material.setColumns(10);
		input_material.setBounds(337, 113, 243, 32);
		contentPane.add(input_material);
		
		input_preco = new JTextField();
		input_preco.setColumns(10);
		input_preco.setBounds(53, 252, 243, 32);
		contentPane.add(input_preco);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCor.setBounds(53, 161, 61, 23);
		contentPane.add(lblCor);
		
		JLabel lblNewLabel_2_1 = new JLabel("Prote\u00E7\u00E3o:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(337, 161, 61, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Pre\u00E7o:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(53, 226, 61, 23);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btn_enviar = new JButton("Enviar");
		btn_enviar.setBackground(new Color(255, 255, 255));
		btn_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				Capacete c2 = new Capacete();
				c2.setMarca(input_marca.getText());
				c2.setMaterial(input_material.getText());
				c2.setCor(input_cor.getText());
				double numberPreco = Double.parseDouble(input_preco.getText());
				c2.setPreco(numberPreco);
				c2.setProtecao(input_prot.getText());
				
				System.out.println(c2.getMarca());
				input_marca.setText("");
				System.out.println(c2.getMaterial());
				input_material.setText("");
				System.out.println(c2.getCor());
				input_cor.setText("");
				System.out.println(c2.getPreco());
				input_preco.setText("");
				System.out.println(c2.getProtecao());
				input_prot.setText("");
				*/
				/*FileCsv file = new FileCsv();
				file.File(c2.getMarca(), c2.getMaterial(), c2.getCor(), c2.getProtecao(), c2.getPreco());
				
				Capacete cap = new Capacete();
				cap.input_marca.getText();
				cap.getMaterial();
				cap.getCor();
				cap.getPreco();
				cap.getProtecao();
				*/
				
				Capacete c2 = new Capacete();
				c2.setMarca(input_marca.getText());
				c2.setMaterial(input_material.getText());
				c2.setCor(input_cor.getText());
				double numberPreco = Double.parseDouble(input_preco.getText());
				c2.setPreco(numberPreco);
				c2.setProtecao(input_prot.getText());
				
				BancoDados bd = new BancoDados();
				try {
					bd.insereRegistro(c2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				capa.add(c2.getMarca());
				capa.add(c2.getMaterial());
				capa.add(c2.getCor());
				capa.add(c2.getProtecao());
				capa.add(input_preco.getText());
				
				
				capaHash.add(c2.getMarca());
				capaHash.add(c2.getMaterial());
				capaHash.add(c2.getCor());
				capaHash.add(c2.getProtecao());
				capaHash.add(input_preco.getText());
				
				System.out.println(capa);
				System.out.println(capaHash);
				
				input_marca.setText("");				
				input_material.setText("");				
				input_cor.setText("");
				input_preco.setText("");
				input_prot.setText("");
				
				/*
				for(i=0; i <= 15; i++) {
					capa.add(input_marca.getText());
					capa.add(input_material.getText());
					capa.add(input_cor.getText());
					//double numberPreco = Double.parseDouble(input_preco.getText());
					capa.add(input_preco.getText());
					capa.add(input_prot.getText());
					
					if(capa.get(i) == "") {
						System.out.println(capa.get(i));
						i++;
					}
					input_marca.setText("");				
					input_material.setText("");				
					input_cor.setText("");
					input_preco.setText("");
					input_prot.setText("");
				}
				
				System.out.println(capa);
				
				FileCsv file = new FileCsv();
				file.File(capa);
				
				*/
			}
		});
		
		btn_enviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_enviar.setBounds(292, 320, 89, 23);
		contentPane.add(btn_enviar);
	}
}
