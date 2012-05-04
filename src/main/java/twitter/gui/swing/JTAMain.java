package twitter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class JTAMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTAMain(String name) {
		super(name);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public void run() {
		JPanel panel1= new JPanel();
		panel1.setBackground(Color.BLUE);

		JPanel panel2= new JPanel();
		panel2.setBackground(Color.WHITE);
		
		JPanel panel3= new JPanel();
		panel3.setBackground(Color.YELLOW);

		Container pane  = this.getContentPane();
		pane.add(panel1,BorderLayout.NORTH);
		pane.add(panel2,BorderLayout.CENTER);
		pane.add(panel3,BorderLayout.SOUTH);
		
	}
}
