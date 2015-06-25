import play.Project._

name := "zentask"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean,jdbc,
		 "mysql" % "mysql-connector-java" % "5.1.27"
)     


playJavaSettings
