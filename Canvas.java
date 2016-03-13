package q_lab4;

import javax.swing.JFrame;
public class Canvas extends JFrame {
	private u_i f;
	 public Canvas() {
		 super ("CANVAS TO DRAW");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(600,300);
		 f = new u_i();
		 //u_i  f = new u_i();
		 f.addMouseListener(f);
		 getContentPane().add(f);
	 }
}
