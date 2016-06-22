更多代码请见：https://github.com/xubo245/JNILearning

1.新建java文件printN.java：

路径：hadoop@Mcnode1:~/xubo/tools/JNI/javaJNI/printN$ cat org/jni/java/printN.java 

代码：

	package org.jni.java;
	
	/**
	 * Created by xubo on 2016/6/22.
	 */
	public class printN {
	    public native void print20();
	    static {
	        try {
	            System.loadLibrary("jniTest");
	        } catch (Exception e) {
	            System.err.println(e);
	            System.exit(1);
	        }
	    }
	}

2.编译和javah生成头文件：

	javac org/jni/java/printN.java
	javah org.jni.java.printN 

结果：

hadoop@Mcnode1:~/xubo/tools/JNI/javaJNI/printN$ javah org.jni.java.printN
hadoop@Mcnode1:~/xubo/tools/JNI/javaJNI/printN$ ll
total 16
drwxrwxr-x 3 hadoop hadoop 4096  6月 22 20:57 ./
drwxrwxr-x 4 hadoop hadoop 4096  6月 22 20:54 ../
drwxrwxr-x 3 hadoop hadoop 4096  6月 22 20:56 org/
-rw-rw-r-- 1 hadoop hadoop  426  6月 22 20:57 org_jni_java_printN.h

3.编写cpp文件jniTest.cpp ：


	#include <jni.h>
	#include <stdio.h>
	#include "org_jni_java_printN.h"
	
	JNIEXPORT void JNICALL Java_org_jni_java_printN_print20(JNIEnv *, jobject){
		printf("\nfor start\n");
		for (int i = 1; i < 20; i++){
			printf("\n%d", i);
		}
		printf("\nfor end\n");
	#ifdef __cplusplus
		printf("__cplusplus is defined\n");
	#else
		printf("__cplusplus is NOT defined\n");
	#endif
		return;
	}

4.生成so文件：

	gcc -shared -I $JAVA_HOME/include -I $JAVA_HOME/include/linux -fPIC  jniTest.cpp -o libjniTest.so

5.编写测试文件：printNTest.java

路径：
hadoop@Mcnode1:~/xubo/tools/JNI/javaJNI/printN$ cat org/jni/java/printNTest.java 

代码：

	package org.jni.java;
	
	/**
	 * Created by xubo on 2016/6/22.
	 */
	public class printNTest {
	    public static void main(String[] args) {
	        printN p1=new printN();
	        p1.print20();
	    }
	}

6.执行：

	hadoop@Mcnode1:~/xubo/tools/JNI/javaJNI/printN$ javac org/jni/java/printNTest.java 
	hadoop@Mcnode1:~/xubo/tools/JNI/javaJNI/printN$ java -Djava.library.path=.  org.jni.java.printNTest
	
	for start
	
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	11
	12
	13
	14
	15
	16
	17
	18
	19
	for end
	__cplusplus is defined


更多代码请见：

https://github.com/xubo245/JNILearning