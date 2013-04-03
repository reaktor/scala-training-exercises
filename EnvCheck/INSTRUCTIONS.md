Setting up your development environment
=======================================

For the purposes of the hands-on training class you will need a few pieces 
of software installed on your computer. This includes a Java SDK, the Scala 
SDK, a build toolchain, and an IDE with the appropriate add-ons for Scala 
programming. The following sections will give you more detailed instructions 
for ensuring that your computer has each of these aspects properly configured 
for the training.

Java SDK
--------

We assume that the participants already have Java installed but we recommend 
checking that you have a reasonably recent version of Java. Any version of 
the Java SDK newer than 1.6 should work just fine. If you need to upgrade 
your JDK, you can download the latest and greatest from [www.oracle.com]
(http://www.oracle.com/technetwork/java/javase/downloads/index.html)
 - remember to select the JDK, not the JRE...

Scala SDK
--------------

Please install a recent version of the Scala SDK from [www.scala-lang.org]
(http://www.scala-lang.org/downloads) - any version newer than 2.10 should 
work fine. After installing Scala you should be able to find the following 
executables from your PATH:

    $ scala -version
    Scala code runner version 2.10.0 -- Copyright 2002-2012, LAMP/EPFL

    $ scalac -version
    Scala compiler version 2.10.0 -- Copyright 2002-2012, LAMP/EPFL

Build toolchain
---------------

We will use SBT (Simple Build Tool) for our exercise projects. Please install 
a recent version of SBT from [www.scala-sbt.org](http://www.scala-sbt.org/) - 
any version newer than 0.12.1 should work fine. Once you have installed SBT, 
you should be able to find the sbt executable from your PATH:

    $ sbt --version
    sbt launcher version 0.12.2

Downloading dependencies
------------------------

With Java, Scala and SBT installed, it is now a good time to verify that this 
basic infrastructure is working. A good way to do that is to try and run SBT 
on this project. Please carry out the following build commands from the 
project root directory:

    $ sbt update
    [info] Loading project definition from [...]
    [info] Set current project to EnvCheck (in build file:[...])
    [info] Updating {file:[...]}default-a31f45...
    [info] Resolving org.scala-tools.testing#test-interface;0.5 ...
    ...
    [info] Done updating.
    [success] Total time: 2 s, completed Apr 3, 2013 1:01:07 PM

    $ sbt test
    [info] Loading project definition from [...]
    [info] Set current project to EnvCheck (in build file:[...])
    [info] LibrarySpec:
    [info] - Libraries should contain the books they've received
    [info] - Books should always be sorted alphabetically
    [info] - Libraries should index their books
    [info] ScalatestSpec:
    [info] This code
    [info] - should compile and run
    [info] Passed: : Total 9, Failed 0, Errors 0, Passed 9, Skipped 0
    [success] Total time: 12 s, completed Apr 3, 2013 1:02:04 PM

The above build operations will likely take much longer on your computer the 
first time you run them. For instance, SBT might need to download a bunch of 
dependencies from the internet. In the end, however, you should see a line 
claiming "[success]" and you should see 'sbt test' running some automated 
tests like in the above example output.

IDE with Scala add-ons
----------------------

Scala has a fairly compact syntax but we warmly recommend installing an IDE 
for Scala programming - especially considering that we will be pair working 
on the exercises and not everybody is as familiar with VIM or Emacs as you 
are... With that said, the best alternatives to choose from include 
[Eclipse](http://www.eclipse.org/downloads/) and [Intellij IDEA]
(http://www.jetbrains.com/idea/download/) as they have stable and freely 
available Scala plugins and they cooperate nicely with SBT.

Choose your weapon of choice and install the appropriate Scala plugin for it 
from [http://www.scala-lang.org/node/91#ide_plugins]
(http://www.scala-lang.org/node/91#ide_plugins).

With the IDE plugin installed (and having restarted the IDE!) it is time to 
check that you can import our Scala exercise projects into your IDE, 
everything compiles alright, you can run tests, etc. The best way to do this 
is to let SBT generate the IDE project files for you and then point your IDE 
to those said project files.

For Eclipse:

    $ cd EnvCheck
    $ sbt eclipse
    [info] Loading project definition from [...]
    [info] Set current project to EnvCheck (in build file:[...])
    [info] About to create Eclipse project files for your project(s).
    [info] Successfully created Eclipse project files for project(s):
    [info] EnvCheck

For IDEA:

    $ cd EnvCheck
    $ sbt gen-idea
    [info] Loading project definition from [...]/EnvCheck/project
    [info] Set current project to EnvCheck (in build file:[...]/EnvCheck/)
    [info] Trying to create an Idea module EnvCheck
    [info] ...
    [info] Excluding folder target
    [info] Created [...]/EnvCheck/.idea/IdeaProject.iml
    [info] Created [...]/EnvCheck/.idea
    [info] Excluding folder [...]/EnvCheck/target
    [info] Created [...]/EnvCheck/.idea_modules/EnvCheck.iml
    [info] Created [...]/EnvCheck/.idea_modules/EnvCheck-build.iml
 
With the generated project files in place, import the project to your IDE and 
play around a bit to make sure that the IDE is able to compile everything and 
that you are able to execute the included unit tests.

That's all there is to preparing your development environment for the hands-on 
exercises. See you in class!
