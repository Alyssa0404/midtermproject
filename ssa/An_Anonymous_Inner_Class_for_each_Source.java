package example;

import java.awt.*;
import java.awt.event.*;



public class An_Anonymous_Inner_Class_for_each_Source extends Frame {

	private static final long serialVersionUID = 1L;
	private TextField tfCount;
	private Button btnCountUp,btnCountDown,btnReset;
	private int count = 0;
	
	public An_Anonymous_Inner_Class_for_each_Source() {
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
		
		AllButtonsListener listener = new AllButtonsListener();
		btnCountUp.addActionListener((ActionListener) listener);
		btnCountDown.addActionListener((ActionListener) listener);
		btnReset.addActionListener((ActionListener) listener);
		
		setTitle("AWT Counter");
		setSize(400,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new An_Anonymous_Inner_Class_for_each_Source();

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
