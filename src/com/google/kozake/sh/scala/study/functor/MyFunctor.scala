package com.google.kozake.sh.scala.study.functor

trait MyFunctor[F[_]] { self =>

  def myMap[A, B](fa: F[A])(f: A => B): F[B]
}

object MyFunctor {
  def apply[F[_]](implicit F: MyFunctor[F]): MyFunctor[F] = F
}
