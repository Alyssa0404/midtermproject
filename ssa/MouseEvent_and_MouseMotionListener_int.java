package example;

import java.awt.*;
import java.awt.event.*;
	
 

public class MouseEvent_and_MouseMotionListener_int extends Frame {
	

	private static final long serialVersionUID = 1L;
	private TextField tfMouseX;
	private	TextField tfMouseY; 
	
	
	public MouseEvent_and_MouseMotionListener_int() {
		setLayout(new FlowLayout());
		
		add(new Label ("X-Click: "));
		
		tfMouseX = new TextField(10);
		tfMouseX.setEditable(false);
		add(tfMouseX); 
		
		add(new Label("Y-Click: "));
		

		tfMouseY = new TextField(10);
		tfMouseY.setEditable(false);
		add(tfMouseY);
		
		setTitle ("Mouse Event");
		setSize(350,100);
		setVisible(true);
		
	}


	
	public static void main(String[] args) {
		new MouseEvent_and_MouseMotionListener_int();

	}
	private class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent evt) {
			tfMouseX.setText(evt.getX() + "");
			tfMouseX.setText(evt.getY() + "");
		}

		public void mousePressed(MouseEvent evt) {
			
		}

		public void mouseReleased(MouseEvent e) {
		
			
		}
		public void mouseEntered(MouseEvent e) {
			
			
		}
		public void mouseExited(MouseEvent e) {
			
		}
		
		
	}
}
