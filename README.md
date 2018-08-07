The greeting directory code for providing Restful service with default embedded tomcat port 8080.Two mapping path: /greeting and /api/random.
The quete directory code for consuming service ,fetching json format data from previous service with customized tomcat port 8081 , spcified in /resource/application.properties file.

found another way , start Greeting application first, just request http://localhost:8080/greeting . then request http://localhost:8080/api/random, without the configuration file.
Since two service use the same controller.