
/**
 * File name: Dice.java
 * Author: SHOUJUN ZHAO
 * Course: CST8284-section313
 * Term: Spring2024
 * Assignment: Assignment 3
 * Date: July 19
 * Purpose: Simulate a multi-sided die and “roll” it to obtain random values
 */

package zhao.shoujun.assign3;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *@author SHOUJUN ZHAO
 *@version 1.0, July 2024
 *@since javac 17.0.10
 *
 * Create a Swing GUI application that simulates a multi-sided die.
 * The end-user can set the number of sides and simulate rolling the die.
 */
public class Dice implements Runnable {
	
	/**
	 * The text field to input the number of sides for the dice
	 */
    private JTextField sidesInput;
    
	/**
	 * The text field to display the rolled value for the dice
	 */
    private JTextField rolledValue;
    
	/**
	 * The instance of SecureRandom for random value
	 */
    private SecureRandom random;
    
	/**
	 * The font used for the labels and text-fields, 24 pt “plain” Tahoma
	 */
    private Font font = new Font("Tahoma", Font.PLAIN, 24);

    /**
     * Constructor to initialize the SecureRandom instance.
     */
    public Dice() {
        random = new SecureRandom();
    }

    /**
     * Create and display the GUI.
     */
    @Override
    public void run() {
    	
		/**
		 * Create a new frame with specified title, default close operation 
		 * and grid layout(3, 1)
		 */
        JFrame frame = new JFrame("Electric Die");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));

		/**
		 * Create and set up text field and label for input sides of dice
		 */
        sidesInput = new JTextField();
        sidesInput.setFont(font);
        sidesInput.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel sidesLabel = new JLabel("# of sides: ");
        sidesLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        sidesLabel.setFont(font);

		/**
		 * Create and set up text field and label for rolled value of dice
		 */
        rolledValue = new JTextField();
        rolledValue.setFont(font);
        rolledValue.setHorizontalAlignment(SwingConstants.CENTER);
        rolledValue.setEditable(false); // read-only 
        JLabel rolledLabel = new JLabel("Rolled: ");
        rolledLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        rolledLabel.setFont(font);

		/**
		 * Create and set up a button for rolling the dice
		 */
        JButton rollButton = new JButton("Roll the die");
        rollButton.setFont(font);

		/**
		 * Add components to frame
		 */
        JPanel inputPanel = new JPanel(new GridLayout(1, 2));
        inputPanel.add(sidesLabel);
        inputPanel.add(sidesInput);

        JPanel outputPanel = new JPanel(new GridLayout(1, 2));
        outputPanel.add(rolledLabel);
        outputPanel.add(rolledValue);

        frame.add(inputPanel);
        frame.add(outputPanel);
        frame.add(rollButton);

		/**
		 * Add anonymous inner classes action listeners to input sides
		 */
        sidesInput.addActionListener(new ActionListener() { 
        	
            /**
             * Validate the sides input provided by the user.
             * Display error messages if input is invalid.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int sides = Integer.parseInt(sidesInput.getText());
                    if (sides <= 0) {
                    	JOptionPane.showMessageDialog(null, "Number of sides must be greater than zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        sidesInput.setText("");
                    }
                } catch (NumberFormatException f) {
                	JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the number of sides.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    sidesInput.setText("");
                }
            }
        });

		/**
		 * Add anonymous inner classes action listeners to roll button
		 */
        rollButton.addActionListener(new ActionListener() {
        	
            /**
             * Simulate rolling the die and display the result.
             * Generates a random value between 1 and the specified number of sides.
             * Display error messages if input is invalid.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int sides = Integer.parseInt(sidesInput.getText());
                    if (sides > 0) {
                        int roll = random.nextInt(sides) + 1;
                        rolledValue.setText(String.valueOf(roll));
                    } else {
                    	JOptionPane.showMessageDialog(null, "Number of sides must be greater than zero.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException f) {
                	JOptionPane.showMessageDialog(null, "Please enter a valid numeric value for the number of sides.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

		/**
		 * Layout components with their preferred size and make the frame visible
		 */
        frame.pack();
        frame.setVisible(true);
    }
}
