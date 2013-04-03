name := "Exercise-GettingStarted"

version := "1.0"

scalaVersion := "2.10.0"

resolvers += "typesafe-repo" at "http://repo.typesafe.com/typesafe/repo"

libraryDependencies ++= Seq(
	"org.scalatest" % "scalatest_2.10" % "2.0.M6-SNAP9" % "test",
	"junit" % "junit" % "4.11" % "test",
	"com.novocode" % "junit-interface" % "0.10-M2" % "test"
)

cleanFiles <+= baseDirectory { base => base / "target" }

cleanFiles <+= baseDirectory { base => base / "project/target" }

cleanFiles <+= baseDirectory { base => base / "project/project/target" }