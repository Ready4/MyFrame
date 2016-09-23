import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame() {
		JButton button = new JButton("Start");
		Container content = getContentPane();
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		progressBar.setStringPainted(true);
		content.add(progressBar, BorderLayout.NORTH);
		content.add(button, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (progressBar.getValue() >= 100)
					progressBar.setValue(0);

				else
					progressBar.setValue(progressBar.getValue() + 5);

			}
		});
		setSize(300, 100);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();

	}
}
