# jboss-log-example

From [JBoss AS 7 Configuration, Deployment and Administration](http://www.packtpub.com/jboss-as-7-configuration-deployment-administration/book)

Chapter 2 LogExample Maven Version

## Requirements

* JDK6 or later
* JBoss AS7.1 or EAP6.0

## Usage

1. $JBOSS_HOME/bin/standalone.sh
2. $JBOSS_HOME/bin/jboss-cli.sh -c --command="/system-property=myproperty:add(value=dummyvalue)"
3. git clone https://github.com/emag/jboss-log-example.git
4. cd jboss-log-example
5. mvn clean package jboss-as:deploy
6. access to [http://localhost:8080/jboss-log-example/logger](http://localhost:8080/jboss-log-example/logger)
7. Check console or server.log

## Undeploy and Remove System-Property

1. Make sure you have started the JBoss Server
2. cd jboss-log-example
3. mvn jboss-as:undeploy
4. $JBOSS_HOME/bin/jboss-cli.sh -c --command="/system-property=myproperty:remove"

## Notice

The mechanism of JBoss LogManager is different by JBoss Version. That's why there is some change the formart of logs. 

### AS 7.1.1

<pre>
10:52:03,395 FATAL [org.emamotor.jboss.as7.jbosslogexample.LoggerServlet] (http--127.0.0.1-8080-1) System variable myproperty=dummyvalue
10:52:03,396 ERROR [org.emamotor.jboss.as7.jbosslogexample.LoggerServlet] (http--127.0.0.1-8080-1) System variable myproperty=dummyvalue
10:52:03,398 WARN  [org.emamotor.jboss.as7.jbosslogexample.LoggerServlet] (http--127.0.0.1-8080-1) System variable myproperty=dummyvalue
10:52:03,399 INFO  [org.emamotor.jboss.as7.jbosslogexample.LoggerServlet] (http--127.0.0.1-8080-1) System variable myproperty=dummyvalue
</pre>

### EAP 6.0.0 (Based on AS 7.1.2)

<pre>
11:09:02,586 INFO  [stdout] (http-/127.0.0.1:8080-1) FATAL [http-/127.0.0.1:8080-1] (LoggerServlet.java:36) - System variable myproperty=dummyvalue
11:09:02,588 INFO  [stdout] (http-/127.0.0.1:8080-1) FATAL [http-/127.0.0.1:8080-1] (LoggerServlet.java:36) - System variable myproperty=dummyvalue
11:09:02,590 INFO  [stdout] (http-/127.0.0.1:8080-1) ERROR [http-/127.0.0.1:8080-1] (LoggerServlet.java:37) - System variable myproperty=dummyvalue
11:09:02,591 INFO  [stdout] (http-/127.0.0.1:8080-1) ERROR [http-/127.0.0.1:8080-1] (LoggerServlet.java:37) - System variable myproperty=dummyvalue
11:09:02,593 INFO  [stdout] (http-/127.0.0.1:8080-1)  WARN [http-/127.0.0.1:8080-1] (LoggerServlet.java:38) - System variable myproperty=dummyvalue
11:09:02,595 INFO  [stdout] (http-/127.0.0.1:8080-1)  WARN [http-/127.0.0.1:8080-1] (LoggerServlet.java:38) - System variable myproperty=dummyvalue
11:09:02,604 INFO  [stdout] (http-/127.0.0.1:8080-1)  INFO [http-/127.0.0.1:8080-1] (LoggerServlet.java:39) - System variable myproperty=dummyvalue
11:09:02,608 INFO  [stdout] (http-/127.0.0.1:8080-1)  INFO [http-/127.0.0.1:8080-1] (LoggerServlet.java:39) - System variable myproperty=dummyvalue
11:09:02,609 INFO  [stdout] (http-/127.0.0.1:8080-1) DEBUG [http-/127.0.0.1:8080-1] (LoggerServlet.java:40) - System variable myproperty=dummyvalue
11:09:02,611 INFO  [stdout] (http-/127.0.0.1:8080-1) DEBUG [http-/127.0.0.1:8080-1] (LoggerServlet.java:40) - System variable myproperty=dummyvalue
11:09:02,616 INFO  [stdout] (http-/127.0.0.1:8080-1) TRACE [http-/127.0.0.1:8080-1] (LoggerServlet.java:41) - System variable myproperty=dummyvalue
11:09:02,617 INFO  [stdout] (http-/127.0.0.1:8080-1) TRACE [http-/127.0.0.1:8080-1] (LoggerServlet.java:41) - System variable myproperty=dummyvalue
</pre>

If you use JBoss AS 7.1.2 or later, your apps should NOT have its own logging lib(such as log4j).
