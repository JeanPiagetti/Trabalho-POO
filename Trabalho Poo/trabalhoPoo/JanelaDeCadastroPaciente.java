package trabalhoPoo;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

public class JanelaDeCadastroPaciente extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labelDataCadastro, labelID, labelNome, labelIdade, labelConvenio, labelSexo;
	private JTextField TextFieldNome, TextFieldIdade;
	private JRadioButton RadioSexo, radiobuttonMasculino, radiobuttonFeminino;
	private JButton buttonSalvar, buttonCancelar, buttonMostrar;

	
	public JanelaDeCadastroPaciente() {
		super("Janela de cadastro de pacientes");
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

		labelIdade = new JLabel("Idade do paciente");
		labelIdade.setBounds(1, 30, 125, 25);
		conteudo.add(labelIdade, null);

		TextFieldIdade = new JTextField();
		TextFieldIdade.setBounds(130, 30, 200, 25);
		conteudo.add(TextFieldIdade, null);

		labelConvenio = new JLabel("Convênio do Paciente");
		labelConvenio.setBounds(1, 60, 200, 25);
		conteudo.add(labelConvenio, null);
		String conv[] = {"Ipe","Unimed","FUSSEX","UsiSaúde","SUS"};
		
		JComboBox Convenio = new JComboBox(conv);
		Convenio.setBounds(130, 60, 200, 25);
		Convenio.setSelectedIndex(4);
		Convenio.addActionListener(this);
		conteudo.add(Convenio);

		labelSexo = new JLabel("Sexo do paciente");
		labelSexo.setBounds(1,100,200,25);
		conteudo.add(labelSexo);
		ButtonGroup sexo = new ButtonGroup();
		
		radiobuttonMasculino = new JRadioButton("Masculino");
		radiobuttonMasculino.setBounds(120, 100, 90, 25);
		conteudo.add(radiobuttonMasculino);
		radiobuttonMasculino.setActionCommand("Masculino");
		radiobuttonMasculino.addActionListener(this);
		sexo.add(radiobuttonMasculino);
		
		radiobuttonFeminino = new JRadioButton("Feminino");
		radiobuttonFeminino.setBounds(210, 100, 90, 25);
		conteudo.add(radiobuttonFeminino);
		radiobuttonFeminino.setActionCommand("Feminino");
		radiobuttonFeminino.addActionListener(this);
		sexo.add(radiobuttonFeminino);
		
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
		Paciente c = new Paciente();
		if (comando.equals("Cancelar")) {
			this.dispose();
			System.exit(0);
		}
		if (comando.equals("Salvar")) {
			String nome = labelNome.getText();
			String idades = labelIdade.getText();
			int idade = Integer.parseInt(idades);
			String sexo = RadioSexo.getActionCommand();
			if(radiobuttonMasculino.isSelected()){
				c.setSexo("Masculino");
			}
			else if(radiobuttonFeminino.isSelected()){
				c.setSexo("Feminino");
			}
			// String dataCadastro = ...
			// String ID = ...
			// Paciente p = new
			// Paciente(nome,idades,convenio,sexo,dataCadastro,ID);

			if (comando.equals("Mostrar")) {
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		JanelaDeCadastroPaciente cadastro = new JanelaDeCadastroPaciente();

	}
}
