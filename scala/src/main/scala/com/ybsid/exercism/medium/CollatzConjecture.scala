package com.ybsid.exercism.medium


/**
 * https://exercism.org/tracks/scala/exercises/collatz-conjecture
 */

import scala.language.implicitConversions
object CollatzConjecture {

  def steps(n : Int):  Option[Int] = {
    Option(n).filter(_ > 0).map(collatzLazyList(_).takeWhile(_!=1).length)

  }

  private def collatzLazyList(n : Int ) : LazyList[Int] = {
    LazyList.iterate(n)(n=> if (n%2==0) n/2 else (n*3)+1)
  }

}
