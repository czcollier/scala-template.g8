import sbt._
import Keys._

object Build extends sbt.Build {

  def standardSettings = Seq(
    exportJars    := true
  ) ++ Defaults.defaultSettings

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = standardSettings ++ Seq(
      organization      := "$organization$",
      version           := "$version$",
      scalaVersion      := "$scala_version$",
      scalacOptions     := Seq("-deprecation", "-encoding", "utf8"),
      javaOptions       := Seq("-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"),
      resolvers         ++= Seq(
        //Repositories.typesafe,
        //Repositories.spray,
        //Repositories.scalaToolsSnaps //for salat and reactiveMongo 0.9-SNAPSHOT
      ),
      publishMavenStyle := false,
      //publishTo         := Some(Repositories.bhBullhorn),
      libraryDependencies ++= Seq(
        Favorites.Libraries.slf4j,
        Favorites.Libraries.specs2,
        Favorites.Libraries.slf4j
      )))
}
