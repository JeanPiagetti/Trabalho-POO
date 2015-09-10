package poo;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class JanelaCadastroEmpregado extends JFrame implements ActionListener {
	private JLabel labelName, labelIdade;
	private JTextField fieldName, fieldIdade;
	private JButton buttonOk, buttonExit, buttonExibir;

	private String nome;

	private Vector vetor = new Vector();

	public JanelaCadastroEmpregado() {
		super("Janela de Cadastro de Empregado");
		Container content = getContentPane();
		content.setLayout(null);

		Font font = new Font("Serif", Font.PLAIN, 10);
		content.setFont(font);

		String labelText = "Nome do Empregado:";
		labelName = new JLabel(labelText);
		labelName.setBounds(new Rectangle(1, 1, 125, 25));

		content.add(labelName);

		fieldName = new JTextField();
		fieldName.setBounds(new Rectangle(130, 1, 200, 25));
		content.add(fieldName, null);

		String labelIdadeText = "Idade do Empregado:";
		labelIdade = new JLabel(labelIdadeText);
		labelIdade.setBounds(new Rectangle(1, 30, 125, 25));
		content.add(labelIdade);

		fieldIdade = new JTextField();
		fieldIdade.setBounds(new Rectangle(130, 30, 200, 25));
		content.add(fieldIdade, null);

		buttonOk = new JButton("OK");
		buttonOk.setBounds(new Rectangle(10, 100, 100, 25));
		content.add(buttonOk, null);
		buttonOk.setActionCommand("OK");
		buttonOk.addActionListener(this);
		// buttonOk.setMnemonic(KeyEvent.VK_F);

		buttonExit = new JButton("Sair");
		buttonExit.setBounds(new Rectangle(110, 100, 100, 25));
		content.add(buttonExit, null);
		buttonExit.setActionCommand("EXIT");
		buttonExit.addActionListener(this);

		buttonExibir = new JButton("Relatorio");
		buttonExibir.setBounds(new Rectangle(210, 100, 100, 25));
		content.add(buttonExibir, null);
		buttonExibir.setActionCommand("EXIBIR");
		buttonExibir.addActionListener(this);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		String comando = (String) e.getActionCommand();

		if (comando.equals("EXIT")) {
			this.dispose();
			System.exit(0);
		}

		if (comando.equals("OK")) {
			// recuperando as informações da interface gráfica
			String nome = fieldName.getText();
			String idadeS = fieldIdade.getText();
			int idade = Integer.parseInt(idadeS);
			// criando o objeto com as informações recuperadas
			Empregado empregado = new Empregado(nome, idade);

			// adicionando em uma Coleção o objeto criado
			vetor.add(empregado);

			// limpa as informações dos fields
			fieldName.setText("");
			fieldIdade.setText("");

		}
		if (comando.equals("EXIBIR")) {

			new RelatorioGUI(vetor);
		}
	}

	public static void main(String[] args) {

		JanelaCadastroEmpregado janela = new JanelaCadastroEmpregado();
		janela.setSize(400, 200);
	}

}
