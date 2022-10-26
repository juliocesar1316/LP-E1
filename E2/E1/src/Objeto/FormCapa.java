package Objeto;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.util.HashSet;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class FormCapa extends JFrame {

	/**
	 * 
	 */
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

	ArrayList<Capacete> capa = new ArrayList<Capacete>();
	int sizeCapa = capa.size();
		
	HashSet<Integer> capaHash= new HashSet<Integer>();
	
	HashMap<Integer, String> capMap = new HashMap<Integer, String>(); 
	int sizeCapaHash = capaHash.size();
	
	int contador = 0;
	private JTextField input_map;
	private JTextField input_codigo;
	
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
		setBounds(100, 100, 1038, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(38, 89, 61, 23);
		contentPane.add(lblNewLabel);
		
		input_marca = new JTextField();
		input_marca.setBounds(38, 111, 243, 32);
		contentPane.add(input_marca);
		input_marca.setColumns(10);
		
		JTextPane titleForm = new JTextPane();
		titleForm.setBackground(UIManager.getColor("Button.background"));
		titleForm.setDisabledTextColor(new Color(0, 0, 0));
		titleForm.setForeground(new Color(0, 0, 0));
		titleForm.setEnabled(false);
		titleForm.setFont(new Font("Tahoma", Font.PLAIN, 34));
		titleForm.setBounds(70, 11, 338, 46);
		titleForm.setText("Cadastro de capacete");
		contentPane.add(titleForm);
		
		input_cor = new JTextField();
		input_cor.setColumns(10);
		input_cor.setBounds(38, 181, 243, 32);
		contentPane.add(input_cor);
		
		JLabel lblMaterial = new JLabel("Material:");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaterial.setBounds(322, 89, 61, 23);
		contentPane.add(lblMaterial);
		
		input_prot = new JTextField();
		input_prot.setColumns(10);
		input_prot.setBounds(322, 181, 243, 32);
		contentPane.add(input_prot);
		
		input_material = new JTextField();
		input_material.setColumns(10);
		input_material.setBounds(322, 111, 243, 32);
		contentPane.add(input_material);
		
		input_preco = new JTextField();
		input_preco.setColumns(10);
		input_preco.setBounds(38, 250, 243, 32);
		contentPane.add(input_preco);
		
		input_codigo = new JTextField("" + contador);
		input_codigo.setEditable(false);
		input_codigo.setEnabled(false);
		input_codigo.setColumns(10);
		input_codigo.setBounds(322, 250, 243, 32);
		contentPane.add(input_codigo);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCor.setBounds(38, 159, 61, 23);
		contentPane.add(lblCor);
		
		JLabel lblNewLabel_2_1 = new JLabel("Prote\u00E7\u00E3o:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(322, 159, 61, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Pre\u00E7o:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2.setBounds(38, 224, 61, 23);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btn_enviar = new JButton("Enviar");
		btn_enviar.setBackground(new Color(255, 255, 255));
		btn_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Capacete c2 = new Capacete();
				c2.setCodigo(contador);
				c2.setMarca(input_marca.getText());
				c2.setMaterial(input_material.getText());
				c2.setCor(input_cor.getText());
				double numberPreco = Double.parseDouble(input_preco.getText());
				c2.setPreco(numberPreco);
				c2.setProtecao(input_prot.getText());
				
				contador = contador+ 1;
				capa.add(c2);
				capaHash.add(c2.getCodigo());
				
				capMap.put(c2.getCodigo(), "Julio");
				
				System.out.println(contador);

				input_marca.setText("");				
				input_material.setText("");				
				input_cor.setText("");
				input_preco.setText("");
				input_prot.setText("");
				input_codigo.setText("" + contador);
				
			}
		});
		
		
		btn_enviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_enviar.setBounds(277, 318, 89, 23);
		contentPane.add(btn_enviar);
		
		JTextPane txtpnBuscaDeCapacete = new JTextPane();
		txtpnBuscaDeCapacete.setText("Busca de Capacete");
		txtpnBuscaDeCapacete.setForeground(Color.BLACK);
		txtpnBuscaDeCapacete.setFont(new Font("Tahoma", Font.PLAIN, 34));
		txtpnBuscaDeCapacete.setEnabled(false);
		txtpnBuscaDeCapacete.setDisabledTextColor(Color.BLACK);
		txtpnBuscaDeCapacete.setBackground(SystemColor.menu);
		txtpnBuscaDeCapacete.setBounds(653, 11, 338, 46);
		contentPane.add(txtpnBuscaDeCapacete);
		
		JLabel lblDigiteO = new JLabel("Digite o codigo do capacete:");
		lblDigiteO.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDigiteO.setBounds(708, 89, 174, 23);
		contentPane.add(lblDigiteO);
		
		input_map = new JTextField();
		input_map.setColumns(10);
		input_map.setBounds(708, 111, 243, 32);
		contentPane.add(input_map);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Codigo do Capacete:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_2_1.setBounds(322, 229, 131, 23);
		contentPane.add(lblNewLabel_2_2_1);
		
		
		
		JButton btn_map_capa = new JButton("Procurar");
		btn_map_capa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_map_capa.setBackground(Color.WHITE);
		btn_map_capa.setBounds(708, 160, 89, 23);
		btn_map_capa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame jFrame = new JFrame();
				int valor = Integer.parseInt(input_map.getText());
				JOptionPane.showMessageDialog(jFrame,("" + capMap.get(valor)));
				
				
				
			}
		});
		contentPane.add(btn_map_capa);
	}
}
