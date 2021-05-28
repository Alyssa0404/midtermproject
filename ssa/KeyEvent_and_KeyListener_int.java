package example;

import java.awt.*;
import java.awt.event.*;




public class KeyEvent_and_KeyListener_int extends Frame {

	private static final long serialVersionUID = 1L;
	private TextField tfInput;
	private TextArea taDisplay;
	
	public KeyEvent_and_KeyListener_int() {
		setLayout(new FlowLayout());
		
		add(new Label("Enter Text: "));
		tfInput = new TextField(10);
		add(tfInput);
		taDisplay = new TextArea(5,40);
		add(taDisplay);
		
		tfInput.addKeyListener(new MyKeyListener());
		
		setTitle("KeyEvent_and_KeyListener_int");
		setSize(400,100);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new KeyEvent_and_KeyListener_int();

	}

	private class MyKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent evt) {
			taDisplay.append("You have typed" + evt.getKeyChar() + "\n");
			
		}

		@Override
		public void keyPressed(KeyEvent e) { 
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}
}