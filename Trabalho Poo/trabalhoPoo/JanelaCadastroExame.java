package trabalhoPoo;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;



@SuppressWarnings("serial")
public class JanelaCadastroExame extends JFrame implements ActionListener {
	private JButton buttonOK, buttonCancelar;
	private JLabel labelExame, labelDataExame, labelDataRetirada, labelConvenio, labelMedico;
	private JTextField fieldExame, fieldDataExame, fieldDataRetirada;
	public JFormattedTextField fieldFormatDataNasc;
	public MaskFormatter maskDataNasc;
	public JanelaCadastroExame() {
		super("Janela de cadastro de exames");
		Container content = getContentPane();
		content.setLayout(null);

		Font fonte = new Font("Arial", Font.ITALIC, 12);
		content.setFont(fonte);

		labelExame = new JLabel("Tipo de Exame");
		labelExame.setBounds(1, 1, 125, 25);

		content.add(labelExame);

		fieldExame = new JTextField();
		fieldExame.setBounds(100, 2, 125, 25);
		content.add(fieldExame, null);

		labelDataExame = new JLabel("Data do exame");
		labelDataExame.setBounds(1, 30, 125, 100);
		content.add(labelDataExame);

		try {
			maskDataNasc = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		maskDataNasc.setPlaceholderCharacter('_');
		fieldFormatDataNasc = new JFormattedTextField(maskDataNasc);
		fieldFormatDataNasc.setBounds(100, 70, 71, 20);
		content.add(fieldFormatDataNasc);		
		fieldFormatDataNasc.setToolTipText("Digite apenas números.");
		fieldFormatDataNasc.addFocusListener(new FocusAdapter(){
		 @Override  
		    public void focusLost(FocusEvent e) {  
		        //Se não estiver válido exibe o erro.  
		 } 	
		});
		labelConvenio = new JLabel("Convênio");
		labelConvenio.setBounds(1, 30, 200, 25);
		content.add(labelConvenio);

		String conv[] = { "Ipe", "Unimed", "FUSSEX", "UsiSaúde", "SUS" };
		JComboBox Convenio = new JComboBox(conv);
		Convenio.setBounds(100, 30, 125, 25);
		Convenio.setSelectedIndex(4);
		Convenio.addActionListener(this);
		content.add(Convenio);

		labelMedico = new JLabel("Médico");
		labelMedico.setBounds(1, 50, 100, 25);
		content.add(labelMedico);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent arg0) {

	}

	public static void main(String[] args) {
		JanelaCadastroExame exame = new JanelaCadastroExame();
		exame.setSize(400, 300);
	}
}
