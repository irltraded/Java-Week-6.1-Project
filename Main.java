class Main {
  public static void main(String[] args) {
    Order book = new Order(9348583458.99,true,"Express", "ship50");
    book.ship();
    System.out.println(book.calculateShipping());
  }
}

/*
Conditional statements check a boolean condition and run a block of code depending on the condition.

We represent this kind of decision-making in our program usng conditional or control flow statements. Before this point, our code runs line-by-line from the top down, but conditional statements allow us to be selective in whcih protions will run.

If the conidtion is true, then the block is run

If the condition is false, then the block does not run.


if (true) {
  System.out.println("Hello World!");
}
*/

//If-Then statements

/*
The if-then statement is the most simple control flow we can write. It tests an expression for truth and executes some code based on it.

  The if keyword marks the beginning of the conditional statement, followed by parenthesis ().abstract

  The parenthesis hold a boolean datatype. 

For the condition in parenthesis we can also use variables that reference a boolean, or comparisons that evaluate to a boolean. 

boolean isValidPassword = true;

if (isValidPassword) {
  System.out.println("password accepted");
}

if a conditional is brief we can omit the curly braces entirely

if (isValidPassword) System.out.println("Password accepted!");
*/

//If-Then-Else
/*
We can create an alternate conditional branch with the else keyword:


if (hasPrerequisite) {
  //enroll in course
} else {
  //Enroll in prerequisite
}

This code is calle an if-then-else statement:

  If condition is true, then do something
  Else, do a different thing.
*/

/*We can create a conditional statement that now has multiple conditions that are evaluated from the top down:

This chained conditional statement hsa two conditions that evelatue true. Because testScore >= 70 comes before testScore >= 60, only the earlier code block is run. */