Running the Examples
====================

In the directory `examples` there are 2 sets of examples, these are

-   JMS Examples - these demonstrate functionality while sending and
    consumng JMS messages.

-   Java EE Examples - these demonstrate application server integration,
    e.g. MDBs, EJBs, Servlets, etc.

The JMS examples
================

The JMS Examples all follow the same format. Each examples is contained
in its own directory which contains the following.

-   `pom.xml`

    This is the Maven build file used to run the example

-   `src` directory

    This contains the source code for the example

-   `resources/activemq/server0` configuration directory

    This contains the configuration files needed to run the server for
    the example. There may be multiple configuration directories
    `server0`, `server1` etc for clustered examples etc.

Each example will start one or more stand-alone servers and stop them
after the example has completed.

As a quick start we'll run the queue example. For all other examples
refer to the main user manual.

Firstly open a Shell or a Command prompt and navigate to the
`examples/jms/queue` directory.

Type the command `mvn verify` and you should see the following output:


    [INFO] Scanning for projects...
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] Building ActiveMQ JMS Queue Example 2.3.0.BETA-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ activemq-jms-queue-example ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 3 resources
    [INFO]
    [INFO] --- maven-compiler-plugin:3.0:compile (default-compile) @ activemq-jms-queue-example ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ activemq-jms-queue-example ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /home/andy/projects/activemq-master/examples/jms/queue/src/test/resources
    [INFO]
    [INFO] --- maven-compiler-plugin:3.0:testCompile (default-testCompile) @ activemq-jms-queue-example ---
    [INFO] No sources to compile
    [INFO]
    [INFO] --- maven-surefire-plugin:2.13:test (default-test) @ activemq-jms-queue-example ---
    [INFO]
    [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ activemq-jms-queue-example ---
    [INFO] Building jar: /home/andy/projects/activemq-master/examples/jms/queue/target/activemq-jms-queue-example-2.3.0.BETA-SNAPSHOT.jar
    [INFO]
    [INFO] >>> maven-source-plugin:2.2.1:jar (attach-sources) @ activemq-jms-queue-example >>>
    [INFO]
    [INFO] <<< maven-source-plugin:2.2.1:jar (attach-sources) @ activemq-jms-queue-example <<<
    [INFO]
    [INFO] --- maven-source-plugin:2.2.1:jar (attach-sources) @ activemq-jms-queue-example ---
    [INFO] Building jar: /home/andy/projects/activemq-master/examples/jms/queue/target/activemq-jms-queue-example-2.3.0.BETA-SNAPSHOT-sources.jar
    [INFO]
    [INFO] >>> maven-source-plugin:2.2.1:jar (default) @ activemq-jms-queue-example >>>
    [INFO]
    [INFO] <<< maven-source-plugin:2.2.1:jar (default) @ activemq-jms-queue-example <<<
    [INFO]
    [INFO] --- maven-source-plugin:2.2.1:jar (default) @ activemq-jms-queue-example ---
    [WARNING] Artifact org.apache.activemq.examples.jms:activemq-jms-queue-example:java-source:sources:2.3.0.BETA-SNAPSHOT already attached to project, ignoring duplicate
    [INFO]
    [INFO] --- activemq-maven-plugin:1.1.1-SNAPSHOT:start (start) @ activemq-jms-queue-example ---
    [file:/home/andy/projects/activemq-master/examples/jms/queue/target/classes/activemq/server0/]
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.deployers.impl.FileConfigurationParser parseMainConfig
    WARN: HQ222018: AIO was not located on this platform, it will fall back to using pure Java NIO. If your platform is Linux, install LibAIO to enable the AIO journal
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl start
    INFO: HQ221000: live server is starting with configuration ActiveMQ Configuration (clustered=false,backup=false,sharedStore=true,journalDirectory=/home/andy/projects/activemq-master/examples/jms/queue/target//server0/data/messaging/journal,bindingsDirectory=/home/andy/projects/activemq-master/examples/jms/queue/target//server0/data/messaging/bindings,largeMessagesDirectory=/home/andy/projects/activemq-master/examples/jms/queue/target//server0/data/messaging/largemessages,pagingDirectory=/home/andy/projects/activemq-master/examples/jms/queue/target//server0/data/messaging/paging)
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl$SharedStoreLiveActivation run
    INFO: HQ221006: Waiting to obtain live lock
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.persistence.impl.journal.JournalStorageManager <init>
    INFO: HQ221013: Using NIO Journal
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl initialisePart1
    WARN: HQ222007: Security risk! ActiveMQ is running with the default cluster admin user and default password. Please see the ActiveMQ user guide, cluster chapter, for instructions on how to change this.
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.server.impl.FileLockNodeManager startLiveNode
    INFO: HQ221034: Waiting to obtain live lock
    Apr 17, 2013 10:51:01 AM org.apache.activemq.core.server.impl.FileLockNodeManager startLiveNode
    INFO: HQ221035: Live Server Obtained live lock
    Apr 17, 2013 10:51:02 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl deployQueue
    INFO: HQ221003: trying to deploy queue jms.queue.exampleQueue
    Apr 17, 2013 10:51:02 AM org.apache.activemq.core.remoting.impl.netty.NettyAcceptor start
    INFO: HQ221020: Started Netty Acceptor version 3.6.2.Final-c0d783c localhost:5445 for CORE protocol
    Apr 17, 2013 10:51:02 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl$SharedStoreLiveActivation run
    INFO: HQ221007: Server is now live
    Apr 17, 2013 10:51:02 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl start
    INFO: HQ221001: ActiveMQ Server version 2.3.0.SNAPSHOT (black'n'yellow, 123) [a57893ff-7783-11e2-9787-07ca142fc9f7]
    [INFO]
    [INFO] --- activemq-maven-plugin:1.1.1-SNAPSHOT:runClient (runClient) @ activemq-jms-queue-example ---
    Apr 17, 2013 10:51:02 AM org.apache.activemq.common.example.ActiveMQExample getContext
    INFO: using jnp://localhost:1099 for jndi
    Sent message: This is a text message
    Received message: This is a text message
    example complete

    #####################
    ###    SUCCESS!   ###
    #####################
    [INFO]
    [INFO] --- activemq-maven-plugin:1.1.1-SNAPSHOT:stop (stop) @ activemq-jms-queue-example ---
    Apr 17, 2013 10:51:03 AM org.apache.activemq.core.server.management.impl.ManagementServiceImpl stop
    WARN: HQ222113: On ManagementService stop, there are 1 unexpected registered MBeans: [core.acceptor.netty-acceptor]
    Apr 17, 2013 10:51:03 AM org.apache.activemq.core.server.impl.ActiveMQServerImpl stop
    INFO: HQ221002: ActiveMQ Server version 2.3.0.SNAPSHOT (black'n'yellow, 123) [a57893ff-7783-11e2-9787-07ca142fc9f7] stopped
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 4.428s
    [INFO] Finished at: Wed Apr 17 10:51:03 BST 2013
    [INFO] Final Memory: 11M/456M
    [INFO] ------------------------------------------------------------------------

Congratulations! You have successfully run your first ActiveMQ example.
Try some of the others.

The Java EE Examples
====================

The Java EE Examples are examples that require a JEE application server
to run. They include MDB, Servlet, EJB examples etc. For this you will
need the JBoss Application Server 7.1.x installed and uses Arquillian to
run the example. How to do this is explained in the previous chapters.

We'll use the MDB example for the purposes of this guide. For the other
examples refer to the user guide. Before going any further ensure that
the JBoss Application Server is running.

The first thing we need to do is set the `JBOSS_HOME` environment
property to the location of the JBoss Application Server, in a Linux
shell this would be something like:

    export JBOSS_HOME=/home/jbossas7.1/build/output/jboss-7.1.0

Yoy can then run the example via maven by running `mvn test`

In the shell window you should see something like the following output:

    [INFO] Scanning for projects...
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] Building ActiveMQ JEE MDB Example 2.3.0.BETA-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ activemq-jee-mdb-bmt-example ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/src/main/resources
    [INFO]
    [INFO] --- maven-compiler-plugin:3.0:compile (default-compile) @ activemq-jee-mdb-bmt-example ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:copy-resources (as-node-0) @ activemq-jee-mdb-bmt-example ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1112 resources
    [INFO] Copying 5 resources
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ activemq-jee-mdb-bmt-example ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO]
    [INFO] --- maven-compiler-plugin:3.0:testCompile (default-testCompile) @ activemq-jee-mdb-bmt-example ---
    [INFO] Changes detected - recompiling the module!
    [INFO] Compiling 1 source file to /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/test-classes
    [INFO]
    [INFO] --- maven-surefire-plugin:2.12:test (default-test) @ activemq-jee-mdb-bmt-example ---
    [INFO] Surefire report directory: /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/surefire-reports

    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running org.apache.activemq.javaee.example.server.ExampleRunnerTest
    log4j:WARN No appenders could be found for logger (org.jboss.logging).
    log4j:WARN Please initialize the log4j system properly.
    log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
    Apr 17, 2013 10:58:04 AM org.jboss.arquillian.container.impl.MapObject populate
    WARNING: Configuration contain properties not supported by the backing object org.jboss.as.arquillian.container.managed.ManagedContainerConfiguration
    Unused property entries: {waitForPortsTimeoutInSeconds=8, waitForPorts=8787 9999}
    Supported property names: [jbossHome, outputToConsole, enableAssertions, password, managementPort, javaHome, javaVmArguments, username, serverConfig, allowConnectingToRunningServer, managementAddress, startupTimeoutInSeconds, modulePath]
    Apr 17, 2013 10:58:04 AM org.jboss.as.arquillian.container.managed.ManagedDeployableContainer startInternal
    INFO: Starting container with: [/home/andy/devtools/jdk1.6.0_25//bin/java, -Djboss.inst=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0, -ea, -Djboss.home.dir=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0, -Dorg.jboss.boot.log.file=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/log/boot.log, -Dlogging.configuration=file:/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/configuration/logging.properties, -Djboss.modules.dir=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/modules, -Djboss.bundles.dir=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/bundles, -jar, /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/jboss-modules.jar, -mp, /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/modules, -jaxpmodule, javax.xml.jaxp-provider, org.jboss.as.standalone, -server-config, standalone-example.xml]
    10:58:04,525 INFO  [org.jboss.modules] JBoss Modules version 1.1.1.GA
    10:58:04,664 INFO  [org.jboss.msc] JBoss MSC version 1.0.2.GA
    10:58:04,703 INFO  [org.jboss.as] JBAS015899: JBoss AS 7.1.1.Final "Brontes" starting
    10:58:05,492 INFO  [org.xnio] XNIO Version 3.0.3.GA
    10:58:05,494 INFO  [org.jboss.as.server] JBAS015888: Creating http management service using socket-binding (management-http)
    10:58:05,502 INFO  [org.xnio.nio] XNIO NIO Implementation Version 3.0.3.GA
    10:58:05,509 INFO  [org.jboss.remoting] JBoss Remoting version 3.2.3.GA
    10:58:05,527 INFO  [org.jboss.as.logging] JBAS011502: Removing bootstrap log handlers
    10:58:05,530 INFO  [org.jboss.as.configadmin] (ServerService Thread Pool -- 32) JBAS016200: Activating ConfigAdmin Subsystem
    10:58:05,560 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 37) JBAS010280: Activating Infinispan subsystem.
    10:58:05,562 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 33) JBAS010403: Deploying JDBC-compliant driver class org.h2.Driver (version 1.3)
    10:58:05,573 INFO  [org.jboss.as.jacorb] (ServerService Thread Pool -- 38) JBAS016300: Activating JacORB Subsystem
    10:58:05,595 INFO  [org.jboss.as.connector] (MSC service thread 1-12) JBAS010408: Starting JCA Subsystem (JBoss IronJacamar 1.0.9.Final)
    10:58:05,612 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 48) JBAS011800: Activating Naming Subsystem
    10:58:05,625 INFO  [org.jboss.as.osgi] (ServerService Thread Pool -- 49) JBAS011940: Activating OSGi Subsystem
    10:58:05,649 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 54) JBAS013101: Activating Security Subsystem
    10:58:05,657 INFO  [org.jboss.as.naming] (MSC service thread 1-8) JBAS011802: Starting Naming Service
    10:58:05,663 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-16) JBAS015400: Bound mail session [java:jboss/mail/Default]
    10:58:05,675 INFO  [org.jboss.as.security] (MSC service thread 1-14) JBAS013100: Current PicketBox version=4.0.7.Final
    10:58:05,683 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 58) JBAS015537: Activating WebServices Extension
    10:58:05,705 INFO  [org.jboss.jaxr] (MSC service thread 1-8) JBAS014000: Started JAXR subsystem, binding JAXR connection factory into JNDI as: java:jboss/jaxr/ConnectionFactory
    10:58:05,831 INFO  [org.jboss.ws.common.management.AbstractServerConfig] (MSC service thread 1-4) JBoss Web Services - Stack CXF Server 4.0.2.GA
    10:58:05,943 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-6) Starting Coyote HTTP/1.1 on http-localhost.localdomain-127.0.0.1-8080
    10:58:05,966 INFO  [org.jboss.as.jacorb] (MSC service thread 1-2) JBAS016330: CORBA ORB Service started
    10:58:05,988 INFO  [org.apache.activemq.core.server.impl.ActiveMQServerImpl] (MSC service thread 1-11) live server is starting with configuration ActiveMQ Configuration (clustered=false,backup=false,sharedStore=true,journalDirectory=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/messagingjournal,bindingsDirectory=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/messagingbindings,largeMessagesDirectory=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/messaginglargemessages,pagingDirectory=/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/messagingpaging)
    10:58:05,996 INFO  [org.apache.activemq.core.server.impl.ActiveMQServerImpl] (MSC service thread 1-11) Waiting to obtain live lock
    10:58:06,037 INFO  [org.apache.activemq.core.persistence.impl.journal.JournalStorageManager] (MSC service thread 1-11) Using AIO Journal
    10:58:06,122 INFO  [org.jboss.as.jacorb] (MSC service thread 1-14) JBAS016328: CORBA Naming Service started
    10:58:06,184 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-7) JBAS010400: Bound data source [java:jboss/datasources/ExampleDS]
    10:58:06,204 INFO  [org.apache.activemq.core.server.impl.AIOFileLockNodeManager] (MSC service thread 1-11) Waiting to obtain live lock
    10:58:06,205 INFO  [org.apache.activemq.core.server.impl.AIOFileLockNodeManager] (MSC service thread 1-11) Live Server Obtained live lock
    10:58:06,434 INFO  [org.jboss.as.remoting] (MSC service thread 1-2) JBAS017100: Listening on localhost.localdomain/127.0.0.1:4447
    10:58:06,434 INFO  [org.jboss.as.remoting] (MSC service thread 1-15) JBAS017100: Listening on /127.0.0.1:9999
    10:58:06,436 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-16) JBAS015012: Started FileSystemDeploymentService for directory /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/deployments
    10:58:08,790 INFO  [org.apache.activemq.core.remoting.impl.netty.NettyAcceptor] (MSC service thread 1-11) Started Netty Acceptor version 3.2.5.Final-a96d88c localhost.localdomain:5445 for CORE protocol
    10:58:08,793 INFO  [org.apache.activemq.core.remoting.impl.netty.NettyAcceptor] (MSC service thread 1-11) Started Netty Acceptor version 3.2.5.Final-a96d88c localhost.localdomain:5455 for CORE protocol
    10:58:08,795 INFO  [org.apache.activemq.core.server.impl.ActiveMQServerImpl] (MSC service thread 1-11) Server is now live
    10:58:08,797 INFO  [org.apache.activemq.core.server.impl.ActiveMQServerImpl] (MSC service thread 1-11) ActiveMQ Server version 2.2.13.Final (HQ_2_2_13_FINAL_AS7, 122) [5c499e88-9c63-11e2-bfa3-fe5400591699]) started
    10:58:08,822 INFO  [org.jboss.as.messaging] (MSC service thread 1-4) JBAS011601: Bound messaging object to jndi name java:jboss/exported/jms/RemoteConnectionFactory
    10:58:08,824 INFO  [org.jboss.as.messaging] (MSC service thread 1-4) JBAS011601: Bound messaging object to jndi name java:/RemoteConnectionFactory
    10:58:08,825 INFO  [org.jboss.as.messaging] (MSC service thread 1-10) JBAS011601: Bound messaging object to jndi name java:/ConnectionFactory
    10:58:08,830 INFO  [org.apache.activemq.core.server.impl.ActiveMQServerImpl] (MSC service thread 1-3) trying to deploy queue jms.queue.testQueue
    10:58:08,836 INFO  [org.jboss.as.messaging] (MSC service thread 1-3) JBAS011601: Bound messaging object to jndi name java:/queue/test
    10:58:08,840 INFO  [org.jboss.as.messaging] (MSC service thread 1-3) JBAS011601: Bound messaging object to jndi name java:jboss/exported/jms/queues/testQueue
    10:58:08,859 INFO  [org.jboss.as.deployment.connector] (MSC service thread 1-9) JBAS010406: Registered connection factory java:/JmsXA
    10:58:08,866 INFO  [org.apache.activemq.ra.ActiveMQResourceAdapter] (MSC service thread 1-9) ActiveMQ resource adaptor started
    10:58:08,867 INFO  [org.jboss.as.connector.services.ResourceAdapterActivatorService$ResourceAdapterActivator] (MSC service thread 1-9) IJ020002: Deployed: file://RaActivatoractivemq-ra
    10:58:08,870 INFO  [org.jboss.as.deployment.connector] (MSC service thread 1-5) JBAS010401: Bound JCA ConnectionFactory [java:/JmsXA]
    10:58:08,898 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-10) JBAS015876: Starting deployment of "ONT001-1.0.war"
    10:58:09,146 INFO  [org.jboss.wsf.stack.cxf.metadata.MetadataBuilder] (MSC service thread 1-1) Add Service
     id=com.hpm.webservices.BasicWSImpl
     address=http://localhost:8080/hpm/BasicWService
     implementor=com.hpm.webservices.BasicWSImpl
     invoker=org.jboss.wsf.stack.cxf.JBossWSInvoker
     serviceName={http://ont001-hpm.rhcloud.com/BasicWS}BasicWService
     portName={http://ont001-hpm.rhcloud.com/BasicWS}BasicWS
     wsdlLocation=null
     mtomEnabled=false
    10:58:09,361 INFO  [org.apache.cxf.service.factory.ReflectionServiceFactoryBean] (MSC service thread 1-1) Creating Service {http://ont001-hpm.rhcloud.com/BasicWS}BasicWService from WSDL: WEB-INF/wsdl/BasicWService.wsdl
    10:58:09,517 INFO  [org.jboss.wsf.stack.cxf.transport.AddressRewritingEndpointInfo] (MSC service thread 1-1) Setting new service endpoint address in wsdl: http://ONT001-HPM.rhcloud.com:80/BasicWService
    10:58:09,656 INFO  [org.jboss.wsf.stack.cxf.transport.AddressRewritingEndpointInfo] (MSC service thread 1-1) Setting new service endpoint address in wsdl: http://localhost:8080/hpm/BasicWService
    10:58:09,688 INFO  [org.apache.cxf.endpoint.ServerImpl] (MSC service thread 1-1) Setting the server's publish address to be http://localhost:8080/hpm/BasicWService
    10:58:09,729 INFO  [org.jboss.wsf.stack.cxf.deployment.WSDLFilePublisher] (MSC service thread 1-1) WSDL published to: file:/home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/wsdl/ONT001-1.0.war/BasicWService.wsdl
    10:58:09,735 INFO  [org.jboss.as.webservices] (MSC service thread 1-11) JBAS015539: Starting service jboss.ws.port-component-link
    10:58:09,748 INFO  [org.jboss.as.webservices] (MSC service thread 1-10) JBAS015539: Starting service jboss.ws.endpoint."ONT001-1.0.war"."com.hpm.webservices.BasicWSImpl"
    10:58:09,753 INFO  [org.jboss.ws.common.management.DefaultEndpointRegistry] (MSC service thread 1-10) register: jboss.ws:context=hpm,endpoint=com.hpm.webservices.BasicWSImpl
    10:58:09,829 INFO  [org.jboss.web] (MSC service thread 1-3) JBAS018210: Registering web context: /hpm
    10:58:09,834 INFO  [org.jboss.as] (MSC service thread 1-7) JBAS015951: Admin console listening on http://127.0.0.1:9990
    10:58:09,835 INFO  [org.jboss.as] (MSC service thread 1-7) JBAS015874: JBoss AS 7.1.1.Final "Brontes" started in 5506ms - Started 216 of 296 services (79 services are passive or on-demand)
    10:58:09,979 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 2) JBAS018559: Deployed "ONT001-1.0.war"
    mdb.jar:
    /org/
    /org.apache.activemq/
    /org.apache.activemq/javaee/
    /org.apache.activemq/javaee/example/
    /org.apache.activemq/javaee/example/server/
    /org.apache.activemq/javaee/example/server/MDB_BMTExample.class
    10:58:11,612 INFO  [org.jboss.as.repository] (management-handler-thread - 2) JBAS014900: Content added at location /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/content/f0/e2d589ab9490193e109c8bc833f725c87defae/content
    10:58:11,620 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) JBAS015876: Starting deployment of "arquillian-service"
    10:58:11,811 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) JBAS018567: Deployment "deployment.arquillian-service" is using a private module ("org.jboss.as.jmx:main") which may be changed or removed in future versions without notice.
    10:58:11,812 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) JBAS018567: Deployment "deployment.arquillian-service" is using a private module ("org.jboss.as.server:main") which may be changed or removed in future versions without notice.
    10:58:11,813 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) JBAS018567: Deployment "deployment.arquillian-service" is using a private module ("org.jboss.as.osgi:main") which may be changed or removed in future versions without notice.
    10:58:11,815 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) JBAS018567: Deployment "deployment.arquillian-service" is using a private module ("org.jboss.jandex:main") which may be changed or removed in future versions without notice.
    10:58:11,817 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) JBAS018567: Deployment "deployment.arquillian-service" is using a private module ("org.jboss.osgi.framework:main") which may be changed or removed in future versions without notice.
    10:58:11,953 INFO  [org.jboss.as.server] (management-handler-thread - 2) JBAS018559: Deployed "arquillian-service"
    10:58:12,328 INFO  [org.jboss.as.repository] (management-handler-thread - 3) JBAS014900: Content added at location /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/content/59/7dcdb0f420ed57aea638b2599f7a86eecf6c85/content
    10:58:12,333 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-7) JBAS015876: Starting deployment of "mdb.jar"
    10:58:12,401 INFO  [org.jboss.as.arquillian] (MSC service thread 1-14) Arquillian deployment detected: ArquillianConfig[service=jboss.arquillian.config."mdb.jar",unit=mdb.jar,tests=[org.apache.activemq.javaee.example.server.ExampleRunnerTest]]
    10:58:12,418 INFO  [org.jboss.as.ejb3] (MSC service thread 1-15) JBAS014142: Started message driven bean 'MDB_BMTExample' with 'activemq-ra' resource adapter
    10:58:12,562 INFO  [org.jboss.as.server] (management-handler-thread - 3) JBAS018559: Deployed "mdb.jar"
    Sent message: This is a text message
    10:58:13,229 INFO  [org.jboss.as.naming] (Remoting "localhost" task-3) JBAS011806: Channel end notification received, closing channel Channel ID 57be4578 (inbound) of Remoting connection 3ac552d5 to /127.0.0.1:58571
    10:58:13,255 INFO  [stdout] (Thread-0 (ActiveMQ-client-global-threads-1402019528)) message This is a text message received
    10:58:13,257 INFO  [stdout] (Thread-0 (ActiveMQ-client-global-threads-1402019528)) we're in the middle of a transaction: org.jboss.tm.usertx.client.ServerVMClientUserTransaction@6b04d3c8
    10:58:14,292 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015877: Stopped deployment mdb.jar in 33ms
    10:58:14,413 INFO  [org.jboss.as.repository] (management-handler-thread - 1) JBAS014901: Content removed from location /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/content/59/7dcdb0f420ed57aea638b2599f7a86eecf6c85/content
    10:58:14,415 INFO  [org.jboss.as.server] (management-handler-thread - 1) JBAS018558: Undeployed "mdb.jar"
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.609 sec
    10:58:14,436 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015877: Stopped deployment arquillian-service in 6ms
    10:58:14,530 INFO  [org.jboss.as.repository] (management-handler-thread - 2) JBAS014901: Content removed from location /home/andy/projects/activemq-master/examples/javaee/mdb-bmt/target/jbossas-node0/standalone/data/content/f0/e2d589ab9490193e109c8bc833f725c87defae/content
    10:58:14,532 INFO  [org.jboss.as.server] (management-handler-thread - 2) JBAS018558: Undeployed "arquillian-service"

    Results :

    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 23.441s
    [INFO] Finished at: Wed Apr 17 10:58:16 BST 2013
    [INFO] Final Memory: 19M/361M
    [INFO] ------------------------------------------------------------------------

Congratulations! you have successfully deployed and run a Java EE
example.
