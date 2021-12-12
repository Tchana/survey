class Range {
  def range(list: List[Int]):Int={
    val rangeValue = list.max - list.min
    println("Range: " + rangeValue)
    rangeValue
  }
}
