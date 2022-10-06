package java08;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit.BoldAction;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		
		f.getContentPane().setBackground(Color.black);
		f.setSize(618, 692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
		
		JButton b1 = new JButton("\uBE68\uAC15\uC2E0\uD638");
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBackground(Color.RED);
		f.getContentPane().add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("r.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
				
			}
		});
		
		JButton b2 = new JButton("\uB178\uB791\uC2E0\uD638");
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBackground(Color.YELLOW);
		f.getContentPane().add(b2);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("y.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
				
			}
		});
		
		JButton b3 = new JButton("\uD30C\uB791\uC2E0\uD638");
		b3.setFont(new Font("굴림", Font.BOLD, 30));
		b3.setBackground(Color.BLUE);
		f.getContentPane().add(b3);
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("g.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
				
			}
		});
		
		f.setVisible(true);
	}

}
