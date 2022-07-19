package _2_data_source._1_1_network_Streams;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

import java.net.*;
//import com.elharo.io.ui.*;

public class URLViewer extends JFrame implements ActionListener {
	
  private JTextField theURL = new JTextField( );
  private JButton loadButton = new JButton("Load");  
  private JStreamedTextArea theDisplay = new JStreamedTextArea();
 
  public URLViewer( ) {
	 
	  
    super("URL Viewer");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(50, 50);
    setLayout(new BorderLayout());
    setVisible(true);
    pack();
    
    this.getContentPane( ).add(BorderLayout.NORTH, theURL);    
    
    JScrollPane pane = new JScrollPane(theDisplay);
    this.getContentPane( ).add(BorderLayout.CENTER, pane);
    
    Panel south = new Panel( );
    south.add(loadButton);
    this.getContentPane( ).add(BorderLayout.SOUTH, south);
    
    theURL.addActionListener(this);
    loadButton.addActionListener(this);
    
  }
  
  public void actionPerformed(ActionEvent event) {
    try {
      URL u = new URL(theURL.getText( ));
      
      InputStream in = u.openStream( );
      
      OutputStream out = theDisplay.getOutputStream( );
      
      theDisplay.setText("");
      
      for (int c = in.read(); c != -1; c = in.read( )) {
        out.write(c);
      }
      in.close( );
    }
    catch (IOException ex) {
      theDisplay.setText("Invalid URL: " + ex.getMessage( ));
    }
  }
  
  public static void main(String args[]) {
    
    // To avoid deadlock don't show frames on the main thread
    SwingUtilities.invokeLater(
      new Runnable( ) {
        public void run( ) {
        	URLViewer me = new URLViewer( );
        }
      }
    );
  }
}

