class Mean {
  def mean (list: List[Int]) : Float = {
    val sum = list.sum
    val length = list.length
    val meanValue = sum.toFloat/length.toFloat
    println("Mean: " + meanValue)
    meanValue
  }
}
