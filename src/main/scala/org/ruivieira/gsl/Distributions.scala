package org.ruivieira.gsl

import org.ruivieira.gsl.DistributionBindings.{gsl_rng_alloc, gsl_rng_env_setup}

/**
  * Created by rcardoso on 24/06/2017.
  */
object Distributions {
  val RNG = gsl_rng_alloc(gsl_rng_env_setup)
}
