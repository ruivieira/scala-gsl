package org.ruivieira.gsl

import scala.scalanative.native
import scala.scalanative.native._

@link("gsl")
@extern
object StatisticsBindings {

  def gsl_stats_mean(data : Ptr[Double], stride : native.CSize, n : native.CSize) : Double = extern

  def gsl_stats_variance (data : Ptr[Double], stride : native.CSize, n : native.CSize) : Double = extern

  def gsl_stats_sd(data: Ptr[Double], stride : native.CSize, n: native.CSize) : Double = extern

  def gsl_stats_tss(data: Ptr[Double], stride : native.CSize, n: native.CSize) : Double = extern

}
