package com.ybsid.exercism.easy

import scala.jdk.CollectionConverters.*

/**
 * https://exercism.org/tracks/scala/exercises/accumulate
 */
class Accumulate {
  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] = {
    for item <- list yield f(item)
  }
}