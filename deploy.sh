#!/usr/bin/env bash

deploydir=~/SoftwareProjects/InstalledSoftware/apache-tomcat-8.0.35/webapps/coffeeV1

cp classes/com/example/model/* $deploydir/WEB-INF/classes/com/example/model/.
cp classes/com/example/web/* $deploydir/WEB-INF/classes/com/example/web/.
cp etc/web.xml $deploydir/WEB-INF/.
cp web/* $deploydir/.
