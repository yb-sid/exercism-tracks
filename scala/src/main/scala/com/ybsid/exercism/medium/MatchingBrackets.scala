package com.ybsid.exercism.medium

import scala.collection.mutable
import scala.collection.mutable.Stack

/**
 * https://exercism.org/tracks/scala/exercises/matching-brackets
 */
object MatchingBrackets {
  def isPaired(brackets: String): Boolean = {
    val stack = mutable.Stack[Char]()
    var flag = true
    for(char : Char <- brackets.filter(char => "(){}[]".toSet.contains(char)).toCharArray){
      char match{
        case '(' | '{' | '[' => stack.push(char)
        case ')' => if (stack.isEmpty || stack.pop != '(') flag = false
        case '}' => if (stack.isEmpty || stack.pop != '{') flag = false
        case ']' => if (stack.isEmpty || stack.pop != '[') flag = false
      }
    }
    stack.isEmpty && flag
  }
}