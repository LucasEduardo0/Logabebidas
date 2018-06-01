package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controladores.Acao;
import controladores.ProdutoCadastrado;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FormularioCadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	
	public FormularioCadastrarProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblCadastramento = new JLabel("Cadastramento");
		lblCadastramento.setBounds(75, 35, 307, 64);
		lblCadastramento.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		contentPane.add(lblCadastramento);
		
		JLabel label = new JLabel("");
		label.setBounds(446, 35, 72, 64);
		label.setIcon(new ImageIcon("C:\\Users\\Greyce Alessandra\\Documents\\ImagensJava\\1188683-64.png"));
		contentPane.add(label);
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00F3digo do Produto");
		lblCdigoDoProduto.setBounds(31, 126, 102, 14);
		contentPane.add(lblCdigoDoProduto);
		
		textField_6 = new JTextField();
		textField_6.setBounds(151, 123, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto");
		lblNomeDoProduto.setBounds(31, 151, 102, 14);
		contentPane.add(lblNomeDoProduto);
		
		textField_7 = new JTextField();
		textField_7.setBounds(151, 148, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(31, 176, 72, 14);
		contentPane.add(lblDescrio);
		
		textField_8 = new JTextField();
		textField_8.setBounds(151, 173, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade (Litros)");
		lblQuantidade.setBounds(306, 126, 102, 14);
		contentPane.add(lblQuantidade);
		
		textField_9 = new JTextField();
		textField_9.setBounds(446, 123, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setBounds(306, 151, 76, 14);
		contentPane.add(lblValorUnitrio);
		
		textField_10 = new JTextField();
		textField_10.setBounds(446, 148, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade Mínima");
		lblIdade.setBounds(306, 176, 76, 14);
		contentPane.add(lblIdade);
		
		textField_11 = new JTextField();
		textField_11.setBounds(446, 173, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		//Instanciar
		Acao a = new Acao();
		
		//JTabel
		JTable table = new JTable(a.listarProdutoCadastrado());
		
		//JScrollPane
		JScrollPane barra = new JScrollPane(table);
		barra.setBounds(31, 228, 644, 196);
		contentPane.add(barra);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(586, 122, 89, 36);
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				// Obter os dados informados pelo usuário
				double codigoProduto = Double.parseDouble(textField_6.getText());
				String nomeProduto = textField_7.getText();
				String descricao = textField_8.getText();
				double quantidade = Double.parseDouble(textField_9.getText());
				double valorUnitario = Double.parseDouble(textField_10.getText());
				double valorTotal = valorUnitario * quantidade;
				int idadeMinima = Integer.parseInt(textField_11.getText());
				
				//Criar objeto e chamar o método
				a.Cadastrar(codigoProduto, nomeProduto, descricao, quantidade, valorUnitario, valorTotal, idadeMinima);
				
				//Atualizar tabela
				table.setModel(a.listarProdutoCadastrado());
				
				//Linpar campos
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				
				//Cursor no campo código produto
				textField_6.requestFocus();
			
			}
		});
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(586, 166, 89, 35);
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Fechar formulário
				dispose();
				
				//Chamar formulário
				FormularioChefe fc = new FormularioChefe();
				
			}
		});
		contentPane.add(btnSair);
		setLocationRelativeTo(null);
		
		
		
	}
}