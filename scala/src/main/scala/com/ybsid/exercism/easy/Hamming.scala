package com.ybsid.exercism.easy

/**
 * https://exercism.org/tracks/scala/exercises/hamming
 */
object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = {
    if(dnaStrandOne.length != dnaStrandTwo.length)
      return None


    Some( dnaStrandOne.zip(dnaStrandTwo).count(pair => pair._1!=pair._2))
  }
}