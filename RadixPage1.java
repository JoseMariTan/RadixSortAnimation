package Finals;

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
	private Timer timer6;
	private Timer timer7;
	private Timer timer8;
	private Timer timer9;
	private Timer timer10;
	
	
	
	private JLabel num1;
	private JLabel num2;
	private JLabel num3;
	private JLabel num4;
	private JLabel num5;
	
	//pass 1 nums
	private JLabel numPass1;
	private JLabel numPass2;
	private JLabel numPass3;
	private JLabel numPass4;
	private JLabel numPass5;

	
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
        num1.setOpaque(true);
        num1.setBackground(Color.WHITE);
        getContentPane().add(num1);
        
        JLabel num4 = new JLabel("135");
        num4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num4.setBounds(476, 11, 33, 25);
        num4.setOpaque(true);
        num4.setBackground(Color.WHITE);
        getContentPane().add(num4);
        
        JLabel num3 = new JLabel("703");
        num3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num3.setBounds(433, 11, 33, 25);
        num3.setOpaque(true);
        num3.setBackground(Color.WHITE);
        getContentPane().add(num3);
        
        JLabel num5 = new JLabel("888");
        num5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num5.setBounds(519, 11, 33, 25);
        num5.setOpaque(true);
        num5.setBackground(Color.WHITE);
        getContentPane().add(num5);
        
        JLabel num2 = new JLabel("221");
        num2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        num2.setBounds(390, 11, 33, 25);
        num2.setOpaque(true);
        num2.setBackground(Color.WHITE);
        getContentPane().add(num2);
        
        JLabel lblPass = new JLabel("Pass #1");
        lblPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass.setBackground(Color.WHITE);
        lblPass.setBounds(24, 68, 72, 25);
        getContentPane().add(lblPass);
        
        JLabel lblPass_3 = new JLabel("Pass #2");
        lblPass_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_3.setBackground(Color.WHITE);
        lblPass_3.setBounds(309, 104, 72, 25);
        getContentPane().add(lblPass_3);
        
        JLabel lblPass_1 = new JLabel("Pass #3");
        lblPass_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPass_1.setBackground(Color.WHITE);
        lblPass_1.setBounds(605, 140, 72, 25);
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
        
        JLabel numPass1 = new JLabel("221");
        numPass1.setBackground(new Color(255, 255, 255));
        numPass1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        numPass1.setBounds(105, 68, 33, 25);
        getContentPane().add(numPass1);
        numPass1.setVisible(false);
        
        JLabel numPass2 = new JLabel("703");
        numPass2.setBackground(new Color(255, 255, 255));
        numPass2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        numPass2.setBounds(148, 68, 33, 25);
        getContentPane().add(numPass2);
        numPass2.setVisible(false);
        
        JLabel numPass3 = new JLabel("135");
        numPass3.setBackground(new Color(255, 255, 255));
        numPass3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        numPass3.setBounds(191, 68, 33, 25);
        getContentPane().add(numPass3);
        numPass3.setVisible(false);
        
        JLabel numPass4 = new JLabel("467");
        numPass4.setForeground(SystemColor.desktop);
        numPass4.setBackground(new Color(255, 255, 255));
        numPass4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        numPass4.setBounds(234, 68, 33, 25);
        getContentPane().add(numPass4);
        numPass4.setVisible(false);
        
        JLabel numPass5 = new JLabel("888");
        numPass5.setForeground(SystemColor.desktop);
        numPass5.setBackground(new Color(255, 255, 255));
        numPass5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        numPass5.setBounds(277, 68, 33, 25);
        getContentPane().add(numPass5);
        numPass5.setVisible(false);
        
        JButton sortButton = new JButton("Sort");
        sortButton.setBounds(562, 11, 90, 25);
        getContentPane().add(sortButton);

        // Set the window properties
        setTitle("Radix Sort Animation");
        setSize(951, 658);
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
                    int speed = 3; // set movement speed

                    timer4 = new Timer(10, new ActionListener() {
                        int x = num1.getX();
                        int y = num1.getY();
                        public void actionPerformed(ActionEvent e) {
                            
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            if(y>= desiredY) {
                            	if (x > desiredX) {
                                    x -= speed; // move to the left
                                }
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
                                timer5.stop(); // stop when label reaches desired 
                                numPass1.setVisible(true);
                                numPass2.setVisible(true);
                                numPass3.setVisible(true);
                                numPass4.setVisible(true);
                                numPass5.setVisible(true);
                                timer6.start();
                            }
                        }
                    });
                }
                
                // PASS 2
                
                
               
                JLabel newLabel6 = new JLabel(numPass2.getText());
                newLabel6.setFont(numPass2.getFont());
                newLabel6.setBounds(numPass2.getX(), numPass2.getY(), 
                		numPass2.getWidth(), numPass2.getHeight());
                numPass2.getParent().add(newLabel6);
                
                String text6 = numPass2.getText();
                char secondChar = text6.charAt(1);

                StringBuilder builder6 = new StringBuilder(text6.substring(0, 1));
                builder6.append("<font color='red'>" + secondChar + "</font>");
                builder6.append(text6.substring(2));

                numPass2.setText("<html>" + builder6.toString() + "</html>");
                
                numPass2.setOpaque(true);
                numPass2.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer6 == null || !timer6.isRunning()) {
                    int desiredX = 390; // set desired x-coordinate
                    int desiredY = 140; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer6 = new Timer(10, new ActionListener() {
                        int x = numPass2.getX();
                        int y = numPass2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < desiredX) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            numPass2.setLocation(x, y);
                            if (x >= desiredX && y >= desiredY) {
                                timer6.stop(); // stop when label reaches desired position
                                timer7.start();
                            }
                        }
                    });

                    
                }
                
                JLabel newLabel7 = new JLabel(numPass1.getText());
                newLabel7.setFont(numPass1.getFont());
                newLabel7.setBounds(numPass1.getX(), numPass1.getY(), 
                		numPass1.getWidth(), numPass1.getHeight());
                numPass1.getParent().add(newLabel7);
                
                String text7 = numPass1.getText();
                char secondChar2 = text7.charAt(1);

                StringBuilder builder7 = new StringBuilder(text7.substring(0, 1));
                builder7.append("<font color='red'>" + secondChar2 + "</font>");
                builder7.append(text7.substring(2));

                numPass1.setText("<html>" + builder7.toString() + "</html>");
                
                numPass1.setOpaque(true);
                numPass1.setBackground(Color.WHITE);
            	// start timer to move label to a specific position
                if (timer7 == null || !timer7.isRunning()) {
                    int desiredX = 390; // set desired x-coordinate
                    int desiredY = 212; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer7 = new Timer(10, new ActionListener() {
                        int x = numPass1.getX();
                        int y = numPass1.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < desiredX) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            numPass1.setLocation(x, y);
                            if (x >= desiredX && y >= desiredY) {
                                timer7.stop(); // stop when label reaches desired position
                                timer8.start();
                            }
                        }
                    });

                    
                }
                
                JLabel newLabel8 = new JLabel(numPass3.getText());
                newLabel8.setFont(numPass3.getFont());
                newLabel8.setBounds(numPass3.getX(), numPass3.getY(), 
                		numPass3.getWidth(), numPass3.getHeight());
                numPass3.getParent().add(newLabel8);
                
                String text8 = numPass3.getText();
                char secondChar3 = text8.charAt(1);

                StringBuilder builder8 = new StringBuilder(text8.substring(0, 1));
                builder8.append("<font color='red'>" + secondChar3 + "</font>");
                builder8.append(text8.substring(2));

                numPass3.setText("<html>" + builder8.toString() + "</html>");
                
                numPass3.setOpaque(true);
                numPass3.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer8 == null || !timer8.isRunning()) {
                    int desiredX = 390; // set desired x-coordinate
                    int desiredY = 248; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer8 = new Timer(10, new ActionListener() {
                        int x = numPass3.getX();
                        int y = numPass3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < desiredX) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            numPass3.setLocation(x, y);
                            if (x >= desiredX && y >= desiredY) {
                                timer8.stop(); // stop when label reaches desired position
                                timer9.start();
                            }
                        }
                    });

                    
                }
                
                JLabel newLabel9 = new JLabel(numPass4.getText());
                newLabel9.setFont(numPass4.getFont());
                newLabel9.setBounds(numPass4.getX(), numPass4.getY(), 
                		numPass4.getWidth(), numPass4.getHeight());
                numPass4.getParent().add(newLabel9);
                
                String text9 = numPass4.getText();
                char secondChar4 = text9.charAt(1);

                StringBuilder builder9 = new StringBuilder(text9.substring(0, 1));
                builder9.append("<font color='red'>" + secondChar4 + "</font>");
                builder9.append(text9.substring(2));

                numPass4.setText("<html>" + builder9.toString() + "</html>");
                
                numPass4.setOpaque(true);
                numPass4.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer9 == null || !timer9.isRunning()) {
                    int desiredX = 390; // set desired x-coordinate
                    int desiredY = 356; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer9 = new Timer(10, new ActionListener() {
                        int x = numPass4.getX();
                        int y = numPass4.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < desiredX) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            numPass4.setLocation(x, y);
                            if (x >= desiredX && y >= desiredY) {
                                timer9.stop(); // stop when label reaches desired position
                                timer10.start();
                            }
                        }
                    });

                    
                }
                
                JLabel newLabel10 = new JLabel(numPass5.getText());
                newLabel10.setFont(numPass5.getFont());
                newLabel10.setBounds(numPass5.getX(), numPass5.getY(), 
                		numPass5.getWidth(), numPass5.getHeight());
                numPass5.getParent().add(newLabel10);
                
                String text10 = numPass5.getText();
                char secondChar5 = text10.charAt(1);

                StringBuilder builder10 = new StringBuilder(text10.substring(0, 1));
                builder10.append("<font color='red'>" + secondChar5 + "</font>");
                builder10.append(text5.substring(2));

                numPass5.setText("<html>" + builder10.toString() + "</html>");
                
                numPass5.setOpaque(true);
                numPass5.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer10 == null || !timer10.isRunning()) {
                    int desiredX = 390; // set desired x-coordinate
                    int desiredY = 428; // set desired y-coordinate
                    int speed = 2; // set movement speed

                    timer10 = new Timer(10, new ActionListener() {
                        int x = numPass5.getX();
                        int y = numPass5.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < desiredX) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            numPass5.setLocation(x, y);
                            if (x >= desiredX && y >= desiredY) {
                                timer10.stop(); // stop when label reaches desired position
                            }
                        }
                    });

                    
                }
                
                
                
            }
        });} 
}
