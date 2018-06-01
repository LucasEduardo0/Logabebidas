package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Administrador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URL;
import java.security.Principal;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;

public class FormularioEntradaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public FormularioEntradaFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setBounds(67, 295, 46, 56);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("");
		lblSenha.setBounds(67, 381, 46, 56);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(117, 295, 423, 56);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		passwordField.setBounds(117, 381, 423, 56);
		contentPane.add(passwordField);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					
					if((textField.getText().equals("Lucas")) && (passwordField.getText().equals("lindao"))) {
					
						//Fechar formulario
						dispose();
					
						//Chamar formulario
						FormularioChefe fa = new FormularioChefe();
					
					}
					
			for(int linha = 0; linha < Administrador.dadosAdministrador.size(); linha++){

					
					if((textField.getText().equals(String.valueOf(Administrador.dadosAdministrador.get(linha).getLoginAdministrador())) && (passwordField.getText().equals(String.valueOf(Administrador.dadosAdministrador.get(linha).getSenhaAdministrador()))))) {
						
						//Chamar formulario
						FormularioAdministrador fa = new FormularioAdministrador();
						
						//Fechar formulário
						dispose();
						
					}
					
					
				}
			
			
			
				
			}
		});
		btnEntrar.setBounds(169, 524, 261, 56);
		contentPane.add(btnEntrar);
		
		JLabel label = new JLabel();
		label.setForeground(Color.BLACK);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(FormularioEntradaFuncionario.class.getResource("/imagens/login.jpg")));
		label.setBounds(-98, -23, 684, 708);
		contentPane.add(label);
	}
}