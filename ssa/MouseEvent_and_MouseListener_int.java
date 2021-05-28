package example;

import java.awt.*;
import java.awt.event.*;



public class MouseEvent_and_MouseListener_int extends Frame {
	private TextField tfMouseX;
	private TextField tfMouseY;
	
	private TextField tfMousePositionX;
	private TextField tfMousePositionY;
	
	
	private static final long serialVersionUID = 1L;

	public MouseEvent_and_MouseListener_int() {
		setLayout(new FlowLayout());
add(new Label ("X-Click: "));
		
		tfMouseX = new TextField(10);
		tfMouseX.setEditable(false);
		add(tfMouseX);
		
		add(new Label("Y-Click: "));
		

		tfMouseY = new TextField(10);
		tfMouseY.setEditable(false);
		add(tfMouseY);
		
		add (new Label("X-Position: "));
		tfMousePositionX = new TextField(10);
		tfMousePositionX.setEditable(false);
		add(tfMousePositionX);
		add (new Label("Y-Position: "));
		tfMousePositionY = new TextField(10);
		tfMousePositionY.setEditable(false);
		add(tfMousePositionY);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		setTitle("Mouse Event");
		setSize(400,120);
		setVisible(true);
		
		
	}

	
	public static void main(String[] args) {
		new MouseEvent_and_MouseListener_int();

	}
	private class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Component evt = null;
			tfMouseX.setText(evt.getX() + "");
			tfMouseY.setText(evt.getY() + ""); 
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Component evt = null;
			tfMousePositionX.setText(evt.getX() + "");
			tfMousePositionY.setText(evt.getY() + "");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
