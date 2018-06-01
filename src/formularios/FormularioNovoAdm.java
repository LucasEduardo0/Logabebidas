package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioNovoAdm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public FormularioNovoAdm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 78, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(100, 75, 98, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 113, 46, 14);
		contentPane.add(lblLogin);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 110, 98, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 148, 46, 14);
		contentPane.add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 145, 98, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTable
		JTable table = new JTable(a.listarAdministrador());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 248, 188, 177);
		contentPane.add(barra);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Obter dados informados pelo usuário
				String nomeAdministrador = textField.getText();
				String senhaAdministrador = textField_1.getText();
				String loginAdministrador = textField_2.getText();
				
				//Criar objeto e chmar o método
				a.cadastrarAdministrador(nomeAdministrador, loginAdministrador, senhaAdministrador);
				
				//Atualizar tabela
				table.setModel(a.listarAdministrador());
				
				//Limpar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				//Cursor no campo nome
				textField.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(10, 197, 111, 40);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulsrio
				FormularioChefe fc = new FormularioChefe();
				
			}
		});
		btnSair.setBounds(115, 197, 111, 40);
		contentPane.add(btnSair);
	}
}