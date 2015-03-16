package org.vegan.factory;

import java.util.HashMap;
import java.util.Map;

import org.vegan.pizza.ChicagoPizza;
import org.vegan.pizza.NewYorkPizza;
import org.vegan.pizza.Pizza;



/**
 * Creates the Pizza Factory, which is an example of the Factory Method 
 * design pattern.
 * 
 * @author egan
 *
 */
public class PizzaFactory {

	private Map<String, Pizza> pizzaFactoryMap;

	/**
	 * Initializes the pizzaFactoryMap HashMap.
	 */
	public PizzaFactory() {

		//Instead of using and if/else statement, use a map.
		this.pizzaFactoryMap = new HashMap<String, Pizza>();

		this.pizzaFactoryMap.put("New York", new NewYorkPizza());
		this.pizzaFactoryMap.put("Chicago", new ChicagoPizza());

	}

	/**
	 * Factory method that returns a type of pizza.
	 * @author egan
	 * 
	 * @param pizzaName
	 * @return the proper implementation of the Pizza interface.
	 */
	public Pizza createPizza(String pizzaName){
		return this.getPizzaFactoryMap().get(pizzaName);
	}

	public Map<String, Pizza> getPizzaFactoryMap() {
		return pizzaFactoryMap;
	}

	/**
	 * Main method that begins the execution of the application.
	 * @param args
	 */
	public static void main(String[] args) {

		createThePizza();
	}

	/**
	 * Workflow method that executes the Pizza Factory
	 * @author egan
	 */
	public static void createThePizza() {
		PizzaFactory factory = new PizzaFactory();

		Pizza pizza = factory.createPizza("Chicago");

		pizza.pizzaName();
	}

}
