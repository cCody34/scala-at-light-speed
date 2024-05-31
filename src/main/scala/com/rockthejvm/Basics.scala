package com.rockthejvm


object Basics extends App {
  // defining a value
  val meaningOfLife: Int = 42
    // key word val, name of value, type, value
    // can't reassign to a val, works as const in js
  val aBoolean = false // don't always need to specify a type in scala
  // Int, Boolean, Char, Double, Float. String
  // Types in Scala are capitalised

  //Strings and string operations
  val aString = "I love Scala" // Strings are using double quotes
  val aComposedString = "I" + " " + "really" + " " + "love Scala" // Strings can be concatenated or composed
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"  // How we interpolate strings in Scala - s instead of $``

  // Values and expressions
  val anExpression = 2 + 3 // expressions are structures that can be reduced to a value
  // in Scala we don't think in terms of instructions, everything is an expression that can be reduced to a value
  // If expression
    val ifExpression = if (meaningOfLife > 43) 56 else 999
    // reduces to a single value either 56 or 999
    // in JS have the ternary operator
    // can chain if expressions in Scala
    val chainedIfExpression = {
      if (meaningOfLife > 43) 56
      else if (meaningOfLife < 0) -2
      else if (meaningOfLife > 20) 5
      else 0
      // Single expression still that reduces to a single value
    }

  // Code blocks
    // defined by opening and closing curly braces
    // can include definitions locally
    // at the end you have to return something
  val aCodeBlock = {
    val aLocalValue = 57
    // the last expression of the code block is the value of the entire block
    // so aCodeBlock automatically returns 60 here
    aLocalValue +3
  }
  // no type mentioned here - but this code block will be assigned Int because the final return value is Int type

  // Define a function
  def myFunction(x: Int, y: String): String = y + " " + x
    // defining a function, you have your arguments and their types
    // the type of the return value (in this case : String)
    // return a single expression
  def sameFunction(x: Int, y:String): String = {
    y + " " + x
  }
  // can use curly braces if the expression goes over multiple lines

  // functions are usually recursive in practice
  def factorial(n: Int): Int = {
    if (n<=1) 1
    else n * factorial(n-1)
  }
    // will return the product of all the numbers from 1 up to n
    /*
      factorial(5) = 5 * factorial(4)
      factorial(4) = 4 * factorial(3)
      factorial(3) = 3 * factorial(2)
      factorial(2) = 2 * factorial(1)
      factorial(1) = 1

      so factorial(1) = 1
      factorial(2) = 2 * 1
      factorial(3) = 3 * 2
      factorial(4) = 4 * 6
      factorial(5) = 5 * 24 = 120
    */

    // in Scala we don't use loops or iteration, we use RECURSION!
    // It has variables and loops but this is very discouraged in Scala - need to think in terms of functions and recursion


  // Unit return types
    // everything so far returned a String or an Int
    // the Unit type = no meaningful value === "void" in other languages
    printLn("I love Scala")
      // this doesn't return any meaningful value
      // we think of the Unit type in type of SIDE EFFECTS
        // relate to printing something on screen, sending something to a socket or server, storing something in a file, has nothing to do with computing meaningful information
        // every print statement will return Unit
        // console.log is an equivalent function that returns void in other languages
  def myUnitReturningFunction(): Unit = {
    printLn("I don't love returning Unit")
  }
  val theUnit = ()
}
