package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioEntrada extends JFrame {

	private JPanel contentPane;

	public FormularioEntrada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JButton btnComprarBebidas = new JButton("Entrar para Beber");
		btnComprarBebidas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Fechar formulário
				dispose();
				
				//Chamar formulario
				FormularioCliente fc = new FormularioCliente();
				
			}
		});
		btnComprarBebidas.setBackground(Color.WHITE);
		btnComprarBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComprarBebidas.setBounds(72, 204, 153, 32);
		contentPane.add(btnComprarBebidas);
		
		JButton btnNewButton = new JButton("Funcionario");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioEntradaFuncionario fec = new FormularioEntradaFuncionario();
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(72, 247, 153, 32);
		contentPane.add(btnNewButton);
	}
}