name in ThisBuild := "moviez"

version in ThisBuild := "0.0.1"

scalaVersion in ThisBuild := "2.12.8"

scalacOptions in ThisBuild ++= Seq(
  "-encoding", "utf8",
  "-deprecation",
  "-feature",
  "-language:postfixOps"
)

triggeredMessage in ThisBuild := Watched.clearWhenTriggered

def fancyPrompt(projectName: String): String =
  s"""
     |
     |[info] Welcome to the ${cyan(projectName)} project!
     |sbt> """.stripMargin

def cyan(projectName: String): String = scala.Console.CYAN + projectName + scala.Console.RESET

shellPrompt := (_ => fancyPrompt(name.value))

SettingKey[Option[File]]("ide-output-directory") in ThisBuild := Option(file("idea"))

addCommandAlias("root", "project moviez")
addCommandAlias("cd", "project")
addCommandAlias("testc", ";clean;coverage;test;coverageReport")

resolvers in ThisBuild += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies in ThisBuild ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.pegdown" % "pegdown" % "1.6.0" % "test"
)

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-oSD"),
  Tests.Argument(TestFrameworks.ScalaTest, "-h target/test-reports")
)

coverageExcludedPackages in Test := "Main"

val akkaVersion = "2.5.20"
val akkaHttpVersion = "10.1.7"

lazy val `server` =
  project
    .in(file("./server"))
    .settings(
      shellPrompt := (_ => fancyPrompt(name.value)),
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-stream" % akkaVersion,
        "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
        "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
        "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % "test",
        "com.pauldijou" %% "jwt-spray-json" % "2.1.0"
      )
    )
    .dependsOn(`data`)

lazy val `data` = project
  .in(file("./data"))
  .settings(
    shellPrompt := (_ => fancyPrompt(name.value)),
    resolvers += Resolver.jcenterRepo,
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-persistence" % "2.5.13",
      "org.iq80.leveldb" % "leveldb" % "0.7",
      "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8",
      "org.postgresql" % "postgresql" % "42.2.2",
      "com.github.dnvriend" %% "akka-persistence-jdbc" % "3.4.0",
      "com.google.protobuf" % "protobuf-java" % "3.6.1"
    )
  )
  .dependsOn(`common`)

lazy val `common` =
  project.in(file("./common")).settings(shellPrompt := (_ => fancyPrompt(name.value)))
