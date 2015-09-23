package com.google.kozake.sh.scala.study.badlogic

import com.google.kozake.sh.scala.study.functor.{MyFunctor, MyFunctorOps}

package object functor {

  implicit val listMyFunctor = new MyFunctor[List] {
    override def myMap[A, B](fa: List[A])(f: (A) => B): List[B] = {
      def myMapFunc(acc: List[B])(l: List[A])(f: A => B): List[B] = {
        l match {
          case (head :: tail) => myMapFunc(acc :+ f(head))(tail)(f)
          case _ => acc
        }
      }
      myMapFunc(Nil)(fa)(f)
    }
  }

  implicit def listMyFunctor[A](l: List[A]):MyFunctorOps[List, A] =
    new MyFunctorOps[List, A](l)
}
