name := "temporal-util"

organization := "com.logicstack.util"

version := "0.0.8-SNAPSHOT"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  // testing
  "org.specs2" %% "specs2-core" % "4.0.3" % "test"
)

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.defaultLocal,
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)
