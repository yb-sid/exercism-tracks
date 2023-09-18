package com.ybsid.exercism.easy

class GradeSchool {
   type DB = Map[Int, Seq[String]]

   var dbMap : DB = Map()

  def add(name: String, g: Int) = {
    dbMap = dbMap + (g -> (dbMap.getOrElse(g, Seq.empty) :+ name))
  }

  def db: DB = {
    dbMap
  }

  def grade(g: Int): Seq[String] = {
    dbMap.getOrElse(g,Seq.empty[String])
  }

  def sorted: DB = {
    // scala 2
    //dbMap.view.mapValues(_.sorted).toSeq.sortBy(_._1).toMap
    // Scala 3
    val sortedKeys = dbMap.keys.toSeq.sorted
    // Sort each sequence in the map
    val sortedMap = dbMap.view.mapValues(_.sorted)
    // Create a new map with sorted keys and sorted sequences
    sortedKeys.map(key => key -> sortedMap(key)).toMap
  }
}
