package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioChefe extends JFrame {

	private JPanel contentPane;

	public FormularioChefe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton btnNewButton = new JButton("Cadastrar Bebida");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioCadastrarProduto fcp = new FormularioCadastrarProduto();
				
			}
		});
		btnNewButton.setBounds(10, 71, 153, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Novo Administrador");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Fechar campo
				dispose();
				
				//Chamar campo
				FormularioNovoAdm fna = new FormularioNovoAdm();
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(192, 71, 153, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Novo Atendente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar campo
				dispose();
				
				//Chamar formulario
				FormularioNovoAtendente fna = new FormularioNovoAtendente();
				
			}
		});
		btnNewButton_2.setBounds(192, 144, 153, 43);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Historico de Pedidos");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(10, 144, 153, 43);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Demitir Funcionário");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrDemitir fid = new FormularioIrDemitir();
				
			}
		});
		btnNewButton_4.setBounds(10, 220, 153, 43);
		contentPane.add(btnNewButton_4);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar funcionario
				FormularioEntrada fe = new FormularioEntrada();
				
			}
		});
		btnSair.setBounds(99, 293, 153, 43);
		contentPane.add(btnSair);
		
		JButton btnAlterarOuExcluir = new JButton("Alterar ou Excluir Produto");
		btnAlterarOuExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formuçário
				FormularioIrAlteracaoEcluir fiae = new FormularioIrAlteracaoEcluir();
				
			}
		});
		btnAlterarOuExcluir.setBounds(192, 220, 153, 43);
		contentPane.add(btnAlterarOuExcluir);
		setVisible(true);
	}

}