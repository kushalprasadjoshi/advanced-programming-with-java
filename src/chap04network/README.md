## RMI (Remote Method Invocation)

- RMI enables a method in one Java program to be called from another program running on a different computer over a network.

Remote Method Invocation (RMI) is a Java API that allows objects to communicate and invoke methods across a network. With RMI, a Java program can call methods on an object located on a different Java Virtual Machine (JVM), possibly on a remote server. RMI handles the details of network communication, object serialization, and remote object references, making distributed computing in Java more straightforward. It is commonly used for building distributed applications where components need to interact over a network.

### Steps

1. Create a remote (e.g. `MyRemote`) interface by inheriting from `Remote` present in `java.rmi`. Methods should throw `RemoteException`.

2. Create an implementation class (e.g. `MyRemoteImp`) that implements the created remote interface (`MyRemote`) and extends `UnicastRemoteObject` present in `java.rmi.server`.

3. Create a server class (e.g. `MyRemoteServer`) which bind the object.
```java 
MyRemoteImp obj = new MyRemoteImp(); // Create the object
LocateRegistry.createRegistry(1099); // Start the RMI registry
Naming.rebind("MY_OBJECT", obj); // param1 is unique id and param2 is object
```

4. Create a client class (e.g. `RMIClient`) which should call the remote method.
```java
MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/MY_OBJECT");
```

### Example

**MyRemote.java**
```java
package chap04network.rmi;

import java.rmi.*;

public interface MyRemote extends Remote{
    public int add(int a, int b) throws RemoteException;
}
```

**MyRemoteImp.java**
```java
package chap04network.rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImp() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
```

**MyRemoteServer.java**
```java
package chap04network.rmi;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class MyRemoteServer {
    public static void main(String[] args) throws Exception {
        MyRemoteImp obj = new MyRemoteImp();
        LocateRegistry.createRegistry(1099);
        System.out.println("RMI registry started .....");
        Naming.rebind("MY_OBJECT", obj);
    }
}
```

**RMIClient.java**
```java
package chap04network.rmi;

import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) throws Exception{
        MyRemote obj = (MyRemote) Naming.lookup("rmi://localhost/MY_OBJECT");
        System.out.println("Result from remote call: " + obj.add(3, 5));
    }
}
```

#### Output

First run the **MyRemoteServer.java**

```output
RMI registry started .....

```

After that run the **RMIClient.java**

```output
Result from remote call: 8

```

---