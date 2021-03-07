**CLI Parser in Scala**

This is a client-server program where the client sends requests for data that are based on the flags using the Unix Domain Socket.The Server would process the request and send the response through the cli.
CliParser is a command line parser. It is a multimodule project written in scala programming language.This project contains customised flags, where the flags print various types of triangles. 


**The Dependencies Added** 

lazy val scalaTest="org.scalatest" %% "scalatest" % "3.2.5" % "test"  - available in the build.sbt file
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.6.1")    - available in the plugins.sbt file


**The Plugins Enabled**

.enablePlugins(UniversalPlugin)
.enablePlugins(JavaAppPackaging)  - available in the build.sbt file


Two modules, CliParser and flags exist. The CliParser contains the mainclass to run the project. The flags module contain the Triangles-flag code and the unit test cases to validate the flags that are created.

**The Flags Present are:**

-t => Prints a Triangle
-dt => Prints a Reverse Triangle
-lt => Prints a Left Sided Triangle
-rt => Prints a Right Sided Triangle


Create a zip file by the command **CliParser/universal:PackageBin** from the sbt console of the project folder. 

**To run the application -** 
Once the zip file is created inside the universal folder in the target folder of the CliParser module(CliParser/target/universal/cliparser 0.1.0-SNAPSHOT.zip), unzip the folder(cliparser 0.1.0-SNAPSHOT) and access the bin folder. From this location using the command line the flags can be accessed in the form of a client-server.




