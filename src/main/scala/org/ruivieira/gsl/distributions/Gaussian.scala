package org.ruivieira.gsl.distributions

import org.ruivieira.gsl.DistributionBindings

/**
  * Created by rcardoso on 24/06/2017.
  */
object Gaussian {

  def sample(mean: Double, std: Double): Double = {
    DistributionBindings.gsl_ran_gaussian(Distributions.RNG, std) + mean
  }

  def sample(n: Int, mean: Double, std: Double): Seq[Double] = {
    (0 until n).map(_ => sample(mean, std))
  }

}

class Gaussian(val mean: Double, val std: Double) {

  def sample: Double = Gaussian.sample(mean, std)

  def sample(n: Int): Seq[Double] = Gaussian.sample(n, mean, std)

}