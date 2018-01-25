import buildinfo.BuildInfo._

lazy val `sbt-web-build-base` = project in file(".")

description := "Base build plugin for all sbt-web plugins"

scalaVersion := "2.12.4"

addSbtPlugin("com.github.gseitz" % "sbt-release" % sbtReleaseVersion)

addSbtPlugin("com.jsuereth" % "sbt-pgp" % sbtPgpVersion)

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % scriptedPluginVersion

addCommandAlias("validate", ";clean;test;scripted")
