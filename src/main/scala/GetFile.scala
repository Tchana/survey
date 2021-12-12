import collection.convert.ImplicitConversions._
import java.io.File

import org.apache.poi.ss.usermodel.{DataFormatter, Row, Sheet, Workbook, WorkbookFactory}

class GetFile {
  val filename = new File(  "C:/Users/valdo/Downloads/Compressed/survey/src/main/resources/surveyfile.xlsx")
  val workbook: Workbook = WorkbookFactory.create(filename)
  val sheet: Sheet = workbook.getSheetAt(0)

  def returnSheet(): Sheet = sheet
}
