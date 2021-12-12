class StandardDeviation {
  def standardDeviation(variance: Float):Float={
    val stdDevValue = math.sqrt(variance).toFloat
    println("Standard Deviation: " + stdDevValue)
    stdDevValue
  }
}
