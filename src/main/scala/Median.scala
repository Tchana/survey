class Median {
  def median(list: List[Int]) : Float = {
    val medianValue = list.sorted apply(list.size/2)
    println("Median: " + medianValue)
    medianValue
  }
}
