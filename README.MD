# Functions with Spring Cloud Function

Lets build some basic functions with spring boot and spring cloud

Build the spring boot application

```
mvn clean install function:run
```

this will start your spring cloud on localhost:8080

Now you can run the curl command from a different command prompt

```
curl http://localhost:8080/ -d "Vishal"
```


You should be able to call the above from any http client as well

This was a simple Spring Cloud function.

If you have 2 functions in the same class as shown in the class **GTAJavaCloudFunction** then you need to do following things 

1) Comment out the Line number 6 in **GTAJavaSingleFunction** , so that this is not our main class anymore.
2) Uncomment Line number 6 in **GTAJavaCloudFunction** , making this class as main class
3) Change the Manifest.MF inside the resources/META-INF/ folder to make **GTAJavaCloudFunction** as main class

```
Main-Class: row.vishal.examples.GTAJavaCloudFunction
```

4) Notice how this class has 2 functions you need to set Spring property in env variable to make one the function as default

```
set spring.cloud.function.definition=hello 
```

5) Execute Spring Funciton:run again 

```
mvn clean install function:run
```

Now you can run the curl command from a different command prompt

```
curl http://localhost:8080/ -d "Vishal"
```

and you should see the message Hello From GTAJava Vishal
