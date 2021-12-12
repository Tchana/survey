import Main.sheet
import org.apache.poi.ss.usermodel.Row
import collection.convert.ImplicitConversions._
import java.io.File


class Frequency () {

  def printFrequency(values: List[Any] ) : Map[Any, Int] = {
    val frequencyMap : Map[Any, Int] = values.groupBy(l => l).map(t => (t._1, t._2.length))
    println(frequencyMap.drop(1))
    frequencyMap.drop(1)
  }

  def ageFreq() : Map[Any, Int]  = {
    val list = sheet.map(row => if (row != sheet.getRow(0)){
      val ages = Option(row.getCell(1, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL)).toString
      ages
    }).toList

    val ageFreq = new Frequency().printFrequency(list)

    println("Map of Frequencies: " + ageFreq)
    ageFreq
  }

  def listOfFreqValues() : List[Int] = {
    val listOfFreq = ageFreq().values.toList
    println("List of Frequencies: " + listOfFreq)
    listOfFreq
  }
}
