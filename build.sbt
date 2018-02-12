name := "temporal-util"

organization := "com.logicstack.util"

version := "0.0.6"

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
  "Artifactory" at s"${artifactory}/lib-local/"
)

publishTo := {
  if (isSnapshot.value) {
    Some("Artifactory Realm" at s"${artifactory}/lib-local;build.timestamp=" + new java.util.Date().getTime)
  }
  else {
    Some("Artifactory Realm" at s"${artifactory}/lib-local")
  }
}

credentials += Credentials("Artifactory Realm", "logicstack.jfrog.io", "admin", "AP7GNvG4SqsADXdfxo3yGg9bTDy")