name := "lint-me"

organization := "org.dy.lint"

version := "1.0"

scalaVersion := "2.11.6"

scalacOptions ++= Seq[String]("-Ywarn-dead-code", "-Ywarn-unused", "-Ywarn-value-discard", "-Xplugin:lib/scala-linter_2.11-0.0.1.jar")
