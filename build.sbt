name := "temporal-util"

organization := "com.logicstack.util"

version := "0.0.7"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  //testing
  "org.specs2" %% "specs2-core" % "4.0.3" % "test"
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