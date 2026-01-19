package Day12;

public class PolymorphismEncapsulationOverloadingNotes {

	public static void main(String[] args) {
		
/*

-------------------polymorphism concept----------------------------


polymorphism--->one thing can have many forms.

We can achive polymorphism through overloading.

void m1();
void m1();
void m1();

4 rules are applicable--

1.Method name should be same.
2.number of parameters should be different.
3.Data type of parameter should be different.
4.Order of parameter should be different.


Method Overloading--->

* "Method Overloading in Java means having multiple methods with the same name 
   but different parameters inside the same class".	
   
* It helps to perform similar tasks in different ways, depending on the input.	
	
* It is an example of Compile-Time Polymorphism, because the decision of which method 
  to call is made at compile time.

* Parameters can differ by type, number, or order, but we do not consider return type in overloading.
 
For example-->
  we can have an add() method that adds two integers, or another add() that adds three integers,
  or even one that adds two doubles."   	
	
	
	
Constructor Overloading--->

* "Constructor Overloading in Java means having multiple constructors in the same class, 
   but with different parameter lists (just like method overloading).
   
* It allows us to create objects in different ways, depending on what information we have at 
  the time of object creation. 
  
* Since constructors don’t have a return type and share the class name, the only way to overload them is by changing 
  the number or type of parameters.
  
* It’s an example of Compile-Time Polymorphism.      	
	
	
	
	
------------------Encapsulation------------------------------------------------>

Wrapping up data(variables) and methods into single unit (class).

	1.All variables should be private.
	2.For every variable there should be 2 methods (get & set).
	3.Variables can be operated through methods.

🔹 Definition:
       Encapsulation is the process of wrapping data (variables) and code (methods) together as a single unit.
       In Java, this means hiding the internal details of a class and only exposing 
       necessary parts using getters and setters.	
	
🔹 Why use it?
      To protect data from unauthorized access or modification.
      To control how data is accessed or changed.
      Makes the code more secure and maintainable.	
      
🔹 How to achieve Encapsulation?
      Declare variables as private.
      Provide public getter and setter methods to access and update the values.
      	
      
🔹 1-minute ready-to-speak interview answer for Encapsulation in Java  

  *Encapsulation is one of the core concepts of Object-Oriented Programming.
  
  *It refers to the process of wrapping data and methods into a single unit, usually a class, 
   and restricting direct access to the internal variables.
   
  *In Java, we achieve encapsulation by declaring variables as private and using public getter 
   and setter methods to access and update them.
   
  *Encapsulation is also known as data hiding. 
  
  
  
 Note :-
 
Q. Can we overload main method?

A. Yes we can overload
  
  
  
	
 */
		
		
		

	}

}
