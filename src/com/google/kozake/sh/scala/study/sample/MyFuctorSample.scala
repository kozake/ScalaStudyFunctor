package com.google.kozake.sh.scala.study.sample

import com.google.kozake.sh.scala.study.functor._

object MyFuctorSample extends App {

  val f = MyFunctor[List]
  println(f.getClass)

  println(MyFunctor[List].myMap(List (1, 2, 3, 4, 5))(_ * 3))

  println(List (1, 2, 3, 4, 5).myMap(_ * 3))

  println(Option(1).myMap(_ * 3))
}

