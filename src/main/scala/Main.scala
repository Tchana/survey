

import org.apache.pdfbox.pdmodel.PDDocument

object Main extends App {
  println("Hello, World!")
  val sheet = new GetFile().sheet
  val document = new PDDocument
  val generatePDF = new GeneratePDF(document)
  val createPDF = generatePDF.createPDF()
  val page = generatePDF.addPage()
  val writeOnPage: Unit = generatePDF.writeOnPage()
  val frequency = new Frequency()
  val frequencyList = frequency.listOfFreqValues()
  val ageMode = new Mode(frequencyList).mode
  val mean = new Mean().mean(frequencyList)
  val median = new Median().median(frequencyList)
  val range = new Range().range(frequencyList)
  val variance = new Variance().variance(mean, frequencyList)
  val standardDeviation = new StandardDeviation().standardDeviation(variance)
}
