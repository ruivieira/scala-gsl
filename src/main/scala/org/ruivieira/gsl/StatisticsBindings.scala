package org.ruivieira.gsl

import scala.scalanative.native
import scala.scalanative.native._

@link("gsl")
@extern
object StatisticsBindings {


  @name("gsl_stats_mean")
  def gsl_stats_mean(data : Array[native.CDouble], stride : native.CSize, n : native.CSize) : Double = extern

}
