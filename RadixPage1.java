package Finals;

/* 
current features:
- base GUI
- validation of user input
- generates textboxes based on user input
- sample animation

to-do:
- make some progress in the animation
- validation of input for each generated textbox
- functionality of the "Sort" button (to check inputs in textboxes; similar to the function of "Enter" button)
*/

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class RadixPage1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_4;
	private JTextField textField;
	private JButton btnNewButton;
	private ArrayList<JTextField> textFieldsList;
	private int input;
	private int index;
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
		JLabel lblNewLabel = new JLabel("Enter how many elements to sort:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 39, 167, 14);

		textField_4 = new JTextField(20);

		btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(288, 35, 76, 17);

        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(lblNewLabel);
        controlPanel.add(textField_4);
        controlPanel.add(btnNewButton);

        contentPane = new JPanel();

        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(contentPane, BorderLayout.CENTER);

        // Set the window properties
        setTitle("Text Box Example");
        setSize(700, 441);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int input;
                // Try to parse the input as an integer
                try {
                    input = Integer.parseInt(textField_4.getText());
                } catch (NumberFormatException ex) {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            JOptionPane.showMessageDialog(null, "Invalid input: not an integer", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                    return;
                }
                // Check if the input is within a valid range
                if (input >= 0 && input <= 10) {            
                	// Clear the existing text boxes, if any
                    contentPane.removeAll();
                    // Get the number of text boxes to create               
                    try {
                        input = Integer.parseInt(textField_4.getText());
                    } catch (NumberFormatException ex) {
                    	SwingUtilities.invokeLater(new Runnable() {
                    		public void run() {
                    			JOptionPane.showMessageDialog(null, "Invalid input: not an integer", "Error", JOptionPane.ERROR_MESSAGE);
                    		}
                    	});
                    	return;
                    }
                    textFieldsList = new ArrayList<JTextField>(input);
                    // Create the text boxes
                    for (int i = 1; i <= input; i++) {
                    	JTextField textField = new JTextField(10);
                        textFieldsList.add(textField);
                        contentPane.add(textField);
                    }
                    JButton radixSort = new JButton("Sort");
                    contentPane.add(radixSort);
                    
                    radixSort.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	index = textFieldsList.indexOf(((JButton)e.getSource()).getParent().getComponent(0));
                            textField = textFieldsList.get(index);
                        	animateFields();                        
                        }
                        });
                                                         
                    // Update the UI to show the new text boxes
                    contentPane.revalidate();
                    contentPane.repaint();
                } else {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            JOptionPane.showMessageDialog(null, "Invalid input: must be between 0 and 10", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });
                }
            }
        });
	}
	
	private void animateFields() {
		int startX = textFieldsList.get(index).getX();
        int startY = textFieldsList.get(index).getY();
        int endX = startX + 50;
        int endY = startY + 50;
        int step = 5;
        int delay = 50;
        int steps = 10;
             
        for(int i = -1; i < input; i++) {
        	try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        	textFieldsList.get(index + 1).setLocation(startX + i * step, startY + i * step);
        }

        textFieldsList.get(index + 1).setLocation(endX, endY);
        }
        
	ActionListener timerAction = new ActionListener() {
        int count = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count < steps) {
                int x = startX + count * step;
                int y = startY + count * step;
                textField.setLocation(x, y);
                count++;
            } else {
                ((Timer)e.getSource()).stop();
                textField.setLocation(endX, endY);
            }
        }
    };

    Timer timer = new Timer(delay, timerAction);
    timer.setInitialDelay(0);
    timer.start();

	}
