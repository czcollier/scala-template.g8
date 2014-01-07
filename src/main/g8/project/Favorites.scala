import sbt._

object Favorites {
  object Repositories {
    val typesafe        = "Typesafe repo"         at "http://repo.typesafe.com/typesafe/releases"
    val scalaTools      = "Scala Tools Releases"  at "https://oss.sonatype.org/content/groups/scala-tools"
    val scalaToolsSnaps = "Scala Tools Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
    val spray           = "spray repo"            at "http://repo.spray.io"
    val sprayNightlies  = "spray nightlies"       at "http://nightlies.spray.io"
    val novus           = "Novus Releases"        at "http://repo.novus.com/releases"

    val bhThirdParty = Resolver.file("thirdparty",
      file("/home/ccollier/devel/bullhorn/gitsrc/core-services-ivy/ivylib")) (Patterns(
      Seq("ivy/ivy-[module]-[revision].[ext]"),
      Seq("[artifact]-[revision].[ext]"), isMavenCompatible = false))

    val bhBullhorn = Resolver.file("bullhorn",
      file("/home/ccollier/devel/bullhorn/bh-libs")) (Patterns(
      Seq("[organization]/[module]/[revision]/ivys/ivy-[revision].[ext]"),
      Seq("[organization]/[module]/[revision]/[type]s/[artifact]-[revision].[ext]"), isMavenCompatible = false))
  }

  object Versions {
    val akka          = "2.2.0"
    val casbah        = "2.4.1"
    val dispatch      = "0.9.2"
    val guava         = "14.0.1"
    val jodaTime      = "1.6"
    val lift          = "2.4"
    val logback       = "1.0.7"
    val reactiveMongo = "0.9"
    val rogue         = "1.1.8"
    val salat         = "1.9.2-SNAPSHOT"
    val scalaTest     = "2.0"
    val slf4j         = "1.6.4"
    val specs2        = "1.14"
    //spray 1.2-Mx are not compatible with Akka 2.2.0
    //need to use a nightly build for now.
    val spray         = "1.2-20130822"
    val sprayJson     = "1.2.5"
    val squeryl       = "0.9.5-2"
  }

  object Libraries {
    // akka 
    val akkaActor       = "com.typesafe.akka"         %% "akka-actor"          % Versions.akka          % "compile"
    val akkaSlf4j       = "com.typesafe.akka"         %% "akka-slf4j"          % Versions.akka
    val akkaRemote      = "com.typesafe.akka"         %% "akka-remote"         % Versions.akka

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

    // HTTP (async)
    val dispatch        = "net.databinder.dispatch"   %% "dispatch-core"       % Versions.dispatch      % "compile"

    // misc
    val jodaTime        = "joda-time"                 %  "joda-time"           % Versions.jodaTime      % "compile"
    val guava           = "com.google.guava"          % "guava"                % Versions.guava

    //logging
    val slf4j           = "org.slf4j"                 %  "slf4j-api"           % Versions.slf4j
    val logback         = "ch.qos.logback"            %  "logback-classic"     % Versions.logback
    
    // bullhorn
    val bhEntity        = "com.bullhorn"              %  "entity"              % "0.1"                 % "compile"
    val bhDaytona       = "com.bullhorn"              %  "daytona"             % "0.1"                 % "compile"
    val bhDataService   = "com.bullhorn"              %  "data-service"        % "2.5"                 % "compile"
    val bhStaffing      = "com.bullhorn"              %  "staffing"            % "0.1"                 % "compile"
    val bhRest          = "com.bullhorn"              %  "rest"                % "0.1"                 % "compile"

    // testing
    val akkaTestKit     = "com.typesafe.akka"         %% "akka-testkit"        % Versions.akka          % "test"
    val scalaTest       = "org.scalatest"             %% "scalatest"           % Versions.scalaTest     % "test"
    val specs2          = "org.specs2"                %% "specs2"              % Versions.specs2        % "test"
    val sprayTest       = "io.spray"                  %  "spray-testkit"       % Versions.spray         % "test"
  }
}
