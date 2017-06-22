package org.ruivieira.gsl

import scala.scalanative.native.Ptr
import scala.scalanative.runtime.DoubleArray

object Arrays {

  def doubleCopy(src : Array[Double]) : Ptr[Double] = {
    // copy to intermediate buffer
    val ptr = DoubleArray.alloc(src.length)
    Array.copy(src, 0, ptr, 0, src.length)
    ptr.at(0)
  }

}
