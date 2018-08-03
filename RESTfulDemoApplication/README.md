RESTfulDemoApplication is based on RestEasy framework to develope rest webservices.
It will be deployed on jboss or any other application server.

How to run :-
             1.Checkout RESTfulDemoApplicatoin into your local system.
             2.Build it using command below
                - mvn clean install -DskipTests
             3. Deploy the war file which is generated inside RESTfulDemoApplication/target folder.
             4. You can deploy it using management console or jboss cli using below command.
                - deploy /RESTfulDemoApplicaton/target/RESTfulDemoApplication.war
