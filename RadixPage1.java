Package Finals;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class RadixPage1 extends JFrame {

	private JPanel contentPane;
	private Timer timer1;
	private Timer timer2;
	private Timer timer3;
	private Timer timer4;
	private Timer timer5;
	
	
	
	
	private JLabel num1;
	private JLabel num2;
	private JLabel num3;
	private JLabel num4;
	private JLabel num5;
	
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
        getContentPane().setLayout(null);
		
		
		
       
        
        JLabel num1 = new JLabel("467");
        num1.setBackground(new Color(255, 255, 255));
        num1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num1.setBounds(347, 11, 33, 25);
        getContentPane().add(num1);
        
        JLabel num4 = new JLabel("135");
        num4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num4.setBounds(476, 11, 33, 25);
        getContentPane().add(num4);
        
        JLabel num3 = new JLabel("703");
        num3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num3.setBounds(433, 11, 33, 25);
        getContentPane().add(num3);
        
        JLabel num5 = new JLabel("888");
        num5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num5.setBounds(519, 11, 33, 25);
        getContentPane().add(num5);
        
        JLabel num2 = new JLabel("221");
        num2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num2.setBounds(390, 11, 33, 25);
        getContentPane().add(num2);
        
        JLabel lblPass = new JLabel("Pass 1:");
        lblPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass.setBackground(Color.WHITE);
        lblPass.setBounds(78, 68, 64, 25);
        getContentPane().add(lblPass);
        
        JLabel lblPass_3 = new JLabel("Pass 2:");
        lblPass_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_3.setBackground(Color.WHITE);
        lblPass_3.setBounds(364, 104, 64, 25);
        getContentPane().add(lblPass_3);
        
        JLabel lblPass_1 = new JLabel("Pass 3:");
        lblPass_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_1.setBackground(Color.WHITE);
        lblPass_1.setBounds(659, 140, 64, 25);
        getContentPane().add(lblPass_1);
        
        JLabel lblPass_2 = new JLabel("2:");
        lblPass_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2.setBackground(Color.WHITE);
        lblPass_2.setBounds(78, 176, 18, 25);
        getContentPane().add(lblPass_2);
        
        JLabel lblPass_2_1 = new JLabel("4:");
        lblPass_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_1.setBackground(Color.WHITE);
        lblPass_2_1.setBounds(78, 248, 18, 25);
        getContentPane().add(lblPass_2_1);
        
        JLabel lblPass_2_2 = new JLabel("5:");
        lblPass_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_2.setBackground(Color.WHITE);
        lblPass_2_2.setBounds(78, 284, 18, 25);
        getContentPane().add(lblPass_2_2);
        
        JLabel lblPass_2_3 = new JLabel("6:");
        lblPass_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_3.setBackground(Color.WHITE);
        lblPass_2_3.setBounds(78, 320, 18, 25);
        getContentPane().add(lblPass_2_3);
        
        JLabel lblPass_2_4 = new JLabel("7:");
        lblPass_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_4.setBackground(Color.WHITE);
        lblPass_2_4.setBounds(78, 356, 18, 25);
        getContentPane().add(lblPass_2_4);
        
        JLabel lblPass_2_5 = new JLabel("3:");
        lblPass_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_5.setBackground(Color.WHITE);
        lblPass_2_5.setBounds(78, 212, 18, 25);
        getContentPane().add(lblPass_2_5);
        
        JLabel lblPass_2_6 = new JLabel("1:");
        lblPass_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_6.setBackground(Color.WHITE);
        lblPass_2_6.setBounds(78, 140, 18, 25);
        getContentPane().add(lblPass_2_6);
        
        JLabel lblPass_2_7 = new JLabel("0:");
        lblPass_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_7.setBackground(Color.WHITE);
        lblPass_2_7.setBounds(78, 104, 18, 25);
        getContentPane().add(lblPass_2_7);
        
        JLabel lblPass_2_8 = new JLabel("8:");
        lblPass_2_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_8.setBackground(Color.WHITE);
        lblPass_2_8.setBounds(78, 392, 18, 25);
        getContentPane().add(lblPass_2_8);
        
        JLabel lblPass_2_8_1 = new JLabel("9:");
        lblPass_2_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_8_1.setBackground(Color.WHITE);
        lblPass_2_8_1.setBounds(78, 428, 18, 25);
        getContentPane().add(lblPass_2_8_1);
        
        JLabel lblPass_2_9 = new JLabel("2:");
        lblPass_2_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_9.setBackground(Color.WHITE);
        lblPass_2_9.setBounds(364, 212, 18, 25);
        getContentPane().add(lblPass_2_9);
        
        JLabel lblPass_2_1_1 = new JLabel("4:");
        lblPass_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_1_1.setBackground(Color.WHITE);
        lblPass_2_1_1.setBounds(364, 284, 18, 25);
        getContentPane().add(lblPass_2_1_1);
        
        JLabel lblPass_2_2_1 = new JLabel("5:");
        lblPass_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_2_1.setBackground(Color.WHITE);
        lblPass_2_2_1.setBounds(364, 320, 18, 25);
        getContentPane().add(lblPass_2_2_1);
        
        JLabel lblPass_2_3_1 = new JLabel("6:");
        lblPass_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_3_1.setBackground(Color.WHITE);
        lblPass_2_3_1.setBounds(364, 356, 18, 25);
        getContentPane().add(lblPass_2_3_1);
        
        JLabel lblPass_2_4_1 = new JLabel("7:");
        lblPass_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_4_1.setBackground(Color.WHITE);
        lblPass_2_4_1.setBounds(364, 392, 18, 25);
        getContentPane().add(lblPass_2_4_1);
        
        JLabel lblPass_2_5_1 = new JLabel("3:");
        lblPass_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_5_1.setBackground(Color.WHITE);
        lblPass_2_5_1.setBounds(364, 248, 18, 25);
        getContentPane().add(lblPass_2_5_1);
        
        JLabel lblPass_2_6_1 = new JLabel("1:");
        lblPass_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_6_1.setBackground(Color.WHITE);
        lblPass_2_6_1.setBounds(364, 176, 18, 25);
        getContentPane().add(lblPass_2_6_1);
        
        JLabel lblPass_2_7_1 = new JLabel("0:");
        lblPass_2_7_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_7_1.setBackground(Color.WHITE);
        lblPass_2_7_1.setBounds(364, 140, 18, 25);
        getContentPane().add(lblPass_2_7_1);
        
        JLabel lblPass_2_8_2 = new JLabel("8:");
        lblPass_2_8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_8_2.setBackground(Color.WHITE);
        lblPass_2_8_2.setBounds(364, 428, 18, 25);
        getContentPane().add(lblPass_2_8_2);
        
        JLabel lblPass_2_8_1_1 = new JLabel("9:");
        lblPass_2_8_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_8_1_1.setBackground(Color.WHITE);
        lblPass_2_8_1_1.setBounds(364, 464, 18, 25);
        getContentPane().add(lblPass_2_8_1_1);
        
        JLabel lblPass_2_10 = new JLabel("2:");
        lblPass_2_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_10.setBackground(Color.WHITE);
        lblPass_2_10.setBounds(659, 248, 18, 25);
        getContentPane().add(lblPass_2_10);
        
        JLabel lblPass_2_1_2 = new JLabel("4:");
        lblPass_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_1_2.setBackground(Color.WHITE);
        lblPass_2_1_2.setBounds(659, 320, 18, 25);
        getContentPane().add(lblPass_2_1_2);
        
        JLabel lblPass_2_2_2 = new JLabel("5:");
        lblPass_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_2_2.setBackground(Color.WHITE);
        lblPass_2_2_2.setBounds(659, 356, 18, 25);
        getContentPane().add(lblPass_2_2_2);
        
        JLabel lblPass_2_3_2 = new JLabel("6:");
        lblPass_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_3_2.setBackground(Color.WHITE);
        lblPass_2_3_2.setBounds(659, 392, 18, 25);
        getContentPane().add(lblPass_2_3_2);
        
        JLabel lblPass_2_4_2 = new JLabel("7:");
        lblPass_2_4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_4_2.setBackground(Color.WHITE);
        lblPass_2_4_2.setBounds(659, 428, 18, 25);
        getContentPane().add(lblPass_2_4_2);
        
        JLabel lblPass_2_5_2 = new JLabel("3:");
        lblPass_2_5_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_5_2.setBackground(Color.WHITE);
        lblPass_2_5_2.setBounds(659, 284, 18, 25);
        getContentPane().add(lblPass_2_5_2);
        
        JLabel lblPass_2_6_2 = new JLabel("1:");
        lblPass_2_6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_6_2.setBackground(Color.WHITE);
        lblPass_2_6_2.setBounds(659, 212, 18, 25);
        getContentPane().add(lblPass_2_6_2);
        
        JLabel lblPass_2_7_2 = new JLabel("0:");
        lblPass_2_7_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_7_2.setBackground(Color.WHITE);
        lblPass_2_7_2.setBounds(659, 176, 18, 25);
        getContentPane().add(lblPass_2_7_2);
        
        JLabel lblPass_2_8_3 = new JLabel("8:");
        lblPass_2_8_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_8_3.setBackground(Color.WHITE);
        lblPass_2_8_3.setBounds(659, 464, 18, 25);
        getContentPane().add(lblPass_2_8_3);
        
        JLabel lblPass_2_8_1_1_1 = new JLabel("9:");
        lblPass_2_8_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_2_8_1_1_1.setBackground(Color.WHITE);
        lblPass_2_8_1_1_1.setBounds(659, 500, 18, 25);
        getContentPane().add(lblPass_2_8_1_1_1);
        
        JButton sortButton = new JButton("Sort");
        sortButton.setBounds(562, 11, 90, 25);
        getContentPane().add(sortButton);

        // Set the window properties
        setTitle("Radix Sort Animation");
        setSize(915, 658);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        
        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 sortButton.setEnabled(false);
            	 sortButton.setText("Sorting...");
       
         // PASS 1
            	JLabel newLabel1 = new JLabel(num2.getText());
                newLabel1.setFont(num2.getFont());
                newLabel1.setBounds(num2.getX(), num2.getY(), 
                		num2.getWidth(), num2.getHeight());
                num2.getParent().add(newLabel1);
                
                String text1 = num2.getText();
                char lastChar1 = text1.charAt(text1.length() - 1);

                StringBuilder builder1 = new StringBuilder(text1.substring(0, text1.length() - 1));
                builder1.append("<font color='red'>" + lastChar1 + "</font>");

                num2.setText("<html>" + builder1.toString() + "</html>");
                
                
            	// start timer to move label to a specific position
                if (timer1 == null || !timer1.isRunning()) {
                    int desiredX = 106; // set desired x-coordinate
                    int desiredY = 140; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer1 = new Timer(10, new ActionListener() {
                        int x = num2.getX();
                        int y = num2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x > desiredX) {
                                x -= speed; // move to the left
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num2.setLocation(x, y);
                            if (x <= desiredX && y >= desiredY) {
                                timer1.stop(); // stop when label reaches desired position
                                timer2.start(); 
                            }
                        }
                    });
                    timer1.start(); 
                    
                }
  
                JLabel newLabel2 = new JLabel(num3.getText());
                newLabel2.setFont(num3.getFont());
                newLabel2.setBounds(num3.getX(), num3.getY(), 
                		num3.getWidth(), num3.getHeight());
                num3.getParent().add(newLabel2);
                
                String text2 = num3.getText();
                char lastChar2 = text2.charAt(text2.length() - 1);

                StringBuilder builder2 = new StringBuilder(text2.substring(0, text2.length() - 1));
                builder2.append("<font color='red'>" + lastChar2 + "</font>");

                num3.setText("<html>" + builder2.toString() + "</html>");
                
            	// start timer to move label to a specific position
                if (timer2 == null || !timer2.isRunning()) {
                    int desiredX = 106; // set desired x-coordinate
                    int desiredY = 212; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer2 = new Timer(10, new ActionListener() {
                        int x = num3.getX();
                        int y = num3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x > desiredX) {
                                x -= speed; // move to the left
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num3.setLocation(x, y);
                            if (x <= desiredX && y >= desiredY) {
                                timer2.stop(); // stop when label reaches desired position
                                timer3.start();
                            }
                        }
                    });
                }
                
                JLabel newLabel3 = new JLabel(num4.getText());
                newLabel3.setFont(num4.getFont());
                newLabel3.setBounds(num4.getX(), num4.getY(), 
                		num4.getWidth(), num4.getHeight());
                num4.getParent().add(newLabel3);
                
                String text3 = num4.getText();
                char lastChar3 = text3.charAt(text3.length() - 1);

                StringBuilder builder3 = new StringBuilder(text3.substring(0, text3.length() - 1));
                builder3.append("<font color='red'>" + lastChar3 + "</font>");

                num4.setText("<html>" + builder3.toString() + "</html>");

            	// start timer to move label to a specific position
                if (timer3 == null || !timer3.isRunning()) {
                    int desiredX = 106; // set desired x-coordinate
                    int desiredY = 284; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer3 = new Timer(10, new ActionListener() {
                        int x = num4.getX();
                        int y = num4.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x > desiredX) {
                                x -= speed; // move to the left
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num4.setLocation(x, y);
                            if (x <= desiredX && y >= desiredY) {
                                timer3.stop(); // stop when label reaches desired position
                                timer4.start();
                            }
                        }
                    });
                }
                
                
                JLabel newLabel4 = new JLabel(num1.getText());
                newLabel4.setFont(num1.getFont());
                newLabel4.setBounds(num1.getX(), num1.getY(), 
                		num1.getWidth(), num1.getHeight());
                num1.getParent().add(newLabel4);
                
                String text4 = num1.getText();
                char lastChar4 = text4.charAt(text4.length() - 1);

                StringBuilder builder4 = new StringBuilder(text4.substring(0, text4.length() - 1));
                builder4.append("<font color='red'>" + lastChar4 + "</font>");

                num1.setText("<html>" + builder4.toString() + "</html>");

            	// start timer to move label to a specific position
                if (timer4 == null || !timer4.isRunning()) {
                    int desiredX = 106; // set desired x-coordinate
                    int desiredY = 356; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer4 = new Timer(10, new ActionListener() {
                        int x = num1.getX();
                        int y = num1.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x > desiredX) {
                                x -= speed; // move to the left
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num1.setLocation(x, y);
                            if (x <= desiredX && y >= desiredY) {
                                timer4.stop(); // stop when label reaches desired position
                                timer5.start();
                            }
                        }
                    });
                }
                
                JLabel newLabel5 = new JLabel(num5.getText());
                newLabel5.setFont(num5.getFont());
                newLabel5.setBounds(num5.getX(), num5.getY(), 
                		num5.getWidth(), num5.getHeight());
                num5.getParent().add(newLabel5);
                
                String text5 = num5.getText();
                char lastChar5 = text5.charAt(text5.length() - 1);

                StringBuilder builder5 = new StringBuilder(text5.substring(0, text5.length() - 1));
                builder5.append("<font color='red'>" + lastChar5 + "</font>");

                num5.setText("<html>" + builder5.toString() + "</html>");

            	// start timer to move label to a specific position
                if (timer5 == null || !timer5.isRunning()) {
                    int desiredX = 106; // set desired x-coordinate
                    int desiredY = 392; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer5 = new Timer(10, new ActionListener() {
                        int x = num5.getX();
                        int y = num5.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x > desiredX) {
                                x -= speed; // move to the left
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num5.setLocation(x, y);
                            if (x <= desiredX && y >= desiredY) {
                                timer5.stop(); // stop when label reaches desired position
                                
                            }
                        }
                    });
                }
                
                // PASS 1 ARRAY
                
                
                
                
                
                
                
                
                
                
                
                
            }
        });} 
}
