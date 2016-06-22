更多代码请见：https://github.com/xubo245/JNILearning

1.下载：
https://github.com/xubo245/HelloWorldJNIwithRegisterNatives

2.编译运行：

    sbt compile
    sbt run

3.运行记录（本地修改过）

	hadoop@Mcnode1:~/xubo/tools/JNI/HelloWorldJNIwithRegisterNatives$ ls
	build.sbt  Makefile.native  project  README  README.md  src  target
	hadoop@Mcnode1:~/xubo/tools/JNI/HelloWorldJNIwithRegisterNatives$ sbt compile
	[info] Set current project to HelloWorldJNIwithRegisterNatives (in build file:/home/hadoop/xubo/tools/JNI/HelloWorldJNIwithRegisterNatives/)
	make: Nothing to be done for `all'.
	[success] Total time: 1 s, completed Jun 17, 2016 8:57:31 PM
	hadoop@Mcnode1:~/xubo/tools/JNI/HelloWorldJNIwithRegisterNatives$ sbt run
	[info] Set current project to HelloWorldJNIwithRegisterNatives (in build file:/home/hadoop/xubo/tools/JNI/HelloWorldJNIwithRegisterNatives/)
	[info] Running org.digimead.HelloWorldJNIwithRegisterNatives 
	[info] java.library.path: ./target/so
	[info] Hello World! JNI:, 5 + 5 = 10
	[info] call hello...
	[info] call add...
	[success] Total time: 1 s, completed Jun 17, 2016 8:57:42 PM

4.代码：

	请见hadoop@Mcnode1:~/xubo/tools/JNI/HelloWorldJNIwithRegisterNatives$

