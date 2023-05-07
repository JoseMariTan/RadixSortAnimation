package radixanim;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.*;

public class RadixSortAnimation extends JFrame {

	// timers for Pass 1
	private Timer timer1;
	private Timer timer2;
	private Timer timer3;
	private Timer timer4;
	private Timer timer5;
	
	// timers for Pass 2
	private Timer timer6;
	private Timer timer7;
	private Timer timer8;
	private Timer timer9;
	private Timer timer10;
	
	// timers for Pass 3
	private Timer timer11;
	private Timer timer12;
	private Timer timer13;
	private Timer timer14;
	private Timer timer15;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadixSortAnimation frame = new RadixSortAnimation();
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
	
	// method to create the different labels used to visualize the radix sort animation.
	// each label is an element of the array.
	// each label has their respective coordiante (their position within the frame).
	// each digits has their separators to avoid confusion.
	
	public RadixSortAnimation() {
		getContentPane().setBackground(SystemColor.activeCaptionBorder);
        getContentPane().setLayout(null);
	
        Coords coords = new Coords();
        
        JLabel num1 = new JLabel("467");
        num1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num1.setFont(new Font("Helvetica", Font.BOLD, 15));
        num1.setHorizontalAlignment(JLabel.CENTER);
        num1.setBounds(347, 11, 33, 25);
        num1.setOpaque(true);
        num1.setBackground(Color.WHITE);
        getContentPane().add(num1);
        
        JLabel num4 = new JLabel("135");
        num4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num4.setFont(new Font("Helvetica", Font.BOLD, 15));
        num4.setHorizontalAlignment(JLabel.CENTER);
        num4.setBounds(476, 11, 33, 25);
        num4.setOpaque(true);
        num4.setBackground(Color.WHITE);
        getContentPane().add(num4);
        
        JLabel num3 = new JLabel("703");
        num3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num3.setFont(new Font("Helvetica", Font.BOLD, 15));
        num3.setHorizontalAlignment(JLabel.CENTER);
        num3.setBounds(433, 11, 33, 25);
        num3.setOpaque(true);
        num3.setBackground(Color.WHITE);
        getContentPane().add(num3);
        
        JLabel num5 = new JLabel("888");
        num5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num5.setFont(new Font("Helvetica", Font.BOLD, 15));
        num5.setHorizontalAlignment(JLabel.CENTER);
        num5.setBounds(519, 11, 33, 25);
        num5.setOpaque(true);
        num5.setBackground(Color.WHITE);
        getContentPane().add(num5);
        
        JLabel num2 = new JLabel("221");
        num2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num2.setFont(new Font("Helvetica", Font.BOLD, 15));
        num2.setHorizontalAlignment(JLabel.CENTER);
        num2.setBounds(390, 11, 33, 25);
        num2.setOpaque(true);
        num2.setBackground(Color.WHITE);
        getContentPane().add(num2);
        
        JLabel pass1 = new JLabel("Pass 1:");
        pass1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pass1.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1.setOpaque(true);
        pass1.setHorizontalAlignment(JLabel.CENTER);
        pass1.setBackground(Color.YELLOW);
        pass1.setBounds(24, 68, 72, 25);
        getContentPane().add(pass1);
        
        JLabel pass2 = new JLabel("Pass 2:");
        pass2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pass2.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2.setOpaque(true);
        pass2.setHorizontalAlignment(JLabel.CENTER);
        pass2.setBackground(Color.YELLOW);
        pass2.setBounds(309, 104, 72, 25);
        getContentPane().add(pass2);
        
        JLabel pass3 = new JLabel("Pass 3:");
        pass3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pass3.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3.setOpaque(true);
        pass3.setHorizontalAlignment(JLabel.CENTER);
        pass3.setBackground(Color.YELLOW);
        pass3.setBounds(605, 140, 72, 25);
        getContentPane().add(pass3);
        
        JLabel pass1_2 = new JLabel("2:");
        pass1_2.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_2.setHorizontalAlignment(JLabel.CENTER);
        pass1_2.setBackground(Color.WHITE);
        pass1_2.setBounds(78, 176, 18, 25);
        getContentPane().add(pass1_2);
        
        JLabel pass1_4 = new JLabel("4:");
        pass1_4.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_4.setHorizontalAlignment(JLabel.CENTER);
        pass1_4.setBackground(Color.WHITE);
        pass1_4.setBounds(78, 248, 18, 25);
        getContentPane().add(pass1_4);
        
        JLabel pass1_5 = new JLabel("5:");
        pass1_5.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_5.setHorizontalAlignment(JLabel.CENTER);
        pass1_5.setBackground(Color.WHITE);
        pass1_5.setBounds(78, 284, 18, 25);
        getContentPane().add(pass1_5);
        
        JLabel pass1_6 = new JLabel("6:");
        pass1_6.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_6.setHorizontalAlignment(JLabel.CENTER);
        pass1_6.setBackground(Color.WHITE);
        pass1_6.setBounds(78, 320, 18, 25);
        getContentPane().add(pass1_6);
        
        JLabel pass1_7 = new JLabel("7:");
        pass1_7.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_7.setHorizontalAlignment(JLabel.CENTER);
        pass1_7.setBackground(Color.WHITE);
        pass1_7.setBounds(78, 356, 18, 25);
        getContentPane().add(pass1_7);
        
        JLabel pass1_3 = new JLabel("3:");
        pass1_3.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_3.setHorizontalAlignment(JLabel.CENTER);
        pass1_3.setBackground(Color.WHITE);
        pass1_3.setBounds(78, 212, 18, 25);
        getContentPane().add(pass1_3);
        
        JLabel pass1_1 = new JLabel("1:");
        pass1_1.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_1.setHorizontalAlignment(JLabel.CENTER);
        pass1_1.setBackground(Color.WHITE);
        pass1_1.setBounds(78, 140, 18, 25);
        getContentPane().add(pass1_1);
        
        JLabel pass1_0 = new JLabel("0:");
        pass1_0.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_0.setHorizontalAlignment(JLabel.CENTER);
        pass1_0.setBackground(Color.WHITE);
        pass1_0.setBounds(78, 104, 18, 25);
        getContentPane().add(pass1_0);
        
        JLabel pass1_8 = new JLabel("8:");
        pass1_8.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_8.setHorizontalAlignment(JLabel.CENTER);
        pass1_8.setBackground(Color.WHITE);
        pass1_8.setBounds(78, 392, 18, 25);
        getContentPane().add(pass1_8);
        
        JLabel pass1_9 = new JLabel("9:");
        pass1_9.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass1_9.setHorizontalAlignment(JLabel.CENTER);
        pass1_9.setBackground(Color.WHITE);
        pass1_9.setBounds(78, 428, 18, 25);
        getContentPane().add(pass1_9);
        
        JLabel pass2_2 = new JLabel("2:");
        pass2_2.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_2.setHorizontalAlignment(JLabel.CENTER);
        pass2_2.setBackground(Color.WHITE);
        pass2_2.setBounds(364, 212, 18, 25);
        getContentPane().add(pass2_2);
        
        JLabel pass2_4 = new JLabel("4:");
        pass2_4.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_4.setHorizontalAlignment(JLabel.CENTER);
        pass2_4.setBackground(Color.WHITE);
        pass2_4.setBounds(364, 284, 18, 25);
        getContentPane().add(pass2_4);
        
        JLabel pass2_5 = new JLabel("5:");
        pass2_5.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_5.setHorizontalAlignment(JLabel.CENTER);
        pass2_5.setBackground(Color.WHITE);
        pass2_5.setBounds(364, 320, 18, 25);
        getContentPane().add(pass2_5);
        
        JLabel pass2_6 = new JLabel("6:");
        pass2_6.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_6.setHorizontalAlignment(JLabel.CENTER);
        pass2_6.setBackground(Color.WHITE);
        pass2_6.setBounds(364, 356, 18, 25);
        getContentPane().add(pass2_6);
        
        JLabel pass2_7 = new JLabel("7:");
        pass2_7.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_7.setHorizontalAlignment(JLabel.CENTER);
        pass2_7.setBackground(Color.WHITE);
        pass2_7.setBounds(364, 392, 18, 25);
        getContentPane().add(pass2_7);
        
        JLabel pass2_3 = new JLabel("3:");
        pass2_3.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_3.setHorizontalAlignment(JLabel.CENTER);
        pass2_3.setBackground(Color.WHITE);
        pass2_3.setBounds(364, 248, 18, 25);
        getContentPane().add(pass2_3);
        
        JLabel pass2_1 = new JLabel("1:");
        pass2_1.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_1.setHorizontalAlignment(JLabel.CENTER);
        pass2_1.setBackground(Color.WHITE);
        pass2_1.setBounds(364, 176, 18, 25);
        getContentPane().add(pass2_1);
        
        JLabel pass2_0 = new JLabel("0:");
        pass2_0.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_0.setHorizontalAlignment(JLabel.CENTER);
        pass2_0.setBackground(Color.WHITE);
        pass2_0.setBounds(364, 140, 18, 25);
        getContentPane().add(pass2_0);
        
        JLabel pass2_8 = new JLabel("8:");
        pass2_8.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_8.setHorizontalAlignment(JLabel.CENTER);
        pass2_8.setBackground(Color.WHITE);
        pass2_8.setBounds(364, 428, 18, 25);
        getContentPane().add(pass2_8);
        
        JLabel pass2_9 = new JLabel("9:");
        pass2_9.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass2_9.setHorizontalAlignment(JLabel.CENTER);
        pass2_9.setBackground(Color.WHITE);
        pass2_9.setBounds(364, 464, 18, 25);
        getContentPane().add(pass2_9);
        
        JLabel pass3_2 = new JLabel("2:");
        pass3_2.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_2.setHorizontalAlignment(JLabel.CENTER);
        pass3_2.setBackground(Color.WHITE);
        pass3_2.setBounds(659, 248, 18, 25);
        getContentPane().add(pass3_2);
        
        JLabel pass3_4 = new JLabel("4:");
        pass3_4.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_4.setHorizontalAlignment(JLabel.CENTER);
        pass3_4.setBackground(Color.WHITE);
        pass3_4.setBounds(659, 320, 18, 25);
        getContentPane().add(pass3_4);
        
        JLabel pass3_5 = new JLabel("5:");
        pass3_5.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_5.setHorizontalAlignment(JLabel.CENTER);
        pass3_5.setBackground(Color.WHITE);
        pass3_5.setBounds(659, 356, 18, 25);
        getContentPane().add(pass3_5);
        
        JLabel pass3_6 = new JLabel("6:");
        pass3_6.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_6.setHorizontalAlignment(JLabel.CENTER);
        pass3_6.setBackground(Color.WHITE);
        pass3_6.setBounds(659, 392, 18, 25);
        getContentPane().add(pass3_6);
        
        JLabel pass3_7 = new JLabel("7:");
        pass3_7.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_7.setHorizontalAlignment(JLabel.CENTER);
        pass3_7.setBackground(Color.WHITE);
        pass3_7.setBounds(659, 428, 18, 25);
        getContentPane().add(pass3_7);
        
        JLabel pass3_3 = new JLabel("3:");
        pass3_3.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_3.setHorizontalAlignment(JLabel.CENTER);
        pass3_3.setBackground(Color.WHITE);
        pass3_3.setBounds(659, 284, 18, 25);
        getContentPane().add(pass3_3);
        
        JLabel pass3_1 = new JLabel("1:");
        pass3_1.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_1.setHorizontalAlignment(JLabel.CENTER);
        pass3_1.setBackground(Color.WHITE);
        pass3_1.setBounds(659, 212, 18, 25);
        getContentPane().add(pass3_1);
        
        JLabel pass3_0 = new JLabel("0:");
        pass3_0.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_0.setHorizontalAlignment(JLabel.CENTER);
        pass3_0.setBackground(Color.WHITE);
        pass3_0.setBounds(659, 176, 18, 25);
        getContentPane().add(pass3_0);
        
        JLabel pass3_8 = new JLabel("8:");
        pass3_8.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_8.setHorizontalAlignment(JLabel.CENTER);
        pass3_8.setBackground(Color.WHITE);
        pass3_8.setBounds(659, 464, 18, 25);
        getContentPane().add(pass3_8);
        
        JLabel pass3_9 = new JLabel("9:");
        pass3_9.setFont(new Font("Helvetica", Font.BOLD, 15));
        pass3_9.setHorizontalAlignment(JLabel.CENTER);
        pass3_9.setBackground(Color.WHITE);
        pass3_9.setBounds(659, 500, 18, 25);
        getContentPane().add(pass3_9);
        
        JLabel num1pass2 = new JLabel("");
        num1pass2.setBackground(new Color(255, 255, 255));
        num1pass2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num1pass2.setFont(new Font("Helvetica", Font.BOLD, 15));
        num1pass2.setHorizontalAlignment(JLabel.CENTER);
        num1pass2.setBounds(105, 68, 33, 25);
        getContentPane().add(num1pass2);
        num1pass2.setVisible(false);
        
        JLabel num2pass2 = new JLabel("");
        num2pass2.setBackground(new Color(255, 255, 255));
        num2pass2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num2pass2.setFont(new Font("Helvetica", Font.BOLD, 15));
        num2pass2.setHorizontalAlignment(JLabel.CENTER);
        num2pass2.setBounds(148, 68, 33, 25);
        getContentPane().add(num2pass2);
        num2pass2.setVisible(false);
        
        JLabel num3pass2 = new JLabel("");
        num3pass2.setBackground(new Color(255, 255, 255));
        num3pass2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num3pass2.setFont(new Font("Helvetica", Font.BOLD, 15));
        num3pass2.setHorizontalAlignment(JLabel.CENTER);
        num3pass2.setBounds(191, 68, 33, 25);
        getContentPane().add(num3pass2);
        num3pass2.setVisible(false);
        
        JLabel num4pass2 = new JLabel("");
        num4pass2.setForeground(SystemColor.desktop);
        num4pass2.setBackground(new Color(255, 255, 255));
        num4pass2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num4pass2.setFont(new Font("Helvetica", Font.BOLD, 15));
        num4pass2.setHorizontalAlignment(JLabel.CENTER);
        num4pass2.setBounds(234, 68, 33, 25);
        getContentPane().add(num4pass2);
        num4pass2.setVisible(false);
        
        JLabel num5pass2 = new JLabel("");
        num5pass2.setForeground(SystemColor.desktop);
        num5pass2.setBackground(new Color(255, 255, 255));
        num5pass2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num5pass2.setFont(new Font("Helvetica", Font.BOLD, 15));
        num5pass2.setHorizontalAlignment(JLabel.CENTER);
        num5pass2.setBounds(277, 68, 33, 25);
        getContentPane().add(num5pass2);
        num5pass2.setVisible(false);
        
        JLabel num1pass3 = new JLabel("");
        num1pass3.setForeground(SystemColor.desktop);
        num1pass3.setBackground(new Color(255, 255, 255));
        num1pass3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num1pass3.setFont(new Font("Helvetica", Font.BOLD, 15));
        num1pass3.setHorizontalAlignment(JLabel.CENTER);
        num1pass3.setBounds(390, 104, 33, 25);
        getContentPane().add(num1pass3);
        num1pass3.setVisible(false);
        
        JLabel num2pass3 = new JLabel("");
        num2pass3.setForeground(SystemColor.desktop);
        num2pass3.setBackground(new Color(255, 255, 255));
        num2pass3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num2pass3.setFont(new Font("Helvetica", Font.BOLD, 15));
        num2pass3.setHorizontalAlignment(JLabel.CENTER);
        num2pass3.setBounds(433, 104, 33, 25);
        getContentPane().add(num2pass3);
        num2pass3.setVisible(false);
        
        JLabel num3pass3 = new JLabel("");
        num3pass3.setForeground(SystemColor.desktop);
        num3pass3.setBackground(new Color(255, 255, 255));
        num3pass3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num3pass3.setFont(new Font("Helvetica", Font.BOLD, 15));
        num3pass3.setHorizontalAlignment(JLabel.CENTER);
        num3pass3.setBounds(476, 104, 33, 25);
        getContentPane().add(num3pass3);
        num3pass3.setVisible(false);
        
        JLabel num4pass3 = new JLabel("");
        num4pass3.setForeground(SystemColor.desktop);
        num4pass3.setBackground(new Color(255, 255, 255));
        num4pass3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num4pass3.setFont(new Font("Helvetica", Font.BOLD, 15));
        num4pass3.setHorizontalAlignment(JLabel.CENTER);
        num4pass3.setBounds(519, 104, 33, 25);
        getContentPane().add(num4pass3);
        num4pass3.setVisible(false);
        
        JLabel num5pass3 = new JLabel("");
        num5pass3.setForeground(SystemColor.desktop);
        num5pass3.setBackground(new Color(255, 255, 255));
        num5pass3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        num5pass3.setFont(new Font("Helvetica", Font.BOLD, 15));
        num5pass3.setHorizontalAlignment(JLabel.CENTER);
        num5pass3.setBounds(562, 104, 33, 25);
        getContentPane().add(num5pass3);
        num5pass3.setVisible(false);
        
        JLabel sortedNum1 = new JLabel("");
        sortedNum1.setForeground(SystemColor.desktop);
        sortedNum1.setBackground(new Color(255, 255, 255));
        sortedNum1.setFont(new Font("Helvetica", Font.PLAIN, 20));
        sortedNum1.setBounds(687, 140, 33, 25);
        getContentPane().add(sortedNum1);
        sortedNum1.setVisible(false);
        
        JLabel sortedNum2 = new JLabel("");
        sortedNum2.setForeground(SystemColor.desktop);
        sortedNum2.setBackground(new Color(255, 255, 255));
        sortedNum2.setFont(new Font("Helvetica", Font.PLAIN, 20));
        sortedNum2.setBounds(730, 140, 33, 25);
        getContentPane().add(sortedNum2);
        sortedNum2.setVisible(false);
        
        JLabel sortedNum3 = new JLabel("");
        sortedNum3.setForeground(SystemColor.desktop);
        sortedNum3.setBackground(new Color(255, 255, 255));
        sortedNum3.setFont(new Font("Helvetica", Font.PLAIN, 20));
        sortedNum3.setBounds(773, 140, 33, 25);
        getContentPane().add(sortedNum3);
        sortedNum3.setVisible(false);
        
        JLabel sortedNum4 = new JLabel("");
        sortedNum4.setForeground(SystemColor.desktop);
        sortedNum4.setBackground(new Color(255, 255, 255));
        sortedNum4.setFont(new Font("Helvetica", Font.PLAIN, 20));
        sortedNum4.setBounds(816, 140, 33, 25);
        getContentPane().add(sortedNum4);
        sortedNum4.setVisible(false);
        
        JLabel sortedNum5 = new JLabel("");
        sortedNum5.setForeground(SystemColor.desktop);
        sortedNum5.setBackground(new Color(255, 255, 255));
        sortedNum5.setFont(new Font("Helvetica", Font.PLAIN, 20));
        sortedNum5.setBounds(859, 140, 33, 25);
        getContentPane().add(sortedNum5);
        sortedNum5.setVisible(false);
        
        JButton sortButton = new JButton("Sort");
        sortButton.setBounds(562, 11, 90, 25);
        sortButton.setBackground(Color.YELLOW);
        sortedNum5.setFont(new Font("Helvetica", Font.BOLD, 20));
        getContentPane().add(sortButton);

        // Set the window properties
        setTitle("Radix Sort Animation");
        setSize(951, 658);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        //retrieve the string array from user input
        String[] userInput = RadixPage1.valuesB;
        // update the labels with the input values from the first frame
        num1.setText(userInput[0]);
        num2.setText(userInput[1]);
        num3.setText(userInput[2]);
        num4.setText(userInput[3]);
        num5.setText(userInput[4]);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(106, 125, 193, 9);
        getContentPane().add(separator);
        separator.setBackground(Color.BLACK);
        separator.setForeground(Color.GRAY);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(106, 160, 193, 9);
        getContentPane().add(separator_1);
        separator_1.setBackground(Color.BLACK);
        separator_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(106, 197, 193, 9);
        getContentPane().add(separator_1_1);
        separator_1_1.setBackground(Color.BLACK);
        separator_1_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_1 = new JSeparator();
        separator_1_1_1.setBounds(106, 233, 193, 9);
        getContentPane().add(separator_1_1_1);
        separator_1_1_1.setBackground(Color.BLACK);
        separator_1_1_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_2 = new JSeparator();
        separator_1_1_2.setBounds(106, 268, 193, 9);
        getContentPane().add(separator_1_1_2);
        separator_1_1_2.setBackground(Color.BLACK);
        separator_1_1_2.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_3 = new JSeparator();
        separator_1_1_3.setBounds(106, 304, 193, 9);
        getContentPane().add(separator_1_1_3);
        separator_1_1_3.setBackground(Color.BLACK);
        separator_1_1_3.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_4 = new JSeparator();
        separator_1_1_4.setBounds(106, 339, 193, 9);
        getContentPane().add(separator_1_1_4);
        separator_1_1_4.setBackground(Color.BLACK);
        separator_1_1_4.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_5 = new JSeparator();
        separator_1_1_5.setBounds(106, 376, 193, 9);
        getContentPane().add(separator_1_1_5);
        separator_1_1_5.setBackground(Color.BLACK);
        separator_1_1_5.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_6 = new JSeparator();
        separator_1_1_6.setBounds(106, 412, 193, 9);
        getContentPane().add(separator_1_1_6);
        separator_1_1_6.setBackground(Color.BLACK);
        separator_1_1_6.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7 = new JSeparator();
        separator_1_1_7.setBounds(106, 449, 193, 9);
        getContentPane().add(separator_1_1_7);
        separator_1_1_7.setBackground(Color.BLACK);
        separator_1_1_7.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1 = new JSeparator();
        separator_1_1_7_1.setBounds(390, 160, 199, 9);
        getContentPane().add(separator_1_1_7_1);
        separator_1_1_7_1.setBackground(Color.BLACK);
        separator_1_1_7_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_1 = new JSeparator();
        separator_1_1_7_1_1.setBounds(390, 197, 199, 9);
        getContentPane().add(separator_1_1_7_1_1);
        separator_1_1_7_1_1.setBackground(Color.BLACK);
        separator_1_1_7_1_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_2 = new JSeparator();
        separator_1_1_7_1_2.setBounds(390, 233, 199, 9);
        getContentPane().add(separator_1_1_7_1_2);
        separator_1_1_7_1_2.setBackground(Color.BLACK);
        separator_1_1_7_1_2.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_3 = new JSeparator();
        separator_1_1_7_1_3.setBounds(390, 268, 199, 9);
        getContentPane().add(separator_1_1_7_1_3);
        separator_1_1_7_1_3.setBackground(Color.BLACK);
        separator_1_1_7_1_3.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_4 = new JSeparator();
        separator_1_1_7_1_4.setBounds(390, 304, 199, 9);
        getContentPane().add(separator_1_1_7_1_4);
        separator_1_1_7_1_4.setBackground(Color.BLACK);
        separator_1_1_7_1_4.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_5 = new JSeparator();
        separator_1_1_7_1_5.setBounds(390, 339, 199, 9);
        getContentPane().add(separator_1_1_7_1_5);
        separator_1_1_7_1_5.setBackground(Color.BLACK);
        separator_1_1_7_1_5.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_6 = new JSeparator();
        separator_1_1_7_1_6.setBounds(390, 376, 199, 9);
        getContentPane().add(separator_1_1_7_1_6);
        separator_1_1_7_1_6.setBackground(Color.BLACK);
        separator_1_1_7_1_6.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_7 = new JSeparator();
        separator_1_1_7_1_7.setBounds(390, 412, 199, 9);
        getContentPane().add(separator_1_1_7_1_7);
        separator_1_1_7_1_7.setBackground(Color.BLACK);
        separator_1_1_7_1_7.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_8 = new JSeparator();
        separator_1_1_7_1_8.setBounds(390, 449, 199, 9);
        getContentPane().add(separator_1_1_7_1_8);
        separator_1_1_7_1_8.setBackground(Color.BLACK);
        separator_1_1_7_1_8.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9 = new JSeparator();
        separator_1_1_7_1_9.setBounds(390, 484, 199, 9);
        getContentPane().add(separator_1_1_7_1_9);
        separator_1_1_7_1_9.setBackground(Color.BLACK);
        separator_1_1_7_1_9.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1 = new JSeparator();
        separator_1_1_7_1_9_1.setBounds(687, 197, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1);
        separator_1_1_7_1_9_1.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_1 = new JSeparator();
        separator_1_1_7_1_9_1_1.setBounds(687, 233, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_1);
        separator_1_1_7_1_9_1_1.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_1.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_2 = new JSeparator();
        separator_1_1_7_1_9_1_2.setBounds(687, 268, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_2);
        separator_1_1_7_1_9_1_2.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_2.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_3 = new JSeparator();
        separator_1_1_7_1_9_1_3.setBounds(687, 304, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_3);
        separator_1_1_7_1_9_1_3.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_3.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_4 = new JSeparator();
        separator_1_1_7_1_9_1_4.setBounds(687, 339, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_4);
        separator_1_1_7_1_9_1_4.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_4.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_5 = new JSeparator();
        separator_1_1_7_1_9_1_5.setBounds(687, 376, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_5);
        separator_1_1_7_1_9_1_5.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_5.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_6 = new JSeparator();
        separator_1_1_7_1_9_1_6.setBounds(687, 412, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_6);
        separator_1_1_7_1_9_1_6.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_6.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_7 = new JSeparator();
        separator_1_1_7_1_9_1_7.setBounds(687, 449, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_7);
        separator_1_1_7_1_9_1_7.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_7.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_8 = new JSeparator();
        separator_1_1_7_1_9_1_8.setBounds(687, 484, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_8);
        separator_1_1_7_1_9_1_8.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_8.setForeground(Color.GRAY);
        
        JSeparator separator_1_1_7_1_9_1_9 = new JSeparator();
        separator_1_1_7_1_9_1_9.setBounds(687, 519, 199, 9);
        getContentPane().add(separator_1_1_7_1_9_1_9);
        separator_1_1_7_1_9_1_9.setBackground(Color.BLACK);
        separator_1_1_7_1_9_1_9.setForeground(Color.GRAY);
        
	// creates a button that starts the sort animation.
        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
		    
		 // ensures tha sorting button can only be pressed once
            	 sortButton.setEnabled(false);
            	 sortButton.setText("Sorting...");
		    
 		 // create an array that dictates the starting position of each Element.
		 // makes changing the coordinates easier.
            	 int[] xCoordinates1 = {106, 148, 190, 232, 274};
            	 coords.setDesiredXp1n1(xCoordinates1[0]);
            	 coords.setDesiredXp1n2(xCoordinates1[1]);
            	 coords.setDesiredXp1n3(xCoordinates1[2]);
            	 coords.setDesiredXp1n4(xCoordinates1[3]);
            	 coords.setDesiredXp1n5(xCoordinates1[4]);
         // PASS 1
            	 
		 // The following are done done for each number, for each pass:
		 // a new label is created for each element.
		 // its x and y is taken, along with its height and width.
		 // gets the respective digit: PASS 1 - ones digit, PASS 2 - tenths digit, PASS 3 - hundredths digit.
		 	// if no timer is running, timer1 is started where:
		    	// the digit is checked to identify its desired coordinates.
		    	// the checked digit is highlighted for visual clarity.
		    	// the desiredX and desiredY are the final coordinates of the label
		    	// the "speed" variable sets how fast the label moves, which changes constantly.
		    	// once the desired coordinates are met, the timer stops, and starts the the proceeding timer. 
		    	// there are a total of 15 timers within the animation.
		    	// The cycle continues until the array is sorted (up to PASS 3).
		    
            	 JLabel newLabel1 = new JLabel(num1.getText());
                 newLabel1.setFont(num1.getFont());
                 newLabel1.setBounds(num1.getX(), num1.getY(), num1.getWidth(), num1.getHeight());
                 num1.getParent().add(newLabel1);
                           
                 String text1 = num1.getText();
                 char lastChar1 = text1.charAt(text1.length() - 1);

                 StringBuilder builder1 = new StringBuilder(text1.substring(0, text1.length() - 1));
                 builder1.append("<font color='red'>" + lastChar1 + "</font>");
                 num1.setText("<html>" + builder1.toString() + "</html>");

             	// start timer to move label to a specific position
                 if (timer1 == null || !timer1.isRunning()) {

                     final int desiredY; // set desired y-coordinate
                     
                     int[] yValues = { 104, 140, 176, 212, 248, 284, 320, 356, 392, 428 };
                     int ones = Character.getNumericValue(userInput[0].charAt(2));
                     desiredY = (ones >= 0 && ones <= 9) ? yValues[ones] : 0;
 
                     int speed = 4; // set movement speed

                     timer1 = new Timer(10, new ActionListener() {
                         int x = num1.getX();
                         int y = num1.getY();
                         public void actionPerformed(ActionEvent e) {
                        	 	if (x >= 322) {
                        		    x -= speed; // move to the left
                        		}
                        		if (x <= 322 && y < desiredY) {
                        		    y += speed; // move down   
                        		    // check if the label is below the desired Y-coordinate 
                        		    // before moving to the left
                        		}
                        		if (y >= desiredY) {
                        		    x -= speed; // move left
                        		}
                             num1.setLocation(x, y);
                             if (x <= coords.getDesiredXp1n1() && y >= desiredY) {
                                 timer1.stop(); // stop when label reaches desired position   
                                 timer2.start();
                             }
                         }
                     });
                     timer1.start(); 
                 } 
            	JLabel newLabel2 = new JLabel(num2.getText());
                newLabel2.setFont(num2.getFont());
                newLabel2.setBounds(num2.getX(), num2.getY(), num2.getWidth(), num2.getHeight());
                num2.getParent().add(newLabel2);
                
                String text2 = num2.getText();
                char lastChar2 = text2.charAt(text2.length() - 1);

                StringBuilder builder2 = new StringBuilder(text2.substring(0, text2.length() - 1));
                builder2.append("<font color='red'>" + lastChar2 + "</font>");
                num2.setText("<html>" + builder2.toString() + "</html>");

            	// start timer to move label to a specific position
                if (timer2 == null || !timer2.isRunning()) {               	
                    final int desiredY; // set desired y-coordinate

                    int[] yValues = { 104, 140, 176, 212, 248, 284, 320, 356, 392, 428 };
                    int ones = Character.getNumericValue(userInput[1].charAt(2));
                    desiredY = (ones >= 0 && ones <= 9) ? yValues[ones] : 0;       
                    
                    int speed = 4; // set movement speed

                    timer2 = new Timer(10, new ActionListener() {
                        int x = num2.getX();
                        int y = num2.getY();
                        public void actionPerformed(ActionEvent e) {
                        	if (x >= 322) {
                                x -= speed; // move to the left
                        	}
                        	if (x <= 322 && y < desiredY) {
                                y += speed; // move down                                  
                            }
                            if (y >= desiredY) {
                                x -= speed; // move left
                            }
                            num2.setLocation(x, y);
                            if (x <= coords.getDesiredXp1n2() && y >= desiredY) {
                                timer2.stop(); // stop when label reaches desired position
                                timer3.start(); 
                            }
                        }
                    });
                    
                }
                JLabel newLabel3 = new JLabel(num3.getText());
                newLabel3.setFont(num3.getFont());
                newLabel3.setBounds(num3.getX(), num3.getY(), num3.getWidth(), num3.getHeight());
                num3.getParent().add(newLabel3);
                
                String text3 = num3.getText();
                char lastChar3 = text3.charAt(text3.length() - 1);

                StringBuilder builder3 = new StringBuilder(text3.substring(0, text3.length() - 1));
                builder3.append("<font color='red'>" + lastChar3 + "</font>");
                num3.setText("<html>" + builder3.toString() + "</html>");
                
            	// start timer to move label to a specific position
                if (timer3 == null || !timer3.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 104, 140, 176, 212, 248, 284, 320, 356, 392, 428 };
                    int ones = Character.getNumericValue(userInput[2].charAt(2));
                    desiredY = (ones >= 0 && ones <= 9) ? yValues[ones] : 0;

                    int speed = 4; // set movement speed

                    timer3 = new Timer(10, new ActionListener() {
                        int x = num3.getX();
                        int y = num3.getY();
                        public void actionPerformed(ActionEvent e) {
                        	if (x >= 322) {
                                x -= speed; // move to the left
                        	}
                        	if (x <= 322 && y < desiredY) {
                                y += speed; // move down                                  
                            }
                            if (y >= desiredY) {
                                x -= speed; // move left
                            }
                            num3.setLocation(x, y);
                            if (x <= coords.getDesiredXp1n3() && y >= desiredY) {
                                timer3.stop(); // stop when label reaches desired position                                
                                timer4.start();
                            }
                        }
                    });
                } 
                JLabel newLabel4 = new JLabel(num4.getText());
                newLabel4.setFont(num4.getFont());
                newLabel4.setBounds(num4.getX(), num4.getY(), num4.getWidth(), num4.getHeight());
                num4.getParent().add(newLabel4);
                
