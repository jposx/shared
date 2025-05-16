# Item Heirarchy

 - Order.java - Is the main order object, per order all infrmation will be stored in this class
 - OrderItem.java - An abstract class which contains information about all items in the order, e.g. coke, cheeseburger meal etc
 - Item.java - Extends orderItem, is an individual item in the order. e.g. single cheeseburger, single coke, can contain size, e.g. large coke
 - Meal.java - Extends orderItem, is a meal, a combination of Items with a discount
