package example;

import java.awt.*;
import java.awt.event.*;




public class Anonymous_Inner_Class_as_Event_Listener extends Frame{
	
	
	private static final long serialVersionUID = 1L;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;

	public Anonymous_Inner_Class_as_Event_Listener() {
		setLayout( new FlowLayout());
		add(new Label("Counter"));
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		btnCount.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				++count; 
				tfCount.setText(count + "");
				
			}
			
		});
		setTitle("AWT Counter");
		setSize(250,100);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new  Anonymous_Inner_Class_as_Event_Listener();

	}

}
