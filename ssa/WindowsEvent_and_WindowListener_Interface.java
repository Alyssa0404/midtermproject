package example;

import java.awt.*;
import java.awt.event.*;



public class WindowsEvent_and_WindowListener_Interface extends Frame {

	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	private static final long serialVersionUID = 1L;

	
	public WindowsEvent_and_WindowListener_Interface() {
		setLayout(new FlowLayout());
		add(new Label ("Counter"));
		
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button ("Count");
		add(btnCount);
		
		btnCount.addActionListener((ActionListener) new BtnCountListener());
		
		addWindowListener(new MyWindowListener());
		
		setTitle("AWT counter");
		setSize (300, 100);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new WindowsEvent_and_WindowListener_Interface();

	}
	private class BtnCountListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evt) {
			++count;
			tfCount.setText(count + "");
				
		}
			
	}
	private class MyWindowListener implements WindowListener {
		@Override
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
		@Override
		public void windowOpened(WindowEvent evt) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosed(WindowEvent evt) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified");
			// TODO Auto-generated method stub
			
		}
		public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified");
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowActivated(WindowEvent evt) { System.out.println("Window Activated");
			// TODO Auto-generated method stub
			
		}
		public void windowDeactivated(WindowEvent evt) {  System.out.println("Window Deactivated");
			// TODO Auto-generated method stub
			
		}


			
			
		}
	}
	