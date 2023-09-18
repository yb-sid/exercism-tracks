package com.ybsid.exercism.medium

/**
 * https://exercism.org/tracks/scala/exercises/armstrong-numbers
 */
object ArmstrongNumbers {

  def isArmstrongNumber(num : Int) : Boolean = {
    val digits = num.toString
    val numDigits = digits.length
    val powerSum = digits.map(_.asDigit)
      .map(d => scala.math.pow(d,numDigits).toInt)
      .sum

    num==powerSum
  }

}
