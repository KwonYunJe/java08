package java08;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TypeConversion {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		
		JButton b = new JButton("It is button");
		f.add(b);
		
		JLabel l = new JLabel("It is Label");
		f.add(l);
		
		JTextField t = new JTextField();
		t.setText("It is TextField");
		f.add(t);
		
		f.setVisible(true);
		
		
	}

}
