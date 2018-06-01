package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioIrDemitir extends JFrame {

	private JPanel contentPane;

	public FormularioIrDemitir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Instanciar
		Acao a = new Acao();
		
		JTable table = new JTable(a.listarAdministrador());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(10, 11, 199, 176);
		contentPane.add(barra);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Fechar formulario
				dispose();
				
				//Chamar formulario
				FormularioChefe fc = new FormularioChefe();
				
			}
		});
		btnSair.setBounds(170, 217, 89, 36);
		contentPane.add(btnSair);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter a linha 
				int linha = table.getSelectedRow();
				
				//Obter dados
				String nomeAdministrador = table.getValueAt(linha, 0).toString();
				
				//Chamar formulario
				FormularioDemitirAdm fda = new FormularioDemitirAdm(nomeAdministrador, linha);
				
				//Fechar formulario
				dispose();
			
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}