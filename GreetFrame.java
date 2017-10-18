 import javax.swing.*;
 public class GreetFrame  extends JFrame {
     public GreetFrame() throws Exception {
          super("Welcome to My Frame !");
         setLookAndFeel();
        setSize(350, 100);
         setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );
         setVisible(true);
         setLayout( new FlowLayout());
     JButton okButton = new JButton( "OK");
    add(okButton);
   }
 
    private void setLookAndFeel() throws Exception {
       
           UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel" );
			//UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel" );
             // UIManager.setLookAndFeel( "com.sun.java.swing.plaf.gtk.GTKLookAndFeel" );
		
		
              // ignore error
        
     }
     
     public static void main(String[] arguments) throws Exception {
         GreetFrame sal =  new GreetFrame();
    }
 }