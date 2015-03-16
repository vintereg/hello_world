/**
 * 
 */
package org.vegan.factory;

import org.vegan.pizza.Pizza;

/**
 * Creates the New York Pizza.
 * @author egan
 *
 */
public class NewYorkPizza implements Pizza {

	/* (non-Javadoc)
	 * @see org.vegan.Pizza#pizzaName()
	 */
	@Override
	public void pizzaName() {
		System.out.println("New York Pizza");

	}

}
