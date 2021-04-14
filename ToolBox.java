//package CloudComputing;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class ToolBox {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Data Science ToolBox");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
		JPanel p = new JPanel();
	    p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	    f.add(p);
	    JButton b1 = new ServicesButton("RStudio", new Runnable() {public void run() {
	    		lancuhWeb("http://host.docker.internal:8787/");
	    	}});
	    b1.setBounds(160, 50, 160, 60);
	    p.add(b1);
	    JButton b2 = new ServicesButton("Spyder", new Runnable() {public void run() {
    			lancuhWeb("http://host.docker.internal:6080/vnc.html?resize=downscale");
    	}});
	    p.add(b2);
	    JButton b3 = new ServicesButton("Jupyter Notebook", new Runnable() {public void run() {
    			lancuhWeb("http://host.docker.internal:8888/");
    	}});
	    p.add(b3);
	    JButton b4 = new ServicesButton("Orange", new Runnable() {public void run() {
    			lancuhWeb("http://host.docker.internal:6901/");
    	}});
	    p.add(b4);
	    JButton b5 = new ServicesButton("VSCode", new Runnable() {public void run() {
			lancuhWeb("http://host.docker.internal:8443/");
	    }});
	    p.add(b5);
	    JButton b6 = new ServicesButton("Tensorflow", new Runnable() {public void run() {
			lancuhWeb("http://host.docker.internal:8889/");
	    }});
	    p.add(b6);
	    JButton b7 = new ServicesButton("Markdown", new Runnable() {public void run() {
			lancuhWeb("http://host.docker.internal:12345/");
	    }});
	    p.add(b7);
	    JButton b8 = new ServicesButton("SonarQube & SonarScanner", new Runnable() {public void run() {
			lancuhWeb("http://host.docker.internal:9001/");
	    }});
	    p.add(b8);
	    JButton b9 = new ServicesButton("Hadoop", new Runnable() {public void run() {
			lancuhWeb("http://host.docker.internal:9870/");
	    }});
	    p.add(b9);
	    }
		 
	
	
	public static void lancuhWeb(String web) {
		   try {  
		      Class<?> d = Class.forName("java.awt.Desktop");
		      d.getDeclaredMethod("browse",new Class<?>[] {java.net.URI.class}).invoke(d.getDeclaredMethod("Desktop").invoke(null),new Object[] {java.net.URI.create(web)});
		      }
		   catch (Exception i) {  
		      String osName = System.getProperty("os.name");
		      try {
		         if (osName.startsWith("Mac OS")) {
		            Class.forName("com.apple.eio.FileManager").getDeclaredMethod(
		               "openURL", new Class<?>[] {String.class}).invoke(null,
		               new Object[] {web});
		            }
		         else if (osName.startsWith("Windows"))
		            Runtime.getRuntime().exec(
		               "rundll32 url.dll,FileProtocolHandler " + web);
		         
		         }
		      catch (Exception e) {
		         JOptionPane.showMessageDialog(null, "Faild to launch " + "\n" + e.toString());
		         }
		      }
		   }
	

	}


