name := "forms"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
"org.webjars" %% "webjars-play" % "2.2.2",
"org.webjars.bower" % "bootstrap" % "3.3.4",
"org.webjars.bower" % "angular" % "1.4.0-rc.2",
"org.webjars.bower" % "angular-ui-router" % "0.2.14",
"org.webjars.bower" % "js-data-angular" % "2.4.0" 
)


play.Project.playJavaSettings
