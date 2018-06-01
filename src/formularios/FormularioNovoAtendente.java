package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioNovoAtendente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JButton btnCadastrar;

	public FormularioNovoAtendente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 74, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 110, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 155, 46, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(106, 71, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 107, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 152, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		table = new JTable(a.listarAtendente());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 240, 182, 114);
		contentPane.add(barra);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter dados informados pelo usuário
				String nomeAtendente = textField.getText();
				String senhaAtendente = textField_1.getText();
				String loginAtendente = textField_2.getText();
				
				//Criar objeto e chamar método
				a.cadastrarAtendente(nomeAtendente, loginAtendente, senhaAtendente);
				
				//Atualizar tabela
				table.setModel(a.listarAtendente());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(37, 195, 89, 23);
		contentPane.add(btnCadastrar);
		
		
		
	}
}
