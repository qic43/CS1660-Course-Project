package CloudComputing;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class ServicesButton extends JButton{
	public ServicesButton(String s, final Runnable r) {
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.setText(s);
		ActionListener ac = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				r.run();
			}
		};
		this.addActionListener(ac);
	}

}
