/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
/*
 * main program
 */
	public void run() {
			movetoPaper() ;
			pickPaper() ;
			movetoStart() ;
		}
	
/*
 * karel goes to the paper
 * preconditon: karel is on the third avenue and fourth street facing east
 * postcondition: karel is on the sixth avenue and third street facing east
 */
	private void movetoPaper() {
		move() ;
		move() ;
		turnRight() ;
		move() ;
		turnLeft() ;
		move() ;
	}
	
	/*
	 *karel picks up the "newspaper"
	 * precondition: beeper is on the sixth avenue and third street
	 * postcondition: beeper is karel's bag
	 */
	private void pickPaper() {
		pickBeeper() ;
	}
	
	/*
	 * karel moves to their original starting point
	 * postcondition: karel is on the third avenue and fourth street facing north
	 */
	private void movetoStart() {
		turnAround() ;
		move() ;
		move() ;
		move() ;
		turnRight() ;
		move() ;
	}
	
}
