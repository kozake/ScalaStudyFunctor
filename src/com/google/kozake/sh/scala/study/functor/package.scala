package com.google.kozake.sh.scala.study

package object functor {

  implicit def toMyFunctorOps[F[_], A](fa: F[A])(implicit F: MyFunctor[F]) =
    new MyFunctorOps[F, A](fa)

  implicit val optionMyFunctor = new MyFunctor[Option] {
    override def myMap[A, B](fa: Option[A])(f: A => B): Option[B] = fa.map(f)
  }

  implicit val listMyFunctor = new MyFunctor[List] {
    override def myMap[A, B](fa: List[A])(f: A => B): List[B] = fa.map(f)
  }
}
