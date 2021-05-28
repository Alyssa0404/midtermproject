package example;

import java.awt.*;
import java.awt.event.*;


public final class Using_the_Same_Listener_Instance_For_All_the_Buttons extends Frame {

	
	private static final long serialVersionUID = 1L;
	private TextField tfCount;
	private Button btnCountUp,btnCountDown,btnReset;
	private int count = 0;
	
	public Using_the_Same_Listener_Instance_For_All_the_Buttons() {
		setLayout( new FlowLayout());
		add(new Label("Counter"));
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCountUp = new Button("Count Up");
		add(btnCountUp);
		btnCountDown = new Button ("Count Down");
		add(btnCountDown);
		btnReset = new Button("Reset");
		add (btnReset);
		
		setTitle("AWT Counter");
		setSize(400,100);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Using_the_Same_Listener_Instance_For_All_the_Buttons();
		

	}
	private class AllButtonsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			String btnlabel = evt.getActionCommand();
			if (btnlabel.equals("Count Up")) {
				++count;
				
			} else if (btnlabel.equals("Count Down")) {
				--count;
			} else {
				count = 0;
			}
			tfCount.setText(count + ""); 
			
		}

}
}
