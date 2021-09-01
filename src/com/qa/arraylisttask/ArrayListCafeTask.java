package com.qa.arraylisttask;

import java.util.ArrayList;

public class ArrayListCafeTask {

	public static void main(String[] args) {
		
		ArrayList<String> ordersList = new ArrayList<>();

		ArrayList<String> doneOrdersList = new ArrayList<>();
		
		ordersList.add("Small espresso w/ chocolate");
		ordersList.add("Large Cold Brew w/ double shot");
		ordersList.add("Medium Cappucino w/ oat milk");
		ordersList.add("Medium Flat White");
		ordersList.add("Large Choc Cookie Frappe w/ sugar free syrup");
		ordersList.add("Small Caramel Iced Latte w/ honeycomb dust");
		ordersList.add("Small Americano");
		ordersList.add("Large cafe au lait w extra milk");
		ordersList.add("Medium Strawberry Iced Tea");
		
		addOrder("Large caramel frappe", ordersList);
		System.out.println(ordersList);
		
		getOrder(9, ordersList);
		System.out.println(getOrder(9, ordersList));
		
		modifyOrder(0, "Small espresso w/ caramel", ordersList);
		System.out.println(ordersList);
		
		removeOrder(1, ordersList, doneOrdersList);
		System.out.println(ordersList);
		System.out.println(doneOrdersList);
		
		lengthArrays(ordersList, doneOrdersList);
		
		clearArray(ordersList, doneOrdersList, false, false);
		System.out.println(ordersList);
		System.out.println(doneOrdersList);
	}

//	Array Lists Exercise:
//		You're working as a software dev for a well known coffee QABucks
//		You've got a list of orders and you need to have the following methods implemented
//		to manage the orders:
//
//		2x array lists
//		- OrdersArray
//		- DoneOrdersArray
//
//		All methods you should be able to pass in data
//
//		- Add a new order to the orders array
//		- Return the name of the order
//		- Modify the order (passing in a string)
//		- Remove the order from the orders array
//		- Add the order to the doneOrders array
//		- Prints out the length of the orders and doneOrders array
//		- clears either or both of the arrays
//
//		Orders to use:
//		Small Espresso w/ Chocolate
//		Large Cold Brew w/ double shot
//		Medium Cappucino w/ Oat Milk
//		Medium Flat White
//		Large Choc Cookie Frappe w/ sugar free syrup
//		Small Caramel Iced Latte w/ honeycomb dust
//		Small Americano
//		Large Cafe Au Lait w/ extra milk
//		Medium Strawberry Iced Tea
//
//		Stretch goal - Using Multi Dimensional (Or objects if you're comfortable) split 
//		the orders into Size, drink and extras
//
//		{{"small", "espresso", "chocolate"}, {}, {}}

	

	public static void addOrder(String order, ArrayList<String> ordersList) {		
		ordersList.add(order);
	}
	
	public static String getOrder(int index, ArrayList<String> ordersList) {
		return ordersList.get(index);
	}
	
	public static void modifyOrder(int index, String order, ArrayList<String> ordersList) {
		ordersList.set(index, order);	
	}
	
	public static void removeOrder(int index, ArrayList<String> ordersList, ArrayList<String> doneOrdersList) {
		addDone(ordersList.get(index), doneOrdersList);
		ordersList.remove(index);
		
	}
	
	public static void addDone(String order, ArrayList<String> doneOrdersList) {
		doneOrdersList.add(order);
	}
	
	public static void lengthArrays(ArrayList<String> ordersList, ArrayList<String> doneOrdersList) {
		System.out.println(ordersList.size());
		System.out.println(doneOrdersList.size());
	}
	
	public static void clearArray(ArrayList<String> ordersList, ArrayList<String> doneOrdersList, boolean clearBoth, boolean clearDoneOrder) {
		if (clearBoth) {
			doneOrdersList.clear();
			ordersList.clear();
		} else if (clearDoneOrder) {
			doneOrdersList.clear();
		} else {
			ordersList.clear();
		}
				
	}
}