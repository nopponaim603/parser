# parser
Replay parse server generating logs from replay files

Quickstart
----
* Call mvn clean for clean project.
* Call mvn package to update External Libraries form pom.xml file

* Run the Java project (it'll start a webserver on port 5600)
  Run By Java Application
  eclipe -> Run Java Application
  
* POST a .dem replay file to the server (example in scripts/test.sh)
* The parser returns line-delimited JSON in the HTTP response