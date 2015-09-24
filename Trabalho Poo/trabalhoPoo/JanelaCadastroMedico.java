package trabalhoPoo;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class JanelaCadastroMedico extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel areaNome, areaEspecializacao, areaRegistro;
	private JTextField campoTextoNome, campoTextoRegis;
	private JButton botaoSalvar, botaoCancelar, botaoMostrar;
	
	//private static Vector dados = new Vector();

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

		String labelIdade = "Especialização";
		areaEspecializacao = new JLabel(labelIdade);
		areaEspecializacao.setBounds(1, 60, 125, 25);
		conteudo.add(areaEspecializacao);
		
		JCheckBox cirurgiaGeral = new JCheckBox();
		cirurgiaGeral = new JCheckBox("Cirurgia geral");
		cirurgiaGeral.setMnemonic(KeyEvent.VK_C);
		cirurgiaGeral.setSelected(false);
		cirurgiaGeral.setBounds(125,60,125,25);
		conteudo.add(cirurgiaGeral);
		
		JCheckBox clinicaMedica = new JCheckBox();
		clinicaMedica = new JCheckBox("Clínica Médica");
		clinicaMedica.setMnemonic(KeyEvent.VK_M);
		clinicaMedica.setSelected(false);
		clinicaMedica.setBounds(125,80,125,25);
		conteudo.add(clinicaMedica);

		JCheckBox nefrologista = new JCheckBox();
		nefrologista = new JCheckBox("Nefrologia");
		nefrologista.setMnemonic(KeyEvent.VK_N);
		nefrologista.setSelected(false);
		nefrologista.setBounds(125,100,125,25);
		conteudo.add(nefrologista);
		
		JCheckBox gastroent = new JCheckBox();
		gastroent = new JCheckBox("Gastroenterologia");
		gastroent.setMnemonic(KeyEvent.VK_G);
		gastroent.setSelected(false);
		gastroent.setBounds(125,120,130,25);
		conteudo.add(gastroent);
		
		JCheckBox psiqu = new JCheckBox();
		psiqu = new JCheckBox("Psquiatria");
		psiqu.setMnemonic(KeyEvent.VK_P);
		psiqu.setSelected(false);
		psiqu.setBounds(125,140,125,25);
		conteudo.add(psiqu);
		
		JCheckBox cardiologia = new JCheckBox();
		cardiologia = new JCheckBox("Cardiologia");
		cardiologia.setMnemonic(KeyEvent.VK_P);
		cardiologia.setSelected(false);
		cardiologia.setBounds(125,160,125,25);
		conteudo.add(cardiologia);
		
		JCheckBox dermatologia = new JCheckBox();
		dermatologia = new JCheckBox("Dermatologia");
		dermatologia.setMnemonic(KeyEvent.VK_P);
		dermatologia.setSelected(false);
		dermatologia.setBounds(125,180,125,25);
		conteudo.add(dermatologia);
		
		JCheckBox infectologia = new JCheckBox();
		infectologia = new JCheckBox("Infectologia");
		infectologia.setMnemonic(KeyEvent.VK_P);
		infectologia.setSelected(false);
		infectologia.setBounds(125,200,125,25);
		conteudo.add(infectologia);
		
		JCheckBox oftalmologia = new JCheckBox();
		oftalmologia = new JCheckBox("Oftalmologia");
		oftalmologia.setMnemonic(KeyEvent.VK_P);
		oftalmologia.setSelected(false);
		oftalmologia.setBounds(125,220,125,25);
		conteudo.add(oftalmologia);
		
		JCheckBox ortopedia = new JCheckBox();
		ortopedia = new JCheckBox("Ortopedia");
		ortopedia.setMnemonic(KeyEvent.VK_P);
		ortopedia.setSelected(false);
		ortopedia.setBounds(125,240,125,25);
		conteudo.add(ortopedia);
		
		
		
		String labelRg = "Registro do médico";
		areaRegistro = new JLabel(labelRg);
		areaRegistro.setBounds(1, 30, 200, 25);
		conteudo.add(areaRegistro);

		campoTextoRegis = new JTextField();
		campoTextoRegis.setBounds(130, 30, 200, 25);
		conteudo.add(campoTextoRegis);

		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(10, 300, 100, 25);
		conteudo.add(botaoSalvar);
		botaoSalvar.setActionCommand("Salvar");
		botaoSalvar.addActionListener(this);

		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(110, 300, 100, 25);
		conteudo.add(botaoCancelar, null);
		botaoCancelar.setActionCommand("Cancelar");
		botaoCancelar.addActionListener(this);

		botaoMostrar = new JButton("Mostra Dados");
		botaoMostrar.setBounds(210, 300, 125, 25);
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
			areaNome.getText();
			areaRegistro.getText();
		
		}
		if (comando.equals("Mostrar")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		JanelaCadastroMedico cadastro = new JanelaCadastroMedico();
		cadastro.setSize(600, 400);
	}
}
