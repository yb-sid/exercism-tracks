package com.ybsid.exercism.easy


/**
 * https://exercism.org/tracks/scala/exercises/etl
 */
object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    scoreMap.toSeq.flatMap{
      case (key,values) => values.map(value => value.toLowerCase -> key)
    }.toMap
  }
}