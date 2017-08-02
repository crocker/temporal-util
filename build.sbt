lazy val commonSettings = Seq(
  name := "temporal-util",
  organization := "com.logicstack.util",
  version := "0.0.4-SNAPSHOT",
  scalaVersion := "2.11.11"
)

lazy val root = (project in file("."))
  .enablePlugins(ConfigurationPlugin)
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      //testing
      "org.specs2" %% "specs2-core" % "3.7.2" % "test"
    )
  )