name := "survey"

version := "0.1"

scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "scala-tool",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
  "org.apache.poi" % "poi" % "5.0.0",
  "org.apache.poi" % "poi-ooxml" % "5.0.0",
  "io.spray" %% "spray-json" % "1.3.5",
  "com.github.scopt" %% "scopt" % "3.7.1",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.slf4j" % "slf4j-api" % "1.7.10",
  "org.apache.pdfbox" % "pdfbox" % "2.0.1",
  "org.apache.pdfbox" % "fontbox" % "2.0.1",
)