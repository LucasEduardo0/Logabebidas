package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioDemitirAdm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FormularioDemitirAdm(String nomeAdministrador, int linha) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblNomeAdministrador = new JLabel("Nome Administrador");
		lblNomeAdministrador.setBounds(10, 95, 107, 22);
		contentPane.add(lblNomeAdministrador);
		
		textField = new JTextField(nomeAdministrador);
		textField.setBounds(145, 96, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDemitir = new JButton("Demitir");
		btnDemitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Método para executar a exclusão
				Acao a = new Acao();
				a.excluirAdministrador(linha);
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioIrDemitir fid = new FormularioIrDemitir();
				
			}
		});
		btnDemitir.setBounds(85, 149, 127, 23);
		contentPane.add(btnDemitir);
	}

}