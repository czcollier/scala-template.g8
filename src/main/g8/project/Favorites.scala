import sbt._
//import Keys._
//import cc.spray.revolver.RevolverPlugin._

object Favorites {
  object Repositories {
    val typesafe        = "Typesafe repo"         at "http://repo.typesafe.com/typesafe/releases"
    val scalaTools      = "Scala Tools Releases"  at "https://oss.sonatype.org/content/groups/scala-tools"
    val scalaToolsSnaps = "Scala Tools Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
    val spray           = "spray repo"            at "http://repo.spray.io"
    val novus           = "Novus Releases"        at "http://repo.novus.com/releases"
  }

  object Versions {
    val akka          = "2.1.0"
    val casbah        = "2.4.1"
    val dispatch      = "0.9.2"
    val jodaTime      = "1.6"
    val lift          = "2.4"
    val logback       = "1.0.0"
    val reactiveMongo = "0.9"
    val rogue         = "1.1.8"
    val salat         = "1.9.2-SNAPSHOT"
    val slf4j         = "1.6.4"
    val specs2        = "1.14"
    val spray         = "1.1-M7"
    val sprayJson     = "1.2.3"
    val squeryl       = "0.9.5-2"
  }

  object Libraries {
    // akka 
    val akkaActor       = "com.typesafe.akka"         %% "akka-actor"          % Versions.akka          % "compile"
    val akkaSlf4j       = "com.typesafe.akka"         %  "akka-slf4j"          % Versions.akka

    // spray
    val sprayCan        = "io.spray"                  %  "spray-can"           % Versions.spray         % "compile"
    val sprayRouting    = "io.spray"                  %  "spray-routing"       % Versions.spray         % "compile"
    val sprayJson       = "io.spray"                  %% "spray-json"          % Versions.sprayJson     % "compile"
    // MongoDB access
    val casbah          = "org.mongodb"               %% "casbah"              % Versions.casbah        % "compile"
    val liftMongo       = "net.liftweb"               %% "lift-mongodb"        % Versions.lift          % "compile"
    val liftMongoRecord = "net.liftweb"               %% "lift-mongodb-record" % Versions.lift          % "compile"
    val liftJson        = "net.liftweb"               %% "lift-json"           % Versions.lift          % "compile"
    val rogue           = "com.foursquare"            %% "rogue"               % Versions.rogue         % "compile" intransitive()
    val salat           = "com.novus"                 %% "salat"               % Versions.salat         % "compile"
    val reactiveMongo   = "org.reactivemongo"         %% "reactivemongo"       % Versions.reactiveMongo % "compile"

    // RDBMS access
    val squeryl         = "org.squeryl"               %% "squeryl"             % Versions.squeryl       % "compile"

    val dispatch        = "net.databinder.dispatch"   %% "dispatch-core"       % Versions.dispatch      % "compile"

    // misc
    val jodaTime        = "joda-time"                 %  "joda-time"           % Versions.jodaTime      % "compile"
    val slf4j           = "org.slf4j"                 %  "slf4j-api"           % Versions.slf4j
    val logback         = "ch.qos.logback"            %  "logback-classic"     % Versions.logback
   
    // testing
    val specs2          = "org.specs2"                %% "specs2"              % Versions.specs2        % "test"
    val sprayTest       = "io.spray"                  %  "spray-testkit"       % Versions.spray         % "test"
  }
}
