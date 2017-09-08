package org.ruivieira.gsl.distributions

import org.ruivieira.gsl.bindings.DistributionBindings

import scala.scalanative.native.UInt

object Poisson {

  def sample(mu: Double): UInt = {
    DistributionBindings.gsl_ran_poisson(Distributions.RNG, mu)
  }

  def sample(n: Int, mu: Double): Seq[UInt] = {
    (0 until n).map(_ => sample(mu))
  }


}


class Poisson(val mu : Double) extends DiscreteUnivariateDistribution {

  override def sample : UInt = Poisson.sample(mu)

  def sample(n: Int): Seq[UInt] = Poisson.sample(n, mu)
}
