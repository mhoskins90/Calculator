import java.awt.*;
import java.awt.event.*;
import java.util.*; 
import javax.script.*;


public class CalculatorActions{

	CalculatorActions(Calculator instance){
			instance.seven.addActionListener(new ActionListener(){//----------------7
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("7");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"7");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.eight.addActionListener(new ActionListener(){//----------------8
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("8");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"8");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.nine.addActionListener(new ActionListener(){//----------------9
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("9");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"9");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.division.addActionListener(new ActionListener(){//----------------DIVISION
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("ERR");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"/");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER	
			//--------------------------------------------------------------------
			//--------------------------------------------------------------------
			instance.four.addActionListener(new ActionListener(){//----------------4
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("4");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"4");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.five.addActionListener(new ActionListener(){//----------------5
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("5");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"5");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.six.addActionListener(new ActionListener(){//----------------6
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("6");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"6");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.multiply.addActionListener(new ActionListener(){//---------------- MULTIPLY
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("ERR");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"*");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER	
			//--------------------------------------------------------------------
			//--------------------------------------------------------------------
			instance.one.addActionListener(new ActionListener(){//----------------1
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("1");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"1");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.two.addActionListener(new ActionListener(){//----------------2
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("2");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"2");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.three.addActionListener(new ActionListener(){//----------------2
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("3");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"3");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.minus.addActionListener(new ActionListener(){//---------------- MINUS
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("ERR");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"-");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			//--------------------------------------------------------------------
			//--------------------------------------------------------------------
			instance.zero.addActionListener(new ActionListener(){//----------------0
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("0");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"0");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.decimal.addActionListener(new ActionListener(){//---------------- DECIMAL
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("ERR");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+".");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.equals.addActionListener(new ActionListener(){//---------------- EQUALS
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("ERR");
						}else{

							
							try{
								//System.out.println(instance.answer.getText());
								ScriptEngineManager mgr = new ScriptEngineManager();
								ScriptEngine engine = mgr.getEngineByName("JavaScript");
								String generatedAnswer = engine.eval( instance.answer.getText() ).toString();

								System.out.println(generatedAnswer);
								instance.answer.setText(generatedAnswer);

								//instance.answer.setText(instance.answer.getText()+"=");
							}catch(Exception error){
								instance.answer.setText("ERR");
							}//END TRY
						}//END ELSE
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.addition.addActionListener(new ActionListener(){//---------------- ADDITION
				public void actionPerformed(ActionEvent e){
					try{
						if ( (instance.answer.getText().equals("")) || (instance.answer.getText().equals("ERR")) ){
							instance.answer.setText("ERR");
						}else{
							//System.out.println(instance.answer.getText());
							instance.answer.setText(instance.answer.getText()+"+");
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER	
			
			instance.back.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
						if (instance.answer.getText().length() > 0 ){
						instance.answer.setText(instance.answer.getText().substring(0,instance.answer.getText().length()-1));
						}
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER

			instance.clear.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
						instance.answer.setText("");
					}
					catch(Exception error){
						System.out.println(error);
					}
				}//END ACTION PERFORMED
			});//END ACTION LISTENER
	}//END CONTRUCTOR

}//END CALCULATOR ACTIONS CLASS