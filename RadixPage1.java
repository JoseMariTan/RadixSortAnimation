package Finals;

/* 
FILE FOR USER INPUT
*/

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadixPage1 extends JFrame {
	
	
	// initialize text box for user input
	private JTextField box1;
	private JTextField box2;
	private JTextField box3;
	private JTextField box4;
	private JTextField box5;
	private JButton enterButton;
	
	// create arrays string array for the display,
    // integer array for the methods.
	public static int[] valuesA = new int[5];
	public static String[] valuesB = new String[5];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// makes the frame visible
					RadixPage1 frame = new RadixPage1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadixPage1() {
		
		//  methods to create and change/modify the appearance of the text boxes
		getContentPane().setBackground(SystemColor.activeCaptionBorder);
		getContentPane().setLayout(null);
        JLabel lblNewLabel = new JLabel("Enter 5 numerical elements to sort:");
        lblNewLabel.setForeground(Color.BLACK);
        getContentPane().add(lblNewLabel);
        lblNewLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        lblNewLabel.setBounds(26, 58, 230, 19);
        
        box1 = new JTextField(5);
        box1.setBounds(266, 59, 46, 20);
        getContentPane().add(box1);
        		
        enterButton = new JButton("Enter");
        getContentPane().add(enterButton);
        enterButton.setBounds(545, 58, 71, 23);
        				
        box2 = new JTextField(5);
        box2.setBounds(322, 59, 46, 20);
        getContentPane().add(box2);
        				
        box3 = new JTextField(5);
        box3.setBounds(378, 59, 46, 20);
        getContentPane().add(box3);
        				
        box4 = new JTextField(5);
        box4.setBounds(434, 59, 46, 20);
        getContentPane().add(box4);
        				
        box5 = new JTextField(5);
        box5.setBounds(490, 59, 46, 20);
        getContentPane().add(box5);
        		
        
        // action listener to retrieve user input
        // retrieved user input goes to both the string and integer array.
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {   	          	
                if (e.getSource() == enterButton) { 
                		String text1 = box1.getText();                		
                        String text2 = box2.getText();
                        String text3 = box3.getText();
                        String text4 = box4.getText();
                        String text5 = box5.getText();
                        try {
                        	valuesB[0] = text1;
                            valuesB[1] = text2;
                            valuesB[2] = text3;
                            valuesB[3] = text4;
                            valuesB[4] = text5;
                            for(int i = 0; i < 5; i++) {
                            	if (valuesB[i].length() < 3) {
                            		valuesB[i] = "0".repeat(3 - valuesB[i].length()) + valuesB[i];
                                }
                            }
                            
                            // string values from text fields get parsed into integers in order for the methods to work.
                            valuesA[0] = Integer.parseInt(text1);
                            valuesA[1] = Integer.parseInt(text2);
                            valuesA[2] = Integer.parseInt(text3);
                            valuesA[3] = Integer.parseInt(text4);
                            valuesA[4] = Integer.parseInt(text5);
                            
                            // makes sure the user only inputs number that are 3 digits at max (not exceeding 999).
                            if(valuesA[0] > 999 || valuesA[1] > 999 || valuesA[2] > 999 || valuesA[3] > 999 || valuesA[4] > 999) {
                        		JOptionPane.showMessageDialog(null, "Values must not exceed 1000.", "Error", JOptionPane.ERROR_MESSAGE);
                        		return;
                        	}
                        } catch (NumberFormatException ex) {    
                        	
                        	// makes sure the inputs given are all integers / numerical values.
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    JOptionPane.showMessageDialog(null, "Each textboxes should contain a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            });
                            return;
                        }
                        RadixSortAnimation newFrame = new RadixSortAnimation();
                        newFrame.setVisible(true);    
                    dispose(); // close the current frame
                }   
            }
        }); 
        // Set the window properties
        setTitle("TANTOS Radix Sort - User Input");
        setSize(660, 192);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
	}
	}
