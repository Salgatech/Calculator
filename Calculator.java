import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Calculator {
	private JFrame frame = new JFrame ("Salgatech Calculator");
	private JTextArea txtScreen = new JTextArea();
	private JTextArea outputScreen = new JTextArea();
	private ImageIcon image = new ImageIcon("/com/bar/resources/Salgatech.png");
	
	
	//Now we create the buttons.
	private JButton but1 = new JButton("0");
	private JButton but2 = new JButton("1");
	private JButton but3 = new JButton("2");
	private JButton but4 = new JButton("3");
	private JButton but5 = new JButton("4");
	private JButton but6 = new JButton("5");
	private JButton but7 = new JButton("6");
	private JButton but8 = new JButton("7");
	private JButton but9 = new JButton("8");
	private JButton but10 = new JButton("9");
	
	
	private JButton divideBut = new JButton("/");
	private JButton MultiplyBut = new JButton("*");
	private JButton addBut = new JButton("+");
	private JButton minusBut = new JButton("-");
	private JButton powerOfBut = new JButton("^");
	private JButton sqrRootBut = new JButton("SQRT");
	private JButton parenth_leftBut = new JButton("(");
	private JButton parenth_rightBut = new JButton(")");
	private JButton clearBut = new JButton("CLR");
	private JButton backBut = new JButton("<-");
	private JButton equalBut = new JButton("=");
	
	public Calculator(){
		frame.setSize(400,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		Color customBlue = new Color(133,220,186);
		Color customGray = new Color(232,232,232);
		frame.getContentPane().setBackground(customBlue);
		
		
		txtScreen.setSize(380,50);
		txtScreen.setLocation(7,5);
		
		outputScreen.setSize(380,50);
		outputScreen.setLocation(7,70);
		outputScreen.setBackground(customGray);
		
		createButtons();
		
		fillFrameWithObjs();
		frame.setVisible(true);
	}
	
	public void createButtons(){
		but1.setSize(100,50);
		but1.setLocation(100,200);
		but2.setSize(100,50);
		but2.setLocation(100,201);
		but3.setSize(100,50);
		but3.setLocation(100,202);
		but4.setSize(100,50);
		but4.setLocation(169,450);
		but5.setSize(100,50);
		but5.setLocation(150,350);
		but6.setSize(100,50);
		but6.setLocation(124,400);
		but7.setSize(100,50);
		but7.setLocation(120,120);
		but8.setSize(100,50);
		but8.setLocation(50,100);
		but9.setSize(100,50);
		but9.setLocation(200,190);
		but10.setSize(100,50);
		but10.setLocation(170,230);
		
		divideBut.setSize(100,50);
		MultiplyBut.setSize(100,50);
		addBut.setSize(100,50);
		minusBut.setSize(100,50);
		powerOfBut.setSize(100,50);
		sqrRootBut.setSize(100,50);
		parenth_leftBut.setSize(100,50);
		parenth_rightBut.setSize(100,50);
		clearBut.setSize(100,50);
		backBut.setSize(100,50);
		equalBut.setSize(100,50);
		
		divideBut.setLocation(25,25);		
		MultiplyBut.setLocation(269,247);
		addBut.setLocation(234,332);
		minusBut.setLocation(243,111);
		powerOfBut.setLocation(81,277);
		sqrRootBut.setLocation(286,12);
		parenth_leftBut.setLocation(5,21);
		parenth_rightBut.setLocation(19,235);
		clearBut.setLocation(197,244);
		backBut.setLocation(333,222);
		equalBut.setLocation(155,213);
	};
	
	private void fillFrameWithObjs(){
		frame.add(txtScreen);
		frame.add(outputScreen);
		frame.add(but1);
		frame.add(but2);
		frame.add(but3);
		frame.add(but4);
		frame.add(but5);
		frame.add(but6);
		frame.add(but7);
		frame.add(but8);
		frame.add(but9);
		frame.add(but10);
		frame.add(clearBut);
		frame.add(divideBut);
		frame.add(MultiplyBut);
		frame.add(addBut);
		frame.add(minusBut);
		frame.add(powerOfBut);
		frame.add(sqrRootBut);
		frame.add(parenth_leftBut);
		frame.add(parenth_rightBut);
		frame.add(backBut);
		frame.add(equalBut);
		
	}
	
	public static void main(String[] args){
		new Calculator();
	}
}