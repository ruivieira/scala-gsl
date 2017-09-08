package org.ruivieira.gsl.distributions

import scala.scalanative.native.UInt

/**
  * Created by rcardoso on 25/06/2017.
  */
trait DiscreteUnivariateDistribution {

  def sample : UInt

}
