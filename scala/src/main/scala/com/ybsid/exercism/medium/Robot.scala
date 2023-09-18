package com.ybsid.exercism.medium

import scala.collection.mutable
import scala.util.Random


/**
 * https://exercism.org/tracks/scala/exercises/robot-name
 */
object MemoSet{
  val memo  = mutable.HashSet.empty[String]
}

class Robot {
  var memo  = MemoSet.memo
  var returnName : String = ""
  private def genName() = {
    Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase.concat(
    Random.alphanumeric.filter(_.isDigit).take(3).mkString)
  }
  def name : String = {
    if(returnName.nonEmpty)
      return returnName

    var name = genName()
    while (memo.contains(name)){
      name = genName()
    }
    memo += name
    this.returnName = name
    returnName


  }

  def reset() = {
    this.returnName = ""
    memo = mutable.HashSet.empty[String]
  }

}
