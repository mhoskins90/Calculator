import java.awt.Color;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Calculator{
	JFrame frame = new JFrame("MH Calculator");
	Container frameContentPane = frame.getContentPane();
	GridBagConstraints frameConstraint = new GridBagConstraints();
	GridBagLayout layoutType1 = new GridBagLayout();

	//LABEL
	JLabel titleLabel = new JLabel("<html><font color=\"#ffffff\">Calculator</font></html>");

	//ANSWER/CALCULATION ROW
	JPanel answerRow = new JPanel();
	JLabel answer = new JLabel("");

	//CALC BUTTON
	JPanel mainPanel = new JPanel();
	JPanel buttonPanel = new JPanel(new GridLayout(4,4));
	//-------------------------------------
	JPanel topRow = new JPanel();
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton division = new JButton("/");
	//-------------------------------------
	JPanel topMiddleRow = new JPanel();
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton multiply = new JButton("*");
	//-------------------------------------
	JPanel topBottomRow = new JPanel();	
	JButton one = new JButton("1");	
	JButton two = new JButton("2");	
	JButton three = new JButton("3");	
	JButton minus = new JButton("-");

	//-------------------------------------
	JPanel bottomRow = new JPanel();	
	JButton zero = new JButton("0");	
	JButton decimal = new JButton(".");	
	JButton equals = new JButton("=");	
	JButton addition = new JButton("+");

	JButton back = new JButton("Back");
	JButton clear = new JButton("CLEAR");
	
	public Calculator(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(900, 600);
	frame.setLocationRelativeTo(null);//CENTER

	frameContentPane.setLayout(layoutType1);
	frameContentPane.setBackground(Color.BLACK);

	titleLabel.setFont(titleLabel.getFont().deriveFont(64.0f));

	mainPanel.setMinimumSize(new Dimension(600,400));
	mainPanel.setPreferredSize(new Dimension(600,400));
	mainPanel.setMaximumSize(new Dimension(600,400));
	mainPanel.setBackground(Color.BLACK);
	//-------------------------------------
	answer.setFont(answer.getFont().deriveFont(48.0f));
	answerRow.setBackground(Color.WHITE);
	answerRow.setMinimumSize(new Dimension(600,70));
	answerRow.setPreferredSize(new Dimension(600, 70));
	answerRow.setMaximumSize(new Dimension(600,70));
	//-------------------------------------
	topRow.setLayout(new GridLayout(0,4));
	topRow.setBackground(Color.GRAY);
	topRow.setMinimumSize(new Dimension(400,32));
	topRow.setPreferredSize(new Dimension(400, 32));
	topRow.setMaximumSize(new Dimension(400,32));
	//-------------------------------------
	seven.setMinimumSize(new Dimension(150,50));
	seven.setPreferredSize(new Dimension(150,50));
	seven.setMaximumSize(new Dimension(150,50));
	seven.setFocusPainted(false);
	seven.setFont(seven.getFont().deriveFont(18.0f));
	seven.setForeground(new Color(255, 255, 255));
	seven.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	eight.setMinimumSize(new Dimension(150,50));
	eight.setPreferredSize(new Dimension(150,50));
	eight.setMaximumSize(new Dimension(150,50));
	eight.setFocusPainted(false);
	eight.setFont(eight.getFont().deriveFont(18.0f));
	eight.setForeground(new Color(255, 255, 255));
	eight.setBackground(new Color(47, 86, 233));	
	//-------------------------------------
	nine.setMinimumSize(new Dimension(150,50));
	nine.setPreferredSize(new Dimension(150,50));
	nine.setMaximumSize(new Dimension(150,50));
	nine.setFocusPainted(false);
	nine.setFont(nine.getFont().deriveFont(18.0f));
	nine.setForeground(new Color(255, 255, 255));
	nine.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	division.setMinimumSize(new Dimension(150,50));
	division.setPreferredSize(new Dimension(150,50));
	division.setMaximumSize(new Dimension(150,50));
	division.setFocusPainted(false);
	division.setFont(division.getFont().deriveFont(18.0f));
	division.setBackground(new Color(0, 255, 0));
	//-------------------------------------
	topMiddleRow.setLayout(new GridLayout(0,4));
	topMiddleRow.setBackground(Color.GRAY);
	topMiddleRow.setMinimumSize(new Dimension(600,32));
	topMiddleRow.setPreferredSize(new Dimension(600, 75));
	topMiddleRow.setMaximumSize(new Dimension(600,32));
	//-------------------------------------
	four.setMinimumSize(new Dimension(150,50));
	four.setPreferredSize(new Dimension(150,50));
	four.setMaximumSize(new Dimension(150,50));
	four.setFocusPainted(false);
	four.setFont(four.getFont().deriveFont(18.0f));
	four.setForeground(new Color(255, 255, 255));
	four.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	five.setMinimumSize(new Dimension(150,50));
	five.setPreferredSize(new Dimension(150,50));
	five.setMaximumSize(new Dimension(150,50));
	five.setFocusPainted(false);
	five.setFont(five.getFont().deriveFont(18.0f));
	five.setForeground(new Color(255, 255, 255));
	five.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	six.setMinimumSize(new Dimension(150,50));
	six.setPreferredSize(new Dimension(150,50));
	six.setMaximumSize(new Dimension(150,50));
	six.setFocusPainted(false);
	six.setFont(six.getFont().deriveFont(18.0f));
	six.setForeground(new Color(255, 255, 255));
	six.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	multiply.setMinimumSize(new Dimension(150,50));
	multiply.setPreferredSize(new Dimension(150,50));
	multiply.setMaximumSize(new Dimension(150,50));
	multiply.setFocusPainted(false);
	multiply.setFont(multiply.getFont().deriveFont(18.0f));
	multiply.setBackground(new Color(0, 255, 0));
	//-------------------------------------
	topBottomRow.setLayout(new GridLayout(0,4));
	topBottomRow.setBackground(Color.GRAY);
	topBottomRow.setMinimumSize(new Dimension(600,32));
	topBottomRow.setPreferredSize(new Dimension(600, 75));
	topBottomRow.setMaximumSize(new Dimension(600,32));
	//-------------------------------------
	one.setMinimumSize(new Dimension(150,50));
	one.setPreferredSize(new Dimension(150,50));
	one.setMaximumSize(new Dimension(150,50));
	one.setFocusPainted(false);
	one.setFont(one.getFont().deriveFont(18.0f));
	one.setForeground(new Color(255, 255, 255));
	one.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	two.setMinimumSize(new Dimension(150,50));
	two.setPreferredSize(new Dimension(150,50));
	two.setMaximumSize(new Dimension(150,50));
	two.setFocusPainted(false);
	two.setFont(two.getFont().deriveFont(18.0f));
	two.setForeground(new Color(255, 255, 255));
	two.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	three.setMinimumSize(new Dimension(150,50));
	three.setPreferredSize(new Dimension(150,50));
	three.setMaximumSize(new Dimension(150,50));
	three.setFocusPainted(false);
	three.setFont(three.getFont().deriveFont(18.0f));
	three.setForeground(new Color(255, 255, 255));
	three.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	minus.setMinimumSize(new Dimension(150,50));
	minus.setPreferredSize(new Dimension(150,50));
	minus.setMaximumSize(new Dimension(150,50));
	minus.setFocusPainted(false);
	minus.setFont(minus.getFont().deriveFont(18.0f));
	minus.setBackground(new Color(0, 255, 0));
	//-------------------------------------
	bottomRow.setLayout(new GridLayout(0,4));
	bottomRow.setBackground(Color.GRAY);
	bottomRow.setMinimumSize(new Dimension(600,32));
	bottomRow.setPreferredSize(new Dimension(600, 75));
	bottomRow.setMaximumSize(new Dimension(600,32));
	//-------------------------------------
	zero.setMinimumSize(new Dimension(150,50));
	zero.setPreferredSize(new Dimension(150,50));
	zero.setMaximumSize(new Dimension(150,50));
	zero.setFocusPainted(false);
	zero.setFont(zero.getFont().deriveFont(18.0f));
	zero.setForeground(new Color(255, 255, 255));
	zero.setBackground(new Color(47, 86, 233));
	//-------------------------------------
	decimal.setMinimumSize(new Dimension(150,50));
	decimal.setPreferredSize(new Dimension(150,50));
	decimal.setMaximumSize(new Dimension(150,50));
	decimal.setFocusPainted(false);
	decimal.setFont(decimal.getFont().deriveFont(18.0f));
	decimal.setBackground(new Color(0, 255, 0));
	//-------------------------------------
	equals.setMinimumSize(new Dimension(150,50));
	equals.setPreferredSize(new Dimension(150,50));
	equals.setMaximumSize(new Dimension(150,50));
	equals.setFocusPainted(false);
	equals.setFont(equals.getFont().deriveFont(18.0f));
	equals.setBackground(new Color(0, 255, 0));
	//-------------------------------------
	addition.setMinimumSize(new Dimension(150,50));
	addition.setPreferredSize(new Dimension(150,50));
	addition.setMaximumSize(new Dimension(150,50));
	addition.setFocusPainted(false);
	addition.setFont(addition.getFont().deriveFont(18.0f));
	addition.setBackground(new Color(0, 255, 0));
	//-------------------------------------
	clear.setMinimumSize(new Dimension(600,50));
	clear.setPreferredSize(new Dimension(600,50));
	clear.setMaximumSize(new Dimension(600,50));
	clear.setFocusPainted(false);
	clear.setFont(clear.getFont().deriveFont(18.0f));
	clear.setForeground(new Color(255, 255, 255));
	clear.setBackground(new Color(198, 31, 31));
	//-------------------------------------
	back.setMinimumSize(new Dimension(600,50));
	back.setPreferredSize(new Dimension(600,50));
	back.setMaximumSize(new Dimension(600,50));
	back.setFocusPainted(false);
	back.setFont(clear.getFont().deriveFont(18.0f));
	back.setForeground(new Color(255, 255, 255));
	back.setBackground(new Color(198, 31, 31));
	//-------------------------------------
	//frameContentPane.add(titleLabel);//------------------ADD
	answerRow.add(answer);//-----------------------------ADD

	buttonPanel.add(seven);//----------------------------ADD
	buttonPanel.add(eight);//----------------------------ADD
	buttonPanel.add(nine);//-----------------------------ADD
	buttonPanel.add(division);//-------------------------ADD
	buttonPanel.add(four);//-----------------------------ADD
	buttonPanel.add(five);//-----------------------------ADD
	buttonPanel.add(six);//------------------------------ADD
	buttonPanel.add(multiply);//-------------------------ADD
	buttonPanel.add(one);//------------------------------ADD
	buttonPanel.add(two);//------------------------------ADD
	buttonPanel.add(three);//----------------------------ADD
	buttonPanel.add(minus);//----------------------------ADD
	buttonPanel.add(zero);//-----------------------------ADD
	buttonPanel.add(decimal);//---------------------------ADD
	buttonPanel.add(addition);//-----------------------------ADD
	buttonPanel.add(equals);//---------------------------ADD

	mainPanel.add(answerRow);//--------------------------ADD
	mainPanel.add(buttonPanel);//------------------------ADD

	mainPanel.add(back);//-------------------------------ADD
	mainPanel.add(clear);//------------------------------ADD

	frameConstraint.gridy = 1;
	
	frameContentPane.add(mainPanel, frameConstraint);//--ADD

	}//CONSTRUCTION END

	public void setFrameVisibility(Boolean need){
		frame.setVisible(need);
	}

	public void addActions(Calculator instance){
		CalculatorActions actions = new CalculatorActions(instance);
	}

	public static void main(String[] args){

		Calculator calculatorProgram = new Calculator();
		calculatorProgram.addActions(calculatorProgram);//PASS INSTANCE OF SELF TO ADD ACTIONS

		calculatorProgram.setFrameVisibility(true);//SET VISIBLE
	
	}//END MAIN

}//END CALC