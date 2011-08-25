organization := "info.rkyymmt"

name := "scalatlas"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.9.0-1"

/**Shell */
shellPrompt := {
  state => System.getProperty("user.name") + "> "
}

shellPrompt in ThisBuild := {
  state => Project.extract(state).currentRef.project + "> "
}

resolvers += "atlassian" at "https://maven.atlassian.com/content/repositories/atlassian-contrib/"

libraryDependencies ++= Seq(
  "org.swift.common" % "jira-soap" % "4.4.0" % "compile->default",
  "org.swift.common" % "confluence-soap" % "3.5.2" % "compile->default",
  "ch.qos.logback" % "logback-classic" % "0.9.29" % "compile->default",
  "org.scala-tools.testing" %% "specs" % "1.6.8" % "test->default"
)


// https://jira.atlassian.com/rpc/soap/jirasoapservice-v2?wsdl
// https://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v1?wsdl
