package com.google.kozake.sh.scala.study.implicits

object ImplicitDefines {

  implicit class ToFunctorList[A](l: List[A]) {
    def myMap[B](f: A => B) = l.map(f)
  }
}
