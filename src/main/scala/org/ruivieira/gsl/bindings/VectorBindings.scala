package org.ruivieira.gsl.bindings

import org.ruivieira.gsl.bindings.DistributionBindings.{Gsl_rng, Gsl_rng_type}

import scala.scalanative.native
import scala.scalanative.native.{Ptr, UInt, extern, link}
import scala.scalanative.runtime.struct

/**
  * Created by rcardoso on 24/06/2017.
  */
@link("gsl")
@extern
object VectorBindings {


  @struct class Gsl_block(
                         size: UInt,
                         data: Ptr[native.CDouble]
                       )


  @struct class Gsl_vector(
                              size: UInt,
                              stride: UInt,
                              data: Ptr[native.CDouble],
                              block: Ptr[Gsl_block],
                              owner: native.CInt
                            )

  def gsl_vector_calloc(n: Int): Ptr[Gsl_vector] = extern
  def gsl_vector_get(v : Ptr[Gsl_vector], i : Int) : Double = extern
  def gsl_vector_set(v : Ptr[Gsl_vector], i : Int, x : Double) : Unit = extern


}
