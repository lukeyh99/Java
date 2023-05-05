
import java.util.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
public class TSP{	
	public static void main(String args[])
	{
		new MyFrame();//call the whole graphical method
		//new ActionListener(Compute);
	}

}
//method to make programme interface
	  class MyFrame extends JFrame implements ActionListener{
		JLabel label;//essentially sticker to put map on
		JLabel InputPrompt;//info for input
		JLabel OutputPrompt;//info for output
		JPanel inputArea;//area to input addresses
		JPanel TitlePanel;//area to add heading
		JPanel OutputArea;//area where the route will be printed
		JPanel ButtonPanel;//panel to put compute button on
		JPanel mapPanel;//area that the map will occupy
		JButton Compute;//compute button
		JTextArea textArea;//descriptor for textArea boxes
		JTextArea Route;//route textArea area
		JScrollPane scrollBar;//adds scroll bar
		JScrollPane scrollBar2;
		ImageIcon map;//image that will be imported for the map 
		//lets make the framee
		TextField tf;
		
		
		MyFrame(){
			//the dimensions of all my panels are to fit a 1071x866 map.png
			InputPrompt = new JLabel();
			Route = new JTextArea("textArea");
			OutputPrompt = new JLabel();
			map = new ImageIcon("map.png");//import map image
			label = new JLabel(map);
			textArea = new JTextArea("textArea");
			Compute = new JButton();
			inputArea = new JPanel();
			TitlePanel = new JPanel();
			OutputArea = new JPanel();
			ButtonPanel = new JPanel();
			mapPanel = new JPanel();
			tf = new TextField();
			
			//designing input region
			InputPrompt.setText("Input All Delivery Addresses Here:");//prompt for user
			OutputPrompt.setText("Best Route:");//output info
			inputArea.setBackground(Color.red);
			inputArea.setBounds(0,866,1071,200);
			inputArea.add(InputPrompt);
			 
			//designing output region
			OutputArea.setBackground(Color.red);
			OutputArea.setBounds(1071, 0, 200, 866);
			
			//implement scroll bar
			scrollBar = new JScrollPane(textArea);
			scrollBar2 = new JScrollPane(Route);
			


			//designing button panel
			ButtonPanel.setBackground(Color.red);
			ButtonPanel.setBounds(1071, 866, 200, 200);
			ButtonPanel.add(Compute);
			
			
			//designing map panel no need really as image will be here 
			mapPanel.setBackground(Color.white);
			mapPanel.setBounds(0, 0, 1071, 866);
			mapPanel.add(label);
			
			//how the textArea boxes will look
			textArea.setText(" ");
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setBackground(Color.white);
			textArea.setBorder(BorderFactory.createLineBorder(Color.black));
			//tf.setBounds(1071 , 866 , 200 , 200 );
			
			
			//compute button dimensions etc
			Compute.setText("Compute");
			Compute.setPreferredSize(new Dimension(180,180));
			Compute.setBackground(Color.CYAN);
			Compute.setForeground(Color.black);
			Compute.setFocusable(false);
			Compute.addActionListener(this);
			
			
			
			
			
			
			//route output area 
			Route.setText(" ");
			Route.setLineWrap(true);
			Route.setWrapStyleWord(true);
			Route.setBackground(Color.white);
			Route.setBorder(BorderFactory.createLineBorder(Color.black));
			
			
			
			scrollBar2.setPreferredSize(new Dimension(155,580));
			scrollBar2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollBar.setPreferredSize(new Dimension(580,155));
			scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			inputArea.add(scrollBar);
			OutputArea.add(OutputPrompt);
			OutputArea.add(scrollBar2);
			
			//add all of our components to our frame
			this.add(TitlePanel);
			this.setTitle(" Apache Pizza Delivery Route.");
			this.add(inputArea);
			this.add(OutputArea);
			this.add(mapPanel);
			//this.add(Compute);
			this.add(ButtonPanel);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(1000,1000);
			this.setVisible(true);
		}
		@Override
        public void actionPerformed(ActionEvent e) {
            String [] Addresses = new String[100];
            //Scanner sc = new Scanner(System.in);//scanner
       
            String [] orderNo2 = new String[100];
        for(int i = 0 ; i <= Addresses.length ; i++)
        	{
            	Addresses[i] = textArea.getText();
            	//Addresses[i] = sc.nextLine();
            	String[] seperate = new String[500];
            	seperate = Addresses[i].split(",");//second array which is separated into each constituent part
            	
            	//Route.setText(Addresses[i]);
            	List<String> seperateList = Arrays.asList(Addresses);
            	String joinedString = String.join(",", seperateList);
            	Route.setText(joinedString);
            
            	


        	}
        	
      }
       

        
        
       
       
			
}
	  
	

	

