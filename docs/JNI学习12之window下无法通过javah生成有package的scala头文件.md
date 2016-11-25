
更多代码请见：https://github.com/xubo245

基因数据处理系列

# 1.解释

## 1.1 问题

	C:\all\idea\jni-maven-master\src\main\scala>javah -classpath C:/all/scala/scala-2.10.5/lib/*;org/jniLearning/factorial/. -jni Factorial
	错误: 找不到 'Factorial' 的类文件。


# 2.解决办法：

## 2.1 方法1
将文件移到当前路径下就可以了

但是要处理带包的问题，还是没解决，只是可以运行

	C:\all\idea\jni-maven-master\src\main\scala>dir
	 驱动器 C 中的卷没有标签。
	 卷的序列号是 88E4-E11C
	
	 C:\all\idea\jni-maven-master\src\main\scala 的目录
	
	2016/11/25  16:43    <DIR>          .
	2016/11/25  16:43    <DIR>          ..
	2016/11/25  16:43             1,075 Factorial$.class
	2016/11/25  16:43               905 Factorial.class
	2016/11/25  16:43               352 Factorial.scala
	2016/11/25  15:49    <DIR>          org
	               3 个文件          2,332 字节
	               3 个目录 140,516,483,072 可用字节
	
	C:\all\idea\jni-maven-master\src\main\scala>javah -classpath %SCALA_HOME%/lib/*;
	. -jni Factorial
	
	C:\all\idea\jni-maven-master\src\main\scala>dir
	 驱动器 C 中的卷没有标签。
	 卷的序列号是 88E4-E11C
	
	 C:\all\idea\jni-maven-master\src\main\scala 的目录
	
	2016/11/25  16:43    <DIR>          .
	2016/11/25  16:43    <DIR>          ..
	2016/11/25  16:43             1,075 Factorial$.class
	2016/11/25  16:43               905 Factorial.class
	2016/11/25  16:43               561 Factorial.h
	2016/11/25  16:43               352 Factorial.scala
	2016/11/25  15:49    <DIR>          org
	               4 个文件          2,893 字节
	               3 个目录 140,516,483,072 可用字节
## 2.2  方法2

加上包路径

	C:\all\idea\jni-maven-master\src\main\scala>javah -classpath %SCALA_HOME%/lib/*;. -jni org.jniLearning.factorial.Factorial
	
	C:\all\idea\jni-maven-master\src\main\scala>dir
	 驱动器 C 中的卷没有标签。
	 卷的序列号是 88E4-E11C
	
	 C:\all\idea\jni-maven-master\src\main\scala 的目录
	
	2016/11/25  16:50    <DIR>          .
	2016/11/25  16:50    <DIR>          ..
	2016/11/25  15:49    <DIR>          org
	2016/11/25  16:50               743 org_jniLearning_factorial_Factorial.h
	               1 个文件            743 字节
	               3 个目录 140,516,683,776 可用字节


参考

	【1】https://github.com/xubo245
	【2】http://blog.csdn.net/xubo245/
