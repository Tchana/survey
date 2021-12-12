class Variance {
  def variance(mean: Float, list: List[Int]):Float = {
    val varianceValue = list.map(x => math.pow((x - mean), 2).toFloat).sum / (list.size - 1).toFloat
    println("Variance: " + varianceValue)
    varianceValue
  }
}
