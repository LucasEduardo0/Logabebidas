package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioAdministrador extends JFrame {

	private JPanel contentPane;

	public FormularioAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioCadastrarProduto fcp = new FormularioCadastrarProduto();
				
			}
		});
		btnCadastrarProduto.setBounds(41, 148, 149, 41);
		contentPane.add(btnCadastrarProduto);
		
		JButton btnNovoAdministrador = new JButton("Novo Administrador");
		btnNovoAdministrador.setBounds(222, 217, 149, 42);
		contentPane.add(btnNovoAdministrador);
		
		JButton btnNovoAtendente = new JButton("Novo Atendente");
		btnNovoAtendente.setBounds(41, 218, 147, 41);
		contentPane.add(btnNovoAtendente);
		
		JButton btnAlterarOuExcluir = new JButton("Alterar ou Excluir Produto");
		btnAlterarOuExcluir.setBounds(41, 288, 149, 41);
		contentPane.add(btnAlterarOuExcluir);
		
		JButton btnHitricoDePedidos = new JButton("Hit\u00F3rico de pedidos");
		btnHitricoDePedidos.setBounds(222, 148, 149, 41);
		contentPane.add(btnHitricoDePedidos);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(222, 288, 149, 41);
		contentPane.add(btnSair);
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
