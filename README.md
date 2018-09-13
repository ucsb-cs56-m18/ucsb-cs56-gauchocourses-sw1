# ucsb-cs56-gauchocourses-sw1
This is the JSON reader for course files.

# To Run 
```
mvn compile
mvn package
mvn exec:java
```
Result:
* All courses data
* Press Enter, you can get the data back to json

# To Run the older Main

```
mvn compile
mvn package
java -cp target/sparkjava-lombok-jackson-example-1.0-jar-with-dependencies.jar edu.ucsb.cs56.pconrad.restdemo.TryOneCourse
```

Explanation:

* `-cp name-of-jar-file` means to get the Java classes from that jar file
* `target/sparkjava-lombok-jackson-example-1.0-jar-with-dependencies.jar` is the jar file that is produced by `mvn package`
* `edu.ucsb.cs56.pconrad.restdemo.TryOneCourse` is the full name of the class we want to run

Note that `mvn package` actually produces two jar files:

* sparkjava-lombok-jackson-example-1.0-jar-with-dependencies.jar
* sparkjava-lombok-jackson-example-1.0.jar

The difference is that the one with the short name ONLY has .class files for the .java files that are
in your repo.   The one `with-dependencies` ALSO has all of the .class files for all the extra software
we are using, like SparkJava (for web stuff) and Jackson (for JSON data) and JUnit (for testing), etc.

In this way, we can run any Main from any of the classes in our repo, not just the one `MainClass` we identified in our `pom.xml`.

Of course it is always more convenient to run that `MainClass` because we can just type `mvn exec:java`
