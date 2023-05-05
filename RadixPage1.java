package Finals;

/* 
FILE FOR USER INPUT
*/

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class RadixPage1 extends JFrame {
	private JTextField box1;
	private JTextField textField;
	private JButton enterButton;
	private ArrayList<JTextField> textFieldsList;
	private int input;
	private int index;
	private JTextField box2;
	private JTextField box3;
	private JTextField box4;
	private JTextField box5;
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
            	
            	int input1;
            	int input2;
            	int input3;
            	int input4;
            	int input5;
                // Try to parse the input as an integer
                try {
                    input1 = Integer.parseInt(box1.getText());
                    input2 = Integer.parseInt(box2.getText());
                    input3 = Integer.parseInt(box3.getText());
                    input4 = Integer.parseInt(box4.getText());
                    input5 = Integer.parseInt(box5.getText());
                } catch (NumberFormatException ex) {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            JOptionPane.showMessageDialog(null, "Invalid input: not an integer", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                    return;
                }
                RadixSortAnimation newFrame = new RadixSortAnimation();
                newFrame.setVisible(true);
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
