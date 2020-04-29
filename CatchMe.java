
	import java.awt.Color;
	import java.awt.event.*;
	import javax.swing.*;
	import java.util.*;

	public class CatchMe extends JPanel implements MouseListener{

		JFrame  jf = new JFrame(); 		 			
		JPanel  jp = new JPanel();  			
		JButton jb = new JButton("Click ME!!");	
		Random  rand = new Random();				
		String  msg1 = "Catch me if you can! "; 
		JLabel label = new JLabel(msg1); 			
		
		public CatchMe()
		{ 
			jf.setSize(500, 500); 
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			jf.setTitle("CATCH ME IF YOU CAN !!");
			jf.setVisible(true); 
			
			jp.setBackground(Color.WHITE); 
		}
		
		public void setComponents()
		{
			jf.add(jp); 
			jp.setLayout(null); 
			label.setBounds(200, 150, 200, 20); 
			
			jp.add(label);
			jp.setBounds(0, 0, 500, 500); 
			
			jp.add(jb);
			jb.setBounds(200,180, 120, 30); 
			jb.addMouseListener(this); 
			
		}
		
	@Override
	public void mouseEntered(MouseEvent me) {
			
	if(me.getSource() == jb) 
		jb.setBounds(rand.nextInt(jf.getWidth()-100),rand.nextInt(jf.getHeight()-100),120,30); // randomizing position

		public void mouseClicked(MouseEvent mc) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}

		public static void main(String[] args)
		{
			CatchMe cm = new CatchMe();
			cm.setComponents();	
		
		}
	}