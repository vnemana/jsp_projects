#!/usr/bin/env bash

deploydir=~/SoftwareProjects/InstalledSoftware/apache-tomcat-8.0.35/webapps/coffeeV1

javac -classpath ~/SoftwareProjects/InstalledSoftware/apache-tomcat-8.0.35/lib/servlet-api.jar:classes:. -d classes src/com/example/web/*.java
javac -classpath ~/SoftwareProjects/InstalledSoftware/apache-tomcat-8.0.35/lib/servlet-api.jar:classes:. -d classes src/com/example/model/*.java
javac -classpath ~/SoftwareProjects/InstalledSoftware/apache-tomcat-8.0.35/lib/servlet-api.jar:classes:. -d classes src/com/example/*.java
cp classes/com/example/model/*.class $deploydir/WEB-INF/classes/com/example/model/.
cp classes/com/example/web/*.class $deploydir/WEB-INF/classes/com/example/web/.
cp classes/com/example/*.class $deploydir/WEB-INF/classes/com/example/.
cp etc/web.xml $deploydir/WEB-INF/.
cp web/* $deploydir/.
