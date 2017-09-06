name := "temporal-util"

organization := "com.logicstack.util"

version := "0.0.5-SNAPSHOT"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  //testing
  "org.specs2" %% "specs2-core" % "3.7.2" % "test"
)

// publish settings
val artifactory = "https://logicstack.jfrog.io/logicstack"

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.defaultLocal,
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  "LogicStack Releases" at s"$artifactory/libs-release-local",
  "LogicStack Snapshots" at s"$artifactory/libs-snapshot-local"
)

publishTo := {
  if (isSnapshot.value) {
    Some("snapshots" at s"$artifactory/libs-snapshot-local")
  }
  else {
    Some("releases" at s"$artifactory/libs-release-local")
  }
}

credentials += Credentials("Artifactory Realm", "logicstack.jfrog.io", "admin", "AP4ChQULGXKGUk7QEoDNPWq9nUu")
