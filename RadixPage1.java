package Finals;

/* 
FILE FOR USER INPUT
*/

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadixPage1 extends JFrame {
	
	private JTextField box1;
	private JTextField box2;
	private JTextField box3;
	private JTextField box4;
	private JTextField box5;
	private JButton enterButton;
	
	public static int[] values = new int[5];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		getContentPane().setBackground(SystemColor.activeCaptionBorder);
		getContentPane().setLayout(null);
        JLabel lblNewLabel = new JLabel("Enter 5 numerical elements to sort:");
        getContentPane().add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
        				
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {   	
            	
                if (e.getSource() == enterButton) { 
                	
                		
                		
                		String text1 = box1.getText();
                		
                		
                		//String textA = String.format("%03d", text1);
                		
                		
                        String text2 = box2.getText();
                        String text3 = box3.getText();
                        String text4 = box4.getText();
                        String text5 = box5.getText();

                        try {
                            values[0] = Integer.parseInt(text1);
                            values[1] = Integer.parseInt(text2);
                            values[2] = Integer.parseInt(text3);
                            values[3] = Integer.parseInt(text4);
                            values[4] = Integer.parseInt(text5);
                            if(values[0] > 999 || values[1] > 999 || values[2] > 999 || values[3] > 999 || values[4] > 999) {
                        		JOptionPane.showMessageDialog(null, "Values must not exceed 1000.", "Error", JOptionPane.ERROR_MESSAGE);
                        		System.exit(0);
                        	}
                        } catch (NumberFormatException ex) {                           
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
        setTitle("Text Box Example");
        setSize(660, 192);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
	}
	}
