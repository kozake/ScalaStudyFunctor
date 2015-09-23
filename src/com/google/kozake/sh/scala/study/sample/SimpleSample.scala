package com.google.kozake.sh.scala.study.sample

import com.google.kozake.sh.scala.study.implicits.ImplicitDefines._

object SimpleSample extends App {

  println(List(1, 2, 3, 4, 5).myMap(_ * 3))
}
