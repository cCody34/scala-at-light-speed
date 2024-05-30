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

}
