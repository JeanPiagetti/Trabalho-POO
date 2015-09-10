package poo;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Vector;

public class RelatorioGUI  extends JFrame{
	
	 private JTextArea relatorio;
	 private JScrollPane areaScrollPane;
	
	public RelatorioGUI(Vector vetor){
     super("Janela de Relatório");
    	Container content = getContentPane();
    	content.setLayout(null);
    	
    	Font font = new Font("Serif", Font.PLAIN, 10);
    content.setFont(font);
    
	relatorio = new JTextArea();
	relatorio.setFont(new Font("Serif", Font.ITALIC, 16));
	
	
	areaScrollPane = new JScrollPane(relatorio);
	areaScrollPane.setVerticalScrollBarPolicy(
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	areaScrollPane.setPreferredSize(new Dimension(250, 250));
	areaScrollPane.setBounds(new Rectangle(1, 1, 350, 100));
	content.add(areaScrollPane, null);
	
	for(int i=0; i<vetor.size();i++){
		Empregado obj = (Empregado)vetor.elementAt(i);
		relatorio.append("O nome do empregado é: "+obj.getNome()+" e a sua idade é: "+obj.getIdade()+"\n");
		//System.out.println("O nome do empregado é: "+obj.getNome()+" e a sua idade é: "+obj.getIdade());
	}
	

	setVisible(true);
	setSize(400,400);
	}

}

