# parser
Replay parse server generating logs from replay files

Quickstart
----
* If Run on Intilij must call maven to package External Libraries form pom.xml file
      
    mvn package 

* Run the Java project (it'll start a webserver on port 5600)
  
    Eclipe -> Run Java Application
    Intilij -> Run JAR Application(stats-0.1.0.jar)
  
* POST a .dem replay file to the server (example in scripts/test.sh)
* The parser returns line-delimited JSON in the HTTP response