package trabalhoPoo;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

public class JanelaCadastroMedico extends JFrame implements ActionListener {
	
	private JLabel areaNome, areaEspecializacao, areaRegistro;
	private JTextField campoTextoNome, campoTextoEsp, campoTextoRegis;
	private JButton botaoSalvar, botaoCancelar, botaoMostrar;

	private String nome;

	private Vector dados = new Vector();

	public JanelaCadastroMedico() {
		super("Janela de cadastro de Médico");
		Container conteudo = getContentPane();
		conteudo.setLayout(null);

		Font fonte = new Font("Arial", Font.BOLD, 14);
		conteudo.setFont(fonte);

		String labelTexto = "Nome do médico";
		areaNome = new JLabel(labelTexto);
		areaNome.setBounds(1, 1, 125, 25);
		conteudo.add(areaNome);

		campoTextoNome = new JTextField();
		campoTextoNome.setBounds(130, 1, 200, 25);
		conteudo.add(campoTextoNome, null);

		String labelIdade = "Especialização";//colocar Jcombobox
		areaEspecializacao = new JLabel(labelIdade);
		areaEspecializacao.setBounds(1, 30, 125, 25);
		conteudo.add(areaEspecializacao, null);
		
		campoTextoEsp = new JTextField();
		campoTextoEsp.setBounds(130, 30, 200, 25);
		conteudo.add(campoTextoEsp,null);
		
		String labelRg = "Registro do médico";
		areaRegistro = new JLabel(labelRg);
		areaRegistro.setBounds(1,60,200,25);
		conteudo.add(areaRegistro, null);
		
		campoTextoRegis = new JTextField();
		campoTextoRegis.setBounds(130, 60, 200, 25);
		conteudo.add(campoTextoRegis, null);
		
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(10, 100, 100, 25);
		conteudo.add(botaoSalvar, null);
		botaoSalvar.setActionCommand("Salvar");
		botaoSalvar.addActionListener(this);
		

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(110, 100, 100, 25);
		conteudo.add(botaoCancelar, null);
		botaoCancelar.setActionCommand("Cancelar");
		botaoCancelar.addActionListener(this);
		

		botaoMostrar = new JButton("Mostra Dados");
		botaoMostrar.setBounds(210, 100, 125, 25);
		conteudo.add(botaoMostrar, null);
		botaoMostrar.setActionCommand("Mostrar");
		botaoMostrar.addActionListener(this);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent logica) {
		String comando = (String) logica.getActionCommand();

		if (comando.equals("Cancelar")) {
			this.dispose();
			System.exit(0);
		}
		if (comando.equals("Salvar")) {
			String nome = areaNome.getText();
			String idades = areaEspecializacao.getText();
			int idade = Integer.parseInt(idades);
		}
		if (comando.equals("Mostrar")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		JanelaCadastroMedico cadastro = new JanelaCadastroMedico();
		cadastro.setSize(400, 200);
	}
}
