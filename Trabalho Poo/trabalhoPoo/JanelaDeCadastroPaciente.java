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

public class JanelaDeCadastroPaciente extends JFrame implements ActionListener {
	
	private JLabel areaNome, areaIdade, areaRg;
	private JTextField campoTextoNome, campoTextoIdade, campoTextoRg;
	private JButton botaoSalvar, botaoCancelar, botaoMostrar;

	private String nome;

	private Vector dados = new Vector();

	public JanelaDeCadastroPaciente() {
		super("Janela de cadastro de pacientes");
		Container conteudo = getContentPane();
		conteudo.setLayout(null);

		Font fonte = new Font("Arial", Font.BOLD, 14);
		conteudo.setFont(fonte);

		String labelTexto = "Nome do paciente";
		areaNome = new JLabel(labelTexto);
		areaNome.setBounds(1, 1, 125, 25);
		conteudo.add(areaNome);

		campoTextoNome = new JTextField();
		campoTextoNome.setBounds(130, 1, 200, 25);
		conteudo.add(campoTextoNome, null);

		String labelIdade = "Idade do paciente";
		areaIdade = new JLabel(labelIdade);
		areaIdade.setBounds(1, 30, 125, 25);
		conteudo.add(areaIdade, null);
		
		campoTextoIdade = new JTextField();
		campoTextoIdade.setBounds(130, 30, 200, 25);
		conteudo.add(campoTextoIdade,null);
		
		String labelRg = "Rg do Paciente";
		areaRg = new JLabel(labelRg);
		areaRg.setBounds(1,60,200,25);
		conteudo.add(areaRg, null);
		
		campoTextoRg = new JTextField();
		campoTextoRg.setBounds(130, 60, 200, 25);
		conteudo.add(campoTextoRg, null);
		
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(10, 100, 100, 25);
		conteudo.add(botaoSalvar, null);
		botaoSalvar.setActionCommand("Salvar");
		botaoSalvar.addActionListener(this);
		//botaoSalvar.setMnemonic(KeyEvent.VK_F);

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
			String idades = areaIdade.getText();
			int idade = Integer.parseInt(idades);
		}
		if (comando.equals("Mostrar")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		JanelaDeCadastroPaciente cadastro = new JanelaDeCadastroPaciente();
		cadastro.setSize(400, 200);
	}
}
