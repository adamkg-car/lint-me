lazy val root = (project in file(".")).
  settings(
    name := "lint-me",
    organization := "org.dy.lint",
    version := "1.0",
    scalaVersion := "2.11.6"
  )

//root.enablePlugins(DeadCodeDetectPlugin)