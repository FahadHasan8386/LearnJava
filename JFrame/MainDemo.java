import javax.swing.*;
import java.awt.*;

public class MainDemo extends JFrame{
		 
		 private Container c;
		 private JLabel L1 ,L2 ,L3 ,L4 ;
		 private JTextField Tf1 ,Tf2 ,Tf3 ,Tf4;
		 
	MainDemo()
	{
		frameInIt();
	}
	public void frameInIt()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		L1 = new JLabel ("First Name ");
		L1.setBounds(40 ,20 ,100 ,50 );
		c.add(L1);
		
		Tf1 = new JTextField ();
		Tf1.setBounds(120,40 ,100 ,20);
		c.add(Tf1);
		
		L2= new JLabel ("Last Name ");
		L2.setBounds(40 ,50 ,200 ,100 );
		c.add(L2);
		
		Tf2 = new JTextField ();
		Tf2.setBounds(120,40 ,100 ,100);
		c.add(Tf2);
		
	}
	
	public static void main(String[]args){
		
		MainDemo frame = new MainDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,100,600,400);
		
		
	}
}