                String text4 = num4.getText();
                char lastChar4 = text4.charAt(text4.length() - 1);

                StringBuilder builder4 = new StringBuilder(text4.substring(0, text4.length() - 1));
                builder4.append("<font color='red'>" + lastChar4 + "</font>");
                num4.setText("<html>" + builder4.toString() + "</html>");

            	// start timer to move label to a specific position
                if (timer4 == null || !timer4.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 104, 140, 176, 212, 248, 284, 320, 356, 392, 428 };
                    int ones = Character.getNumericValue(userInput[3].charAt(2));
                    desiredY = (ones >= 0 && ones <= 9) ? yValues[ones] : 0;

                    int speed = 4; // set movement speed

                    timer4 = new Timer(10, new ActionListener() {
                        int x = num4.getX();
                        int y = num4.getY();
                        public void actionPerformed(ActionEvent e) {
                        	if (x >= 322) {
                                x -= speed; // move to the left
                        	}
                        	if (x <= 322 && y < desiredY) {
                                y += speed; // move down                                  
                            }
                            if (y >= desiredY) {
                                x -= speed; // move left
                            }
                            num4.setLocation(x, y);
                            if (x <= coords.getDesiredXp1n4() && y >= desiredY) {
                                timer4.stop(); // stop when label reaches desired position                               
                                timer5.start();
                            }
                        }
                    });
                }
                JLabel newLabel5 = new JLabel(num5.getText());
                newLabel5.setFont(num5.getFont());
                newLabel5.setBounds(num5.getX(), num5.getY(), num5.getWidth(), num5.getHeight());
                num5.getParent().add(newLabel5);
                
                String text5 = num5.getText();
                char lastChar5 = text5.charAt(text5.length() - 1);

                StringBuilder builder5 = new StringBuilder(text5.substring(0, text5.length() - 1));
                builder5.append("<font color='red'>" + lastChar5 + "</font>");
                num5.setText("<html>" + builder5.toString() + "</html>");

            	// start timer to move label to a specific position
                if (timer5 == null || !timer5.isRunning()) {
                    final int desiredY; // set desired y-coordinate

                    int[] yValues = { 104, 140, 176, 212, 248, 284, 320, 356, 392, 428 };
                    int ones = Character.getNumericValue(userInput[4].charAt(2));
                    desiredY = (ones >= 0 && ones <= 9) ? yValues[ones] : 0;
                    
                    
                    int speed = 4; // set movement speed

                    timer5 = new Timer(10, new ActionListener() {
                        int x = num5.getX();
                        int y = num5.getY();
                        public void actionPerformed(ActionEvent e) {
                        	if (x >= 322) {
                                x -= speed; // move to the left
                        	}
                        	if (x <= 322 && y < desiredY) {
                                y += speed; // move down                                  
                            }
                            if (y >= desiredY) {
                                x -= speed; // move left
                            }
                            num5.setLocation(x, y);
                            if (x <= coords.getDesiredXp1n5() && y >= desiredY) {
                                timer5.stop(); // stop when label reaches desired 
                                num1pass2.setVisible(true);
                                num2pass2.setVisible(true);
                                num3pass2.setVisible(true);
                                num4pass2.setVisible(true);
                                num5pass2.setVisible(true);
                                timer6.start();
                            }
                        }
                    });
                }
                
                // PASS 2 
                
                // Sorting the array by ones digit from left to right
                Arrays.sort(userInput, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int digit1 = Integer.parseInt(Character.toString(o1.charAt(2)));
                        int digit2 = Integer.parseInt(Character.toString(o2.charAt(2)));
                        return Integer.compare(digit1, digit2);
                    }
                });
                
                num1pass2.setText(userInput[0]);
                num2pass2.setText(userInput[1]);
                num3pass2.setText(userInput[2]);
                num4pass2.setText(userInput[3]);
                num5pass2.setText(userInput[4]);
                
                int[] xCoordinates2 = {390, 432, 474, 516, 558};
     	       	coords.setDesiredXp2n1(xCoordinates2[0]);
     	       	coords.setDesiredXp2n2(xCoordinates2[1]);
     	       	coords.setDesiredXp2n3(xCoordinates2[2]);
     	       	coords.setDesiredXp2n4(xCoordinates2[3]);
     	       	coords.setDesiredXp2n5(xCoordinates2[4]);
                
                JLabel newLabel6 = new JLabel(num1pass2.getText());
                newLabel6.setFont(num1pass2.getFont());
                newLabel6.setBounds(num1pass2.getX(), num1pass2.getY(), num1pass2.getWidth(), num1pass2.getHeight());
                num1pass2.getParent().add(newLabel6);
                
                String text6 = num1pass2.getText();
                char secondChar = text6.charAt(1);

                StringBuilder builder6 = new StringBuilder(text6.substring(0, 1));
                builder6.append("<font color='red'>" + secondChar + "</font>");
                builder6.append(text6.substring(2));

                num1pass2.setText("<html>" + builder6.toString() + "</html>");               
                num1pass2.setOpaque(true);
                num1pass2.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer6 == null || !timer6.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 140, 176, 212, 248, 284, 320, 356, 392, 428, 464 };
                    int tenths = Character.getNumericValue(userInput[0].charAt(1));
                    desiredY = (tenths >= 0 && tenths <= 9) ? yValues[tenths] : 0;
                    
                    int speed = 3; // set movement speed

                    timer6 = new Timer(10, new ActionListener() {
                        int x = num1pass2.getX();
                        int y = num1pass2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp2n1()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num1pass2.setLocation(x, y);
                            if (x >= coords.getDesiredXp2n1() && y >= desiredY) {
                                timer6.stop(); // stop when label reaches desired position          
                                timer7.start();
                            }
                        }
                    });                
                }
                JLabel newLabel7 = new JLabel(num2pass2.getText());
                newLabel7.setFont(num2pass2.getFont());
                newLabel7.setBounds(num2pass2.getX(), num2pass2.getY(), num2pass2.getWidth(), num2pass2.getHeight());
                num2pass2.getParent().add(newLabel7);
                
                String text7 = num2pass2.getText();
                char secondChar2 = text7.charAt(1);

                StringBuilder builder7 = new StringBuilder(text7.substring(0, 1));
                builder7.append("<font color='red'>" + secondChar2 + "</font>");
                builder7.append(text7.substring(2));

                num2pass2.setText("<html>" + builder7.toString() + "</html>");  
                num2pass2.setOpaque(true);
                num2pass2.setBackground(Color.WHITE);
            	// start timer to move label to a specific position
                if (timer7 == null || !timer7.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 140, 176, 212, 248, 284, 320, 356, 392, 428, 464 };
                    int tenths = Character.getNumericValue(userInput[1].charAt(1));
                    desiredY = (tenths >= 0 && tenths <= 9) ? yValues[tenths] : 0;
                    
                    int speed = 3; // set movement speed

                    timer7 = new Timer(10, new ActionListener() {
                        int x = num2pass2.getX();
                        int y = num2pass2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp2n2()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num2pass2.setLocation(x, y);
                            if (x >= coords.getDesiredXp2n2() && y >= desiredY) {
                                timer7.stop(); // stop when label reaches desired position                                                              
                                timer8.start();
                            }
                        }
                    });                  
                }               
                JLabel newLabel8 = new JLabel(num3pass2.getText());
                newLabel8.setFont(num3pass2.getFont());
                newLabel8.setBounds(num3pass2.getX(), num3pass2.getY(), num3pass2.getWidth(), num3pass2.getHeight());
                num3pass2.getParent().add(newLabel8);
                
                String text8 = num3pass2.getText();
                char secondChar3 = text8.charAt(1);

                StringBuilder builder8 = new StringBuilder(text8.substring(0, 1));
                builder8.append("<font color='red'>" + secondChar3 + "</font>");
                builder8.append(text8.substring(2));

                num3pass2.setText("<html>" + builder8.toString() + "</html>");
                num3pass2.setOpaque(true);
                num3pass2.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer8 == null || !timer8.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 140, 176, 212, 248, 284, 320, 356, 392, 428, 464 };
                    int tenths = Character.getNumericValue(userInput[2].charAt(1));
                    desiredY = (tenths >= 0 && tenths <= 9) ? yValues[tenths] : 0;
                    
                    int speed = 3; // set movement speed

                    timer8 = new Timer(10, new ActionListener() {
                        int x = num3pass2.getX();
                        int y = num3pass2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp2n3()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num3pass2.setLocation(x, y);
                            if (x >= coords.getDesiredXp2n3() && y >= desiredY) {
                                timer8.stop(); // stop when label reaches desired position         
                                timer9.start();
                            }
                        }
                    });                  
                }  
                JLabel newLabel9 = new JLabel(num4pass2.getText());
                newLabel9.setFont(num4pass2.getFont());
                newLabel9.setBounds(num4pass2.getX(), num4pass2.getY(), num4pass2.getWidth(), num4pass2.getHeight());
                num4pass2.getParent().add(newLabel9);
                
                String text9 = num4pass2.getText();
                char secondChar4 = text9.charAt(1);

                StringBuilder builder9 = new StringBuilder(text9.substring(0, 1));
                builder9.append("<font color='red'>" + secondChar4 + "</font>");
                builder9.append(text9.substring(2));

                num4pass2.setText("<html>" + builder9.toString() + "</html>");
                num4pass2.setOpaque(true);
                num4pass2.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer9 == null || !timer9.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 140, 176, 212, 248, 284, 320, 356, 392, 428, 464 };
                    int tenths = Character.getNumericValue(userInput[3].charAt(1));
                    desiredY = (tenths >= 0 && tenths <= 9) ? yValues[tenths] : 0;
                    
                    int speed = 3; // set movement speed

                    timer9 = new Timer(10, new ActionListener() {
                        int x = num4pass2.getX();
                        int y = num4pass2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp2n4()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num4pass2.setLocation(x, y);
                            if (x >= coords.getDesiredXp2n4() && y >= desiredY) {
                                timer9.stop(); // stop when label reaches desired position         
                                timer10.start();
                            }
                        }
                    });                  
                }   
                JLabel newLabel10 = new JLabel(num5pass2.getText());
                newLabel10.setFont(num5pass2.getFont());
                newLabel10.setBounds(num5pass2.getX(), num5pass2.getY(), num5pass2.getWidth(), num5pass2.getHeight());
                num5pass2.getParent().add(newLabel10);
                
                String text10 = num5pass2.getText();
                char secondChar5 = text10.charAt(1);

                StringBuilder builder10 = new StringBuilder(text10.substring(0, 1));
                builder10.append("<font color='red'>" + secondChar5 + "</font>");
                builder10.append(text10.substring(2));

                num5pass2.setText("<html>" + builder10.toString() + "</html>"); 
                num5pass2.setOpaque(true);
                num5pass2.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer10 == null || !timer10.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 140, 176, 212, 248, 284, 320, 356, 392, 428, 464 };
                    int tenths = Character.getNumericValue(userInput[4].charAt(1));
                    desiredY = (tenths >= 0 && tenths <= 9) ? yValues[tenths] : 0;
                    
                    int speed = 3; // set movement speed

                    timer10 = new Timer(10, new ActionListener() {
                        int x = num5pass2.getX();
                        int y = num5pass2.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp2n5()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num5pass2.setLocation(x, y);
                            if (x >= coords.getDesiredXp2n5() && y >= desiredY) {
                                timer10.stop(); // stop when label reaches desired position                                
                                num1pass3.setVisible(true);
                                num2pass3.setVisible(true);
                                num3pass3.setVisible(true);
                                num4pass3.setVisible(true);
                                num5pass3.setVisible(true);                                
                                timer11.start();
                            }
                        }
                    });                   
                }
                
                // PASS 3  
                
                // Sorting the array by ones digit from left to right
                Arrays.sort(userInput, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int digit1 = Integer.parseInt(Character.toString(o1.charAt(1)));
                        int digit2 = Integer.parseInt(Character.toString(o2.charAt(1)));
                        return Integer.compare(digit1, digit2);
                    }
                });               
                num1pass3.setText(userInput[0]);
                num2pass3.setText(userInput[1]);
                num3pass3.setText(userInput[2]);
                num4pass3.setText(userInput[3]);
                num5pass3.setText(userInput[4]);
                
                int[] xCoordinates3 = {687, 729, 771, 813, 855};
     	       	coords.setDesiredXp3n1(xCoordinates3[0]);
     	       	coords.setDesiredXp3n2(xCoordinates3[1]);
     	       	coords.setDesiredXp3n3(xCoordinates3[2]);
     	       	coords.setDesiredXp3n4(xCoordinates3[3]);
     	       	coords.setDesiredXp3n5(xCoordinates3[4]);
                
                JLabel newLabel11 = new JLabel(num1pass3.getText());
                newLabel11.setFont(num1pass3.getFont());
                newLabel11.setBounds(num1pass3.getX(), num1pass3.getY(), num1pass3.getWidth(), num1pass3.getHeight());
                num1pass3.getParent().add(newLabel11);
                
                String text11 = num1pass3.getText();
                char firstChar = text11.charAt(0);

                StringBuilder builder11 = new StringBuilder();
                builder11.append("<font color='red'>" + firstChar + "</font>");
                builder11.append(text11.substring(1));

                num1pass3.setText("<html>" + builder11.toString() + "</html>");
                num1pass3.setOpaque(true);
                num1pass3.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer11 == null || !timer11.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 176, 212, 248, 284, 320, 356, 392, 428, 464, 500 };
                    int hundredths = Character.getNumericValue(userInput[0].charAt(0));
                    desiredY = (hundredths >= 0 && hundredths <= 9) ? yValues[hundredths] : 0;

                    int speed = 3; // set movement speed

                    timer11 = new Timer(10, new ActionListener() {
                        int x = num1pass3.getX();
                        int y = num1pass3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp3n1()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num1pass3.setLocation(x, y);
                            if (x >= coords.getDesiredXp3n1() && y >= desiredY) {
                                timer11.stop(); // stop when label reaches desired position
                                timer12.start();
                            }
                        }
                    });                    
                }
                JLabel newLabel12 = new JLabel(num2pass3.getText());
                newLabel12.setFont(num2pass3.getFont());
                newLabel12.setBounds(num2pass3.getX(), num2pass3.getY(), num2pass3.getWidth(), num2pass3.getHeight());
                num2pass3.getParent().add(newLabel12);
                
                String text12 = num2pass3.getText();
                char firstChar2 = text12.charAt(0);

                StringBuilder builder12 = new StringBuilder();
                builder12.append("<font color='red'>" + firstChar2 + "</font>");
                builder12.append(text12.substring(1));

                num2pass3.setText("<html>" + builder12.toString() + "</html>");
                num2pass3.setOpaque(true);
                num2pass3.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer12 == null || !timer12.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 176, 212, 248, 284, 320, 356, 392, 428, 464, 500 };
                    int hundredths = Character.getNumericValue(userInput[1].charAt(0));
                    desiredY = (hundredths >= 0 && hundredths <= 9) ? yValues[hundredths] : 0;

                    int speed = 3; // set movement speed

                    timer12 = new Timer(10, new ActionListener() {
                        int x = num2pass3.getX();
                        int y = num2pass3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp3n2()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num2pass3.setLocation(x, y);
                            if (x >= coords.getDesiredXp3n2() && y >= desiredY) {
                                timer12.stop(); // stop when label reaches desired position                                
                                timer13.start();
                            }
                        }
                    });                    
                }                
                JLabel newLabel13 = new JLabel(num3pass3.getText());
                newLabel13.setFont(num3pass3.getFont());
                newLabel13.setBounds(num3pass3.getX(), num3pass3.getY(), num3pass3.getWidth(), num3pass3.getHeight());
                num3pass3.getParent().add(newLabel13);
                
                String text13 = num3pass3.getText();
                char firstChar3 = text13.charAt(0);

                StringBuilder builder13 = new StringBuilder();
                builder13.append("<font color='red'>" + firstChar3 + "</font>");
                builder13.append(text13.substring(1));

                num3pass3.setText("<html>" + builder13.toString() + "</html>");
                num3pass3.setOpaque(true);
                num3pass3.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer13 == null || !timer13.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 176, 212, 248, 284, 320, 356, 392, 428, 464, 500 };
                    int hundredths = Character.getNumericValue(userInput[2].charAt(0));
                    desiredY = (hundredths >= 0 && hundredths <= 9) ? yValues[hundredths] : 0;

                    
                    int speed = 3; // set movement speed

                    timer13 = new Timer(10, new ActionListener() {
                        int x = num3pass3.getX();
                        int y = num3pass3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp3n3()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num3pass3.setLocation(x, y);
                            if (x >= coords.getDesiredXp3n3() && y >= desiredY) {
                                timer13.stop(); // stop when label reaches desired position
                                timer14.start();
                            }
                        }
                    });                 
                }    
                JLabel newLabel14 = new JLabel(num4pass3.getText());
                newLabel14.setFont(num4pass3.getFont());
                newLabel14.setBounds(num4pass3.getX(), num4pass3.getY(), num4pass3.getWidth(), num4pass3.getHeight());
                num4pass3.getParent().add(newLabel14);
                
                String text14 = num4pass3.getText();
                char firstChar4 = text14.charAt(0);

                StringBuilder builder14 = new StringBuilder();
                builder14.append("<font color='red'>" + firstChar4 + "</font>");
                builder14.append(text14.substring(1));

                num4pass3.setText("<html>" + builder14.toString() + "</html>");                
                num4pass3.setOpaque(true);
                num4pass3.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer14 == null || !timer14.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 176, 212, 248, 284, 320, 356, 392, 428, 464, 500 };
                    int hundredths = Character.getNumericValue(userInput[3].charAt(0));
                    desiredY = (hundredths >= 0 && hundredths <= 9) ? yValues[hundredths] : 0;

                    int speed = 3; // set movement speed

                    timer14 = new Timer(10, new ActionListener() {
                        int x = num4pass3.getX();
                        int y = num4pass3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp3n4()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num4pass3.setLocation(x, y);
                            if (x >= coords.getDesiredXp3n4() && y >= desiredY) {
                                timer14.stop(); // stop when label reaches desired position
                                timer15.start();
                            }
                        }
                    });                    
                }    
                JLabel newLabel15 = new JLabel(num5pass3.getText());
                newLabel15.setFont(num5pass3.getFont());
                newLabel15.setBounds(num5pass3.getX(), num5pass3.getY(),num5pass3.getWidth(), num5pass3.getHeight());
                num5pass3.getParent().add(newLabel15);
                
                String text15 = num5pass3.getText();
                char firstChar5 = text15.charAt(0);

                StringBuilder builder15 = new StringBuilder();
                builder15.append("<font color='red'>" + firstChar5 + "</font>");
                builder15.append(text15.substring(1));

                num5pass3.setText("<html>" + builder15.toString() + "</html>");                
                num5pass3.setOpaque(true);
                num5pass3.setBackground(Color.WHITE);
                
            	// start timer to move label to a specific position
                if (timer15 == null || !timer15.isRunning()) {
                    final int desiredY; // set desired y-coordinate
                    
                    int[] yValues = { 176, 212, 248, 284, 320, 356, 392, 428, 464, 500 };
                    int hundredths = Character.getNumericValue(userInput[4].charAt(0));
                    desiredY = (hundredths >= 0 && hundredths <= 9) ? yValues[hundredths] : 0;
                    
                    int speed = 3; // set movement speed

                    timer15 = new Timer(10, new ActionListener() {
                        int x = num4pass3.getX();
                        int y = num4pass3.getY();
                        public void actionPerformed(ActionEvent e) {
                            if (x < coords.getDesiredXp3n5()) {
                                x += speed; // move to the right
                            }
                            if (y < desiredY) {
                                y += speed; // move down
                            }
                            num5pass3.setLocation(x, y);
                            if (x >= coords.getDesiredXp3n5() && y >= desiredY) {
                                timer15.stop(); // stop when label reaches desired position
                                // Sorting the array by ones digit from left to right
                                Arrays.sort(userInput, new Comparator<String>() {
                                    @Override
                                    public int compare(String o1, String o2) {
                                        int digit1 = Integer.parseInt(Character.toString(o1.charAt(0)));
                                        int digit2 = Integer.parseInt(Character.toString(o2.charAt(0)));
                                        return Integer.compare(digit1, digit2);
                                    }
                                });   
                                
                                sortedNum1.setText(userInput[0]);
                                sortedNum2.setText(userInput[1]);
                                sortedNum3.setText(userInput[2]);
                                sortedNum4.setText(userInput[3]);
                                sortedNum5.setText(userInput[4]);
				
				// SORTED ARRAY IS MADE VISIBLE AFTER SORTING
                                sortedNum1.setVisible(true);
                                sortedNum2.setVisible(true);
                                sortedNum3.setVisible(true);
                                sortedNum4.setVisible(true);
                                sortedNum5.setVisible(true);
				   
				// SORTED ARRAY IS HIGHLIGHTED FOR CLARITY   
                                sortedNum1.setForeground(Color.RED);
                                sortedNum2.setForeground(Color.RED);
                                sortedNum3.setForeground(Color.RED);
                                sortedNum4.setForeground(Color.RED);
                                sortedNum5.setForeground(Color.RED);
                                
                // CREATE A WINDOW TO SHOW SORTED ARRAY
                                JFrame sortedFrame = new JFrame("Radix Sorted Array");
                                JLabel sortedLabel = new JLabel("<html><b>The sorted array is: </b>" + sortedNum1.getText() + ", "
                               		 + sortedNum2.getText() + ", " + sortedNum3.getText() + ", " + sortedNum4.getText() + ", " + sortedNum5.getText() + "</html>");
                                sortedLabel.setForeground(Color.BLACK);
                                sortedLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
                                sortedLabel.setHorizontalAlignment(JLabel.CENTER);
                                sortedFrame.getContentPane().add(sortedLabel);
                                
                                sortedFrame.setSize(500,200);
                                sortedFrame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
                                sortedFrame.setBackground(Color.GRAY);
                                sortedFrame.setLocationRelativeTo(null);
                                sortedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                sortedFrame.setVisible(true);
                           
                            }
                        }
                    }); 
                }
            }
        });} 
}
