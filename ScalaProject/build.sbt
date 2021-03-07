name := "ScalaProject"

version := "0.1"

scalaVersion := "2.13.5"



maintainer := "Shilpitha Prasad <shilpitha.prasad@knoldus.com>"

lazy val scalaTest="org.scalatest" %% "scalatest" % "3.2.5" % "test"

//enablePlugins(DebianPlugin)


lazy val root = project.in(file(".")).settings(
  libraryDependencies += scalaTest,
  maintainer := "Shilpitha Prasad <shilpitha.prasad@knoldus.com>"
).aggregate(flags,cliParser)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging)


lazy val cliParser = project.in(file("cliParser"))
  .settings(
    libraryDependencies += scalaTest,
   maintainer := "Shilpitha Prasad <shilpitha.prasad@knoldus.com>"
  ).dependsOn(flags)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging)

lazy val flags = project.in(file("flags"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Shilpitha Prasad <shilpitha.prasad@knoldus.com>"
  )
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging)