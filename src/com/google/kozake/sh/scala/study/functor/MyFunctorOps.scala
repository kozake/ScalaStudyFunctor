package com.google.kozake.sh.scala.study.functor

final class MyFunctorOps[F[_],A](val self: F[A])(implicit val F: MyFunctor[F]) {

  def myMap[B](f: A => B): F[B] = F.myMap(self)(f)
}
