
/**
 * File name: DiceTest.java
 * Author: SHOUJUN ZHAO
 * Course: CST8284-section313
 * Term: Spring2024
 * Assignment: Assignment 3
 * Date: July 19
 * Purpose: Create a Dice Test class to launch the swing application using SwingUtilities.invokeLater()
 */

package zhao.shoujun.assign3;

import javax.swing.SwingUtilities;

/**
 *@author SHOUJUN ZHAO
 *@version 1.0, July 2024
 *@since javac 17.0.10
 *
 * Create a Dice Test class to launch the swing application using SwingUtilities.invokeLater()
 */
public class DiceTest {

	/**
	 * This is the entry point for the application.
	 * @param args command line arguments.
	 */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Dice());
    }
}
