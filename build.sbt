name := "scala-sbt-spring-boot"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.0.5.RELEASE",
  "org.springframework.boot" % "spring-boot-devtools" % "2.0.5.RELEASE"
)

enablePlugins(JavaAppPackaging)
