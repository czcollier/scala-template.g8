import sbt._
import Keys._

object Build extends sbt.Build {

  def standardSettings = Seq(
    exportJars    := true
  ) ++ Defaults.defaultSettings

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      organization      := "$organization$",
      version           := "$version$",
      scalaVersion      := "$scala_version$",
      scalacOptions     := Seq("-deprecation", "-encoding", "utf8"),
      javaOptions       := Seq("-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"),
      //resolvers         ++= Seq(Repositories.bhThirdParty, Repositories.bhBullhorn),
      publishMavenStyle := false,
      //publishTo         := Some(Repositories.bhBullhorn),
      libraryDependencies ++= Seq(
        "org.slf4j" % "slf4j-log4j12" % "1.5.6"
      )))
}
