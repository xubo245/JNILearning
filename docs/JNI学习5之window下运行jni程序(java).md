更多代码请见：https://github.com/xubo245/JNILearning

1.使用vs2013新建win32程序，选择dll

2.在项目，右键属性，将平台win32改为x64
并且在常规中间exe改为dll


3.在项目，右键属性，C++目录，include 目录中添加jdk下的include和include下的win32

4.编写代码

5.生成dll ：生成 =》生成解决方案

6.将dll copy到jdk下的bin目录，并且改成相对应的名称

7运行jni-maven：
（1） cmd
	
编译：

	javac ie/agisoft/App.java
	
运行：java ie.agisoft.App
	
	D:\all\idea\jni-maven-master\src\main\java>java ie.agisoft.App
	Hello World!
	Hello World
	__cplusplus is defined


（2）idea中：直接运行App

	Hello World!
	Hello World
	__cplusplus is defined
	
	Process finished with exit code 0

8.遇到的问题
（1） vs2015不知道怎么使用，而且卡，笔记本上的卸了，用台式机vs2013

（2）编译生成的dll为32位的，需要按照步骤2改成64位

	D:\all\idea\jni-maven-master\src\main\java>java ie.agisoft.App
	Hello World!
	Exception in thread "main" java.lang.UnsatisfiedLinkError: C:\Users\xubo\AppData
	\Local\Temp\agisoft96496562573388881.dll: Can't load IA 32-bit .dll on a AMD 64-
	bit platform
	        at java.lang.ClassLoader$NativeLibrary.load(Native Method)
	        at java.lang.ClassLoader.loadLibrary1(Unknown Source)
	        at java.lang.ClassLoader.loadLibrary0(Unknown Source)
	        at java.lang.ClassLoader.loadLibrary(Unknown Source)
	        at java.lang.Runtime.load0(Unknown Source)
	        at java.lang.System.load(Unknown Source)
	        at ie.agisoft.LibraryLoader.loadLibrary(LibraryLoader.java:46)
	        at ie.agisoft.Test.<clinit>(Test.java:9)
	        at ie.agisoft.App.main(App.java:11)

(3)使用gcc编译没有成功

（4）没有加入dll时运行app会有空指针异常

参考:

深入浅出JNI  第一讲 
1.  JNI (Java Native Interface)，Java 本地接口. 
2.  native 关键字：使用native 所修饰的方法为本地方法，该方法只有声明，没有实现，表
示该实现是由c/c++来提供的。 
3.  jni 本质上就是java 代码来调用动态链接库的过程（在Windows 上，动态链接库就是一
个dll 文件，在Linux 上，动态链接库是一个so 文件，如果在Linux 上，那么调用的动态
链接库文件名必须以lib 开始） 