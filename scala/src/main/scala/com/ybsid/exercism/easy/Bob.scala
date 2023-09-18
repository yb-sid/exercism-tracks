package com.ybsid.exercism.easy

/**
 * https://exercism.org/tracks/scala/exercises/bob
 */
object Bob {
  def response(statement: String): String = {
    val trimmed = statement.trim
    val res = (trimmed) match {
      case s if trimmed.isEmpty => "Fine. Be that way!"
      case s if isYell(trimmed) && isQuestion(trimmed) => "Calm down, I know what I'm doing!"
      case s if isYell(trimmed) => "Whoa, chill out!"
      case s if isQuestion(trimmed) => "Sure."
      case _ => "Whatever."
    }
    res
  }


  def isYell(state : String) = {
    state==state.toUpperCase() && hasLetters(state)
  }

  def isQuestion(state:String) = {
    state.endsWith("?")
  }

  def hasLetters(statement: String): Boolean = statement.exists( (('a' to 'z') ++ ('A' to 'Z')).toSet.contains(_) )

}