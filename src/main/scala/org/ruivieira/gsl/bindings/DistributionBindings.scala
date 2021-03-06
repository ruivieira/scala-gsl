package org.ruivieira.gsl.bindings

import scala.scalanative.native
import scala.scalanative.native.{Ptr, extern, link}
import scala.scalanative.runtime.struct

/**
  * Created by rcardoso on 24/06/2017.
  */
@link("gsl")
@extern
object DistributionBindings {

  @struct class Gsl_rng_type(
      name: Ptr[native.CUnsignedInt]
  )
  @struct class Gsl_rng(
      myType: Ptr[Gsl_rng_type]
  )

  def gsl_rng_alloc(t: Ptr[Gsl_rng_type]): Ptr[Gsl_rng] = extern

  def gsl_rng_env_setup: Ptr[Gsl_rng_type] = extern

  def gsl_ran_gaussian(r: Ptr[Gsl_rng], sigma: Double): Double = extern

  // Poisson distribution

  def gsl_ran_poisson (r: Ptr[Gsl_rng], mu : Double) : native.CUnsignedInt = extern

  def gsl_ran_poisson_pdf (k : Int, mu : Double) : Double = extern

}
