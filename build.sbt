scalaVersion := "2.12.0-RC1"

lazy val scalatags = project
  .settings(
    organization := "org.remus32",
    name := "scalatags",
    scalaVersion := "2.12.0-RC1",
    autoCompilerPlugins := true,
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.1" % "test"
    )
  )


// Needed, so sbt finds the projects
lazy val scalatagsJVM = scalatags.jvm
lazy val scalatagsJS = scalatags.js
