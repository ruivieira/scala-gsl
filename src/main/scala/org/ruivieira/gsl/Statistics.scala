package org.ruivieira.gsl

import org.ruivieira.gsl.StatisticsBindings._

object Statistics {

  def mean(data : Array[Double]) : Double = {
    gsl_stats_mean(data = data, stride = 1, n = data.length)
  }

}
