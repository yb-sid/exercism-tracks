package com.ybsid.exercism.easy


/**
 * https://exercism.org/tracks/scala/exercises/leap
 */
object Leap {
  def leapYear(year: Int): Boolean = {
    val mod4 = year%4==0
    val rem  = year%100!=0 ||  year%400 == 0
    mod4 &&  rem
  }
}
