organization := "__orgName__"

name := """__artifactId__"""

version := "0.0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

resolvers += "Internal Maven Repository" at "http://repo.caimi-inc.com/nexus/content/groups/public/"

resolvers += "oschina" at "http://maven.oschina.net/content/groups/public/ "

resolvers += "Central Maven Repository" at "http://repo1.maven.org/maven2/"

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws
)

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "react" % "0.12.2",
  "org.webjars" % "datatables" % "1.10.4"
)

routesGenerator := InjectedRoutesGenerator

mappings in Universal += file("LICENSE") -> "LICENSE"

mappings in Universal += file("README.md") -> "README.md"

mappings in Universal ++= directory("agents")

mappings in Universal ++= directory("conf")


