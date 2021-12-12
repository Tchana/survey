class Mode (var values: List[Int]) {
  def mode:Int = {
    println("Mode: " + (values.sortWith(_ > _) apply (0)).toString)
    (values.sortWith(_ > _) apply (0))
  }
}
