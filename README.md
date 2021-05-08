# SpringBoot


Session 1 : Dependency Injection

Focus on logic instead of object creation. The moment run() method called the spring container gets initialised and all the class anointed with @component and singleton scope having object is to be created. By default scope is the singleton. .i.e no matter how many times the getBean() method is called it will return the same instance instead of creating a new one. @Scope(Value=”protoype”) : this will create a new instance every time whenever getBean() method is called. Whenever you have given scope prototype , Then object creation will not happen at the time run() method called. i.e Spring container gets initialized but no object creation. It will happen whenever the getBean() method is called.But if the scope is the singleton then object creation will happen at the time of run() method is called. .Automatically wire up the dependency we use @Autowired annotation.

By default @Autowired goes with the byType. If we want to go with byName then we use @Qualifier .

For one simple example please refer https://www.youtube.com/watch?v=35EQXmHKZYs
