This Project demonstrates how to set up a nginx server as a reverse proxy.
For demonstration purposes we will be using two springboot apps demoapp1 and demoapp2.
We will be using docker containers and hence we need to make sure that all the app containers and the nginx container are in the 
same docker network so that nginx is able to resolve the container name into addresses in the proxy pass directive in default.conf file
The default.conf file shows how to configure the nginx server as a reverse proxy.

How to run and test
run docker-compose up --build command to set up the 2 demo app containers and nginx container
hit http://localhost in your server and you will see the nginx landing page,which means nginx is up and runnning
now hit http://localhost/demoapp1/sayHello , you will get a response from the respective api in demoapp1
hit http://localhost/demoapp2/sayHello, you will get a response from demoapp2 api.
Essentially the nginx is now acting as a reverse proxy concealing the identity of demoapp1 and demoapp2 servers.
It is relaying the request to the respective servers.
