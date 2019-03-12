Rest Assured:
Its jar helps to do REST API automation (same as selenium is jar helps to do FE automation)
its java api (dsl) to test REST API

http://dummy.restapiexample.com/
https://github.com/rest-assured/rest-assured/wiki/Usage#xml-using-xmlpath
Hashmap: https://github.com/rest-assured/rest-assured/wiki/Usage#create-json-from-a-hashmap

Some reference:
https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assuredhttps://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured

Trainer Email:
rahulonlintutor@gmail.com

Example Rest API:
https://maps.googleapis.com/maps/api/place/nearbysearch/output?parameters
:->
Base URL - https://developers.google.com
Resources - maps/api/place/nearbysearch/output
Parameters - ?parameters

ex:
https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=restaurant&keyword=cruise&key=YOUR_API_KEY

Generated Key: (https://console.cloud.google.com/apis/credentials?project=totemic-program-232422&folder&organizationId)
AIzaSyAZ9wHbrn3GIUjKdE4Dxycx5q-vQzev2sQ

https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=restaurant&keyword=cruise&key=AIzaSyAZ9wHbrn3GIUjKdE4Dxycx5q-vQzev2sQ

Download All Jars:
https://github.com/rest-assured/rest-assured/wiki/Downloads

Type of Params:
Path Param, Query Param, Header Param

Useful Links:
https://github.com/rest-assured/rest-assured/wiki/Usage
	Child: https://github.com/rest-assured/rest-assured/wiki/Usage#logging

http://dummy.restapiexample.com/
https://github.com/rest-assured/rest-assured/wiki/Usage#xml-using-xmlpath
https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured

http://www.javadoc.io/doc/io.rest-assured/json-path/3.3.0
you can search - http://www.javadoc.io/ with anything such as io.rest-assured:rest-assured, io.rest-assured:json-path, io.rest-assured:xml-path,..etc


Download Jira from below link

https://www.atlassian.com/software/jira/download

Authentication API

https://developer.atlassian.com/jiradev/jira-apis/jira-rest-apis/jira-rest-api-tutorials/jira-rest-api-example-cookie-based-authentication
https://developer.atlassian.com/cloud/jira/platform/rest/v3/
https://developer.atlassian.com/server/jira/platform/cookie-based-authentication/

https://docs.atlassian.com/software/jira/docs/api/REST/7.6.1/
Create Issue: https://docs.atlassian.com/software/jira/docs/api/REST/7.6.1/#api/2/issue-createIssue
Update Comment: https://docs.atlassian.com/software/jira/docs/api/REST/7.6.1/#api/2/issue-updateComment

https://docs.atlassian.com/jira/REST/cloud/#api/2/issue-createIssue

localhost jira info: B26L-EVWT-Y06Y-U3K9
link: http://localhost:8080/secure/Dashboard.jspa
lic key - AAABeA0ODAoPeNp9kUtvgkAUhff8CpJu2sUQGFtbTEhqYZrYIhpBG5NuRrziNPLIncHWf18ETbU+dlxm7vnOOXMTlaC/wkynbZ3Szr3deTB1N4x0alq2liBAtsyLAtDwRQyZBDYXSuSZw4KIjYajXsi0oExngIPFWAJKh1iam2eKxyrgKTiSJxzn+Vzw5yTlYmXEeap9CeTGydqwxHjJJXhcgbPlE5MS+qjtyNGmgFrSHfT7bOT2uv7+iP0UAjcHey1C7b0N1q+w532EgGvAnue80LZP2OQjIlOzPSXj1rvdmCwwn5exMrYDkflCfXMEo1IVa3AUltBcu1zOmQrPBak8ZgoynsUXwlxxc1LkjlPl8nteyALiWy3ryXy0W1o1Ocd/rgiHiqMCdBZ8JUEbYMIzIXmdMOhqLkL9/f+5Vg19UpnZ3qRHFUCVEgsUcteeBzJGUdSabxVcD3dw/bZ5nLvPjs7WfFXWrMbtpfrPFXsIP9z702zmX+3aCdYwLQIVAIsCF97xrjOjtHQvtfpo9srGJJLFAhRrJlCm6QdV5cp2Tcjgb+ZnoqumQg==X02ie


Twitter:
https://developer.twitter.com/en/docs/api-reference-index

https://developer.twitter.com/en/apps/15087227

https://github.com/rest-assured/rest-assured/wiki/Usage#oauth




Maven:

https://mvnrepository.com/
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
Download Maven:
	https://maven.apache.org/download.cgi  - for mac 'apache-maven-3.6.0-bin.tar.gz'
	Setup path: MEVAN_HOME=

Create Empty folder and run:
mvn archetype:generate -DgroupId=sagarrestassured -DartifactId=reassuredwithmevanjava -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=SagarRestAssuredTestFW -DartifactId=ReassuredTestWithMevanJava -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

To create new mevan project
Then run mvn eclipse:eclipse to make it eclipse ready

surefire project will help to run all test in your mevan project:
https://maven.apache.org/surefire/maven-surefire-plugin/usage.html

Commands:
mvn clean
mvn compile
mvn test

https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html - check 'Using Suite XML Files'

Profiling to testng.xml: mvn test -PSmoke, mvn test -PRegression

Download Jenkins: https://jenkins.io/download/ - (.war)
java -jar jenkins.war -httpport=9090



Log4j:
Download: https://www.apache.org/dyn/closer.lua/logging/log4j/2.11.2/apache-log4j-2.11.2-bin.tar.gz
Configuration: https://logging.apache.org/log4j/2.x/manual/configuration.html

in config file:
Appenders: where to log, how to log (pattern)
Loggers: what to log (such as update Root level=trace/error ...etc), additivity=false - to avoid duplication
You can also log all log data to file as well



Few Useful commands:
Find occupied port on local host for process id
netstat -vanp tcp | grep 5601
Note: 5601 - port

Check Connection up or not
nc -v 10.37.73.62 9200

ps aux | grep node
kill -9 PROCESS_ID
killall node


TestNG:
Create testng.xml file with sts/eclipse - right click on projest select testng option create .xml


Excell Reader:
Poi Dependancies:
https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
https://mvnrepository.com/artifact/org.apache.poi/poi/3.17

Postman:
https://www.getpostman.com/collections/545e59dc1edee31b1db7