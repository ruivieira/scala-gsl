package org.ruivieira.gsl

object Statistics {

  def mean(data : Array[Double]) : Double = {
    StatisticsBindings.gsl_stats_mean(Arrays.doubleCopy(data), 1, data.length)
  }

  def variance(data : Array[Double]) : Double = {
    StatisticsBindings.gsl_stats_variance(Arrays.doubleCopy(data), 1, data.length)
  }

  def sd(data: Array[Double]) : Double = {
    StatisticsBindings.gsl_stats_sd(Arrays.doubleCopy(data), 1, data.length)
  }

  def ts(data: Array[Double]) : Double = {
    StatisticsBindings.gsl_stats_tss(Arrays.doubleCopy(data), 1, data.length)
  }

}
