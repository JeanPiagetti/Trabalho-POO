package trabalhoPoo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

public class JanelaMarcaConsulta extends JFrame implements ActionListener {

	private JLabel labelDataCadastro, labelID, labelNome, labelMedico, labelConvenio, labelSexo;
	private JTextField TextFieldNome, TextFieldMedico, TextFieldConvenio;
	private JRadioButton RadioSexo, RadioMasculino, RadioFeminino;
	private JButton buttonSalvar, buttonCancelar, buttonMostrar;

	//private Vector dados = new Vector();

	public JanelaMarcaConsulta() {
		super("Marca Consulta");
		Container conteudo = getContentPane();
		conteudo.setLayout(null);

		Font fonte = new Font("Arial", Font.BOLD, 14);
		conteudo.setFont(fonte);

		labelNome = new JLabel("Nome do paciente");
		labelNome.setBounds(1, 1, 125, 25);
		conteudo.add(labelNome);

		TextFieldNome = new JTextField();
		TextFieldNome.setBounds(130, 1, 200, 25);
		conteudo.add(TextFieldNome, null);

		labelMedico = new JLabel("Nome do Médico");
		labelMedico.setBounds(1, 30, 125, 25);
		conteudo.add(labelMedico, null);

		TextFieldMedico = new JTextField();
		TextFieldMedico.setBounds(130, 30, 200, 25);
		conteudo.add(TextFieldMedico, null);

		labelConvenio = new JLabel("Convênio do Paciente");
		labelConvenio.setBounds(1, 60, 200, 25);
		conteudo.add(labelConvenio, null);
		TextFieldConvenio = new JTextField();
		TextFieldConvenio.setBounds(130, 60, 200, 25);
		conteudo.add(TextFieldConvenio, null);

/*		RadioMasculino = new JRadioButton("Masculino");
		RadioMasculino.setBounds(1, 100, 90, 25);
		conteudo.add(RadioMasculino, null);

		RadioFeminino = new JRadioButton("Feminino");
		RadioFeminino.setBounds(90, 100, 90, 25);
		conteudo.add(RadioFeminino, null);
*/
		buttonSalvar = new JButton("Salvar");
		buttonSalvar.setBounds(10, 200, 100, 25);
		conteudo.add(buttonSalvar, null);
		buttonSalvar.setActionCommand("Salvar");
		buttonSalvar.addActionListener(this);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(110, 200, 100, 25);
		conteudo.add(buttonCancelar, null);
		buttonCancelar.setActionCommand("Cancelar");
		buttonCancelar.addActionListener(this);

		buttonMostrar = new JButton("Mostra Dados");
		buttonMostrar.setBounds(210, 200, 125, 25);
		conteudo.add(buttonMostrar, null);
		buttonMostrar.setActionCommand("Mostrar");
		buttonMostrar.addActionListener(this);

		setVisible(true);
		setSize(450, 300);
	}

	public void actionPerformed(ActionEvent logica) {
		String comando = (String) logica.getActionCommand();

		if (comando.equals("Cancelar")) {
			this.dispose();
			System.exit(0);
		}
		if (comando.equals("Salvar")) {
		/*	String nome = labelNome.getText();
			try {
				String idades = labelIdade.getText();
				int idade = Integer.parseInt(idades);
			} catch (NumberFormatException e) {
				String convenio = labelConvenio.getText();
				String sexo = RadioSexo.getActionCommand();
			} catch (NullPointerException er) {
				// String dataCadastro = ...
				// String ID = ...
				// Paciente p = new
				// Paciente(nome,idades,convenio,sexo,dataCadastro,ID);
			}*/
			if (comando.equals("Mostrar")) {
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		JanelaDeCadastroPaciente cadastro = new JanelaDeCadastroPaciente();

	}
}
