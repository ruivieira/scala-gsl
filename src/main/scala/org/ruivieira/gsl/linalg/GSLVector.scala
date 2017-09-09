package org.ruivieira.gsl.linalg

import org.ruivieira.gsl.bindings.VectorBindings
import org.ruivieira.gsl.bindings.VectorBindings.Gsl_vector

import scala.scalanative.native.{CDouble, CSize, Ptr}

class GSLVector(val size : Int) {

  private val pointer : Ptr[Gsl_vector] = VectorBindings.gsl_vector_calloc(size)

  def apply(i: Int) : Double = VectorBindings.gsl_vector_get(pointer, i)
  def update(i: Int, value: Double) : Unit = VectorBindings.gsl_vector_set(pointer, i, value)

  override def toString: String = {
    (0 until size).map(i => apply(i)).mkString(", ")
  }

}
