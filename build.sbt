scalaVersion := "2.12.0-RC1"

lazy val scalatags = project
  .settings(
    organization := "org.remus32",
    name := "scalatags",
    scalaVersion := "2.12.0-RC1",
    autoCompilerPlugins := true,
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided"
    )
  )
