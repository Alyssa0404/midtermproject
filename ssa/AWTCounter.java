import java.awt.*;
import java.awt.event.*;




public class AWTCounter extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounter(){
	
setLayout(new FlowLayout());
		
		lblCount = new Label("Counter");
		add(lblCount);
		
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("count");
		add(btnCount);
		
		BtnCountListener listener = new BtnCountListener();
		btnCount.addActionListener((ActionListener) listener);
		
		setTitle("AWT Counter");
		setSize(300,100);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		AWTCounter app = new AWTCounter();

	}

		private class BtnCountListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			++count;
			tfCount.setText(count + "");
		}
} 
}
