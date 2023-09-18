package com.ybsid.exercism.easy

/**
 * https://exercism.org/tracks/scala/exercises/robot-simulator
 * focus on class vs case class vs object
 *
 * also use of foldLeft method
 * enums are different in scala 2 compared to java
 */
object Bearing extends Enumeration {
  type Bearing = Value
  val North, South, East, West = Value
}
import Bearing.*
import com.ybsid.exercism.medium.Robot
case class Robot(var bearing : Bearing , var coordinates : (Int, Int)) {

  def turnRight  = {
    val newBearing = (bearing) match {
      case Bearing.North => Bearing.East
      case Bearing.South => Bearing.West
      case Bearing.East => Bearing.South
      case Bearing.West => Bearing.North
    }
    this.bearing = newBearing
    this
  }

  def turnLeft = {
    val newBearing = (bearing) match {
      case Bearing.North => Bearing.West
      case Bearing.South => Bearing.East
      case Bearing.East => Bearing.North
      case Bearing.West => Bearing.South
    }
    this.bearing = newBearing
    this
  }

  def advance  = {
    val newCoordinates = (bearing) match {
      case Bearing.North => (coordinates._1 , coordinates._2+1)
      case Bearing.South => (coordinates._1 , coordinates._2-1)
      case Bearing.East => (coordinates._1+1 , coordinates._2)
      case Bearing.West => (coordinates._1-1, coordinates._2)
    }
    this.coordinates = newCoordinates
    this
  }

  def simulate(opSeq : String) : Robot = {
    opSeq.foldLeft(this)((accm , elem)=>
      elem match{
        case 'R' => accm.turnRight
        case 'L' => accm.turnLeft
        case 'A' => accm.advance
      }
    )
  }
}


