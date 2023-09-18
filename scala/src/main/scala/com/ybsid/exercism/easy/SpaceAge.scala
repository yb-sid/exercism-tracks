package com.ybsid.exercism.easy

/**
 * https://exercism.org/tracks/scala/exercises/space-age
 */
object SpaceAge {
  private val toYearSeconds = 31556952
  def onEarth(age: Double): Double = {
    val period = 1.0
    (age/toYearSeconds) / period
  }
  def onVenus(age: Double): Double = {
    val period = 0.61519726
    onEarth(age) / period
  }
  def onMercury(age: Double): Double = {
    val period = 0.2408467
    onEarth(age) / period
  }
  def onMars(age: Double): Double = {
    val period = 1.8808185
    onEarth(age) / period
  }
  def onJupiter(age: Double): Double = {
    val period = 11.862615
    onEarth(age) / period
  }
  def onSaturn(age: Double): Double = {
    val period = 29.447498
    onEarth(age) / period
  }
  def onUranus(age: Double): Double = {
    val period = 84.016846
    onEarth(age) / period
  }
  def onNeptune(age: Double): Double = {
    val period = 164.79132
    onEarth(age) / period
  }
}


