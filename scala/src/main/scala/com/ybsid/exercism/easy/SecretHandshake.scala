package com.ybsid.exercism.easy

import scala.collection.mutable.ListBuffer

/**
 * https://exercism.org/tracks/scala/exercises/secret-handshake
 */
object SecretHandshake {

  def commands(dec : Int) : List[String] = {
    val inputList  = dec.toBinaryString.reverse.map(_.asDigit).toList
    val actions = List(
      (inputList.headOption.getOrElse(0), "wink"),
      (inputList.lift(1).getOrElse(0), "double blink"),
      (inputList.lift(2).getOrElse(0), "close your eyes"),
      (inputList.lift(3).getOrElse(0), "jump")
    ).collect { case (1, action) => action }

    if (inputList.length == 5 && inputList(4) == 1) {
      actions.reverse
    } else {
      actions
    }

  }

}
