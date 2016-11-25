
更多代码请见：https://github.com/xubo245

基因数据处理系列

# 1.解释

斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契数列以如下被以递归的方法定义：F(1)=1，F(2)=2, F(n)=F(n-1)+F(n-2)（n>2，n∈N*）




# 2.步骤：

## 2.1 实现Fibonacci.scala
idea中实现

	package org.jniLearning.utils
	
	/**
	  * Created by xubo on 2016/11/25.
	  * 运行时加上：
	  * -Djava.library.path=lib/.
	  */
	class Fibonacci {
	
	  @native
	  def compute(intput: Int): Int
	}
	
	object Fibonacci {
	  System.loadLibrary("Fibonacci")
	
	  def main(args: Array[String]) {
	    val fibonacci = new Fibonacci()
	    println(fibonacci.compute(10))
	  }
	
	  def run(input: Int): Int = {
	    val fibonacci = new Fibonacci
	    return fibonacci.compute(input)
	  }
	}

## 2.2 编译并生成.h头文件
cmd下

	C:\all\idea\jni-maven-master\src\main\scala>scalac org/jniLearning/utils/Fibonacci.scala
	
	C:\all\idea\jni-maven-master\src\main\scala>javah -classpath %SCALA_HOME%/lib/*;. -jni org.jniLearning.utils.Fibonacci
	
	C:\all\idea\jni-maven-master\src\main\scala>dir
	 驱动器 C 中的卷没有标签。
	 卷的序列号是 88E4-E11C
	
	 C:\all\idea\jni-maven-master\src\main\scala 的目录
	
	2016/11/25  19:02    <DIR>          .
	2016/11/25  19:02    <DIR>          ..
	2016/11/25  15:49    <DIR>          org
	2016/11/25  16:50               743 org_jniLearning_factorial_Factorial.h
	2016/11/25  19:02               514 org_jniLearning_utils_Fibonacci.h
	               2 个文件          1,257 字节
	               3 个目录 140,489,965,568 可用字节


## 2.3 实现Fibonacci.cpp
在visual studio 2013下实现，相关操作参考[JNI学习5之window下运行jni程序(java)](JNI学习5之window下运行jni程序(java).md),
需要将org_jniLearning_utils_Fibonacci.h拷贝到vs的头文件中，并添加；需要新建项目，配置x64等；然后重新生成方案，会有dll生成

	#include "stdafx.h"
	#include <jni.h>
	#include "org_jniLearning_utils_Fibonacci.h"
	
	JNIEXPORT jint JNICALL Java_org_jniLearning_utils_Fibonacci_compute
	(JNIEnv * env, jobject obj, jint value){
		if (value == 1){
			return 1;
		}
		else if (value == 2){
			return 2;
		}
		else{
			return Java_org_jniLearning_utils_Fibonacci_compute(env, obj, value - 1) + Java_org_jniLearning_utils_Fibonacci_compute(env, obj, value - 2);
		}
	
	}

## 2.4 将2.3中的dll拷贝到scala下，并进行调用运行

将2.3中的dll拷贝到lib包下，并改名为Fibonacci.dll，配置run configurations，输入：-Djava.library.path=lib/.

![](http://i.imgur.com/TpxTbfU.png)

运行：

![](http://i.imgur.com/9unNX39.png)

## 2.5 其他类中调用
FibonacciSuite.scala

	package org.jniLearning.utils
	
	/**
	  * Created by xubo on 2016/11/25.
	  * 运行时加上：
	  -Djava.library.path=lib/.
	  */
	object FibonacciSuite {
	  def main(args: Array[String]) {
	    val N = 100
	    for (i <- 1 to N) {
	      val start = System.currentTimeMillis()
	      val result = Fibonacci.run(i)
	      val end = System.currentTimeMillis()
	      println(i + ":" + result + " time=" + (end - start) + "ms")
	    }
	  }
	}



2.5运行结果：到46的时候已经出界
	
	1:1 time=2ms
	2:2 time=0ms
	3:3 time=0ms
	4:5 time=0ms
	5:8 time=0ms
	6:13 time=0ms
	7:21 time=0ms
	8:34 time=0ms
	9:55 time=0ms
	10:89 time=0ms
	11:144 time=0ms
	12:233 time=0ms
	13:377 time=0ms
	14:610 time=0ms
	15:987 time=0ms
	16:1597 time=0ms
	17:2584 time=0ms
	18:4181 time=0ms
	19:6765 time=1ms
	20:10946 time=0ms
	21:17711 time=0ms
	22:28657 time=0ms
	23:46368 time=1ms
	24:75025 time=1ms
	25:121393 time=1ms
	26:196418 time=2ms
	27:317811 time=3ms
	28:514229 time=7ms
	29:832040 time=11ms
	30:1346269 time=15ms
	31:2178309 time=24ms
	32:3524578 time=39ms
	33:5702887 time=61ms
	34:9227465 time=98ms
	35:14930352 time=169ms
	36:24157817 time=265ms
	37:39088169 time=427ms
	38:63245986 time=640ms
	39:102334155 time=1021ms
	40:165580141 time=1658ms
	41:267914296 time=2745ms
	42:433494437 time=4314ms
	43:701408733 time=6996ms
	44:1134903170 time=11296ms
	45:1836311903 time=18428ms
	46:-1323752223 time=29718ms
	47:512559680 time=48658ms
	48:-811192543 time=78281ms
	49:-298632863 time=126631ms
	50:-1109825406 time=204088ms
	
	Process finished with exit code -1

# 3.对比：
##3.1 说明

实现1：scala调用c  
实现2：Scala实现fibonacci
## 3.2代码

	package org.jniLearning.utils
	
	/**
	  * Created by xubo on 2016/11/25.
	  */
	object FibonacciScala {
	  def run(input: Int): Int = {
	    if (input == 1) {
	      1
	    } else if (input == 2) {
	      2
	    } else {
	      run(input - 1) + run(input - 2)
	    }
	  }
	}

对比代码：

package org.jniLearning.utils

	/**
	  * Created by xubo on 2016/11/25.
	  * 运行时加上：
	  -Djava.library.path=lib/.
	  */
	object FibonacciSuite {
	  def main(args: Array[String]) {
	    val N = 45
	    for (i <- 1 to N) {
	      val start = System.currentTimeMillis()
	      val result = Fibonacci.run(i)
	      val end = System.currentTimeMillis()
	      println("C    :"+i + ":" + result + " time=" + (end - start) + "ms")
	
	      val start2 = System.currentTimeMillis()
	      val result2 = FibonacciScala.run(i)
	      val end2 = System.currentTimeMillis()
	      println("Scala:"+i + ":" + result2 + " time=" + (end2 - start2) + "ms")
	
	    }
	  }
	}

##3.3 结果：
###第一次
	
	C    :1:1 time=1ms
	Scala:1:1 time=0ms
	C    :2:2 time=0ms
	Scala:2:2 time=0ms
	C    :3:3 time=0ms
	Scala:3:3 time=0ms
	C    :4:5 time=0ms
	Scala:4:5 time=0ms
	C    :5:8 time=0ms
	Scala:5:8 time=0ms
	C    :6:13 time=0ms
	Scala:6:13 time=0ms
	C    :7:21 time=0ms
	Scala:7:21 time=0ms
	C    :8:34 time=0ms
	Scala:8:34 time=0ms
	C    :9:55 time=0ms
	Scala:9:55 time=0ms
	C    :10:89 time=0ms
	Scala:10:89 time=0ms
	C    :11:144 time=0ms
	Scala:11:144 time=0ms
	C    :12:233 time=0ms
	Scala:12:233 time=0ms
	C    :13:377 time=0ms
	Scala:13:377 time=0ms
	C    :14:610 time=0ms
	Scala:14:610 time=0ms
	C    :15:987 time=0ms
	Scala:15:987 time=0ms
	C    :16:1597 time=0ms
	Scala:16:1597 time=0ms
	C    :17:2584 time=0ms
	Scala:17:2584 time=0ms
	C    :18:4181 time=0ms
	Scala:18:4181 time=0ms
	C    :19:6765 time=0ms
	Scala:19:6765 time=1ms
	C    :20:10946 time=0ms
	Scala:20:10946 time=0ms
	C    :21:17711 time=0ms
	Scala:21:17711 time=0ms
	C    :22:28657 time=1ms
	Scala:22:28657 time=0ms
	C    :23:46368 time=0ms
	Scala:23:46368 time=0ms
	C    :24:75025 time=1ms
	Scala:24:75025 time=0ms
	C    :25:121393 time=2ms
	Scala:25:121393 time=0ms
	C    :26:196418 time=2ms
	Scala:26:196418 time=0ms
	C    :27:317811 time=4ms
	Scala:27:317811 time=0ms
	C    :28:514229 time=7ms
	Scala:28:514229 time=1ms
	C    :29:832040 time=9ms
	Scala:29:832040 time=1ms
	C    :30:1346269 time=15ms
	Scala:30:1346269 time=3ms
	C    :31:2178309 time=24ms
	Scala:31:2178309 time=5ms
	C    :32:3524578 time=38ms
	Scala:32:3524578 time=6ms
	C    :33:5702887 time=61ms
	Scala:33:5702887 time=12ms
	C    :34:9227465 time=107ms
	Scala:34:9227465 time=17ms
	C    :35:14930352 time=183ms
	Scala:35:14930352 time=27ms
	C    :36:24157817 time=260ms
	Scala:36:24157817 time=39ms
	C    :37:39088169 time=395ms
	Scala:37:39088169 time=61ms
	C    :38:63245986 time=631ms
	Scala:38:63245986 time=101ms
	C    :39:102334155 time=1027ms
	Scala:39:102334155 time=162ms
	C    :40:165580141 time=1655ms
	Scala:40:165580141 time=267ms
	C    :41:267914296 time=2683ms
	Scala:41:267914296 time=424ms
	C    :42:433494437 time=4356ms
	Scala:42:433494437 time=686ms
	C    :43:701408733 time=7018ms
	Scala:43:701408733 time=1120ms
	C    :44:1134903170 time=11415ms
	Scala:44:1134903170 time=1796ms
	C    :45:1836311903 time=18191ms
	Scala:45:1836311903 time=2888ms

### 第二次
	
	C    :1:1 time=2ms
	Scala:1:1 time=1ms
	C    :2:2 time=0ms
	Scala:2:2 time=0ms
	C    :3:3 time=0ms
	Scala:3:3 time=0ms
	C    :4:5 time=0ms
	Scala:4:5 time=0ms
	C    :5:8 time=0ms
	Scala:5:8 time=0ms
	C    :6:13 time=0ms
	Scala:6:13 time=0ms
	C    :7:21 time=0ms
	Scala:7:21 time=0ms
	C    :8:34 time=0ms
	Scala:8:34 time=0ms
	C    :9:55 time=0ms
	Scala:9:55 time=0ms
	C    :10:89 time=0ms
	Scala:10:89 time=0ms
	C    :11:144 time=0ms
	Scala:11:144 time=0ms
	C    :12:233 time=0ms
	Scala:12:233 time=0ms
	C    :13:377 time=0ms
	Scala:13:377 time=0ms
	C    :14:610 time=0ms
	Scala:14:610 time=0ms
	C    :15:987 time=0ms
	Scala:15:987 time=0ms
	C    :16:1597 time=0ms
	Scala:16:1597 time=0ms
	C    :17:2584 time=0ms
	Scala:17:2584 time=0ms
	C    :18:4181 time=0ms
	Scala:18:4181 time=0ms
	C    :19:6765 time=1ms
	Scala:19:6765 time=0ms
	C    :20:10946 time=0ms
	Scala:20:10946 time=0ms
	C    :21:17711 time=1ms
	Scala:21:17711 time=0ms
	C    :22:28657 time=0ms
	Scala:22:28657 time=0ms
	C    :23:46368 time=1ms
	Scala:23:46368 time=0ms
	C    :24:75025 time=1ms
	Scala:24:75025 time=0ms
	C    :25:121393 time=2ms
	Scala:25:121393 time=1ms
	C    :26:196418 time=2ms
	Scala:26:196418 time=1ms
	C    :27:317811 time=3ms
	Scala:27:317811 time=0ms
	C    :28:514229 time=6ms
	Scala:28:514229 time=1ms
	C    :29:832040 time=8ms
	Scala:29:832040 time=2ms
	C    :30:1346269 time=15ms
	Scala:30:1346269 time=3ms
	C    :31:2178309 time=26ms
	Scala:31:2178309 time=5ms
	C    :32:3524578 time=37ms
	Scala:32:3524578 time=6ms
	C    :33:5702887 time=61ms
	Scala:33:5702887 time=10ms
	C    :34:9227465 time=105ms
	Scala:34:9227465 time=14ms
	C    :35:14930352 time=172ms
	Scala:35:14930352 time=25ms
	C    :36:24157817 time=262ms
	Scala:36:24157817 time=41ms
	C    :37:39088169 time=393ms
	Scala:37:39088169 time=62ms
	C    :38:63245986 time=650ms
	Scala:38:63245986 time=107ms
	C    :39:102334155 time=1052ms
	Scala:39:102334155 time=166ms
	C    :40:165580141 time=1712ms
	Scala:40:165580141 time=283ms
	C    :41:267914296 time=2709ms
	Scala:41:267914296 time=423ms
	C    :42:433494437 time=4293ms
	Scala:42:433494437 time=684ms
	C    :43:701408733 time=6889ms
	Scala:43:701408733 time=1111ms
	C    :44:1134903170 time=11137ms
	Scala:44:1134903170 time=1787ms
	C    :45:1836311903 time=18063ms
	Scala:45:1836311903 time=2896ms


第三次：
	
	C    :1:1 time=2ms
	Scala:1:1 time=1ms
	C    :2:2 time=0ms
	Scala:2:2 time=0ms
	C    :3:3 time=0ms
	Scala:3:3 time=0ms
	C    :4:5 time=0ms
	Scala:4:5 time=0ms
	C    :5:8 time=0ms
	Scala:5:8 time=0ms
	C    :6:13 time=0ms
	Scala:6:13 time=0ms
	C    :7:21 time=0ms
	Scala:7:21 time=0ms
	C    :8:34 time=0ms
	Scala:8:34 time=0ms
	C    :9:55 time=0ms
	Scala:9:55 time=0ms
	C    :10:89 time=0ms
	Scala:10:89 time=0ms
	C    :11:144 time=0ms
	Scala:11:144 time=0ms
	C    :12:233 time=0ms
	Scala:12:233 time=0ms
	C    :13:377 time=0ms
	Scala:13:377 time=0ms
	C    :14:610 time=0ms
	Scala:14:610 time=0ms
	C    :15:987 time=0ms
	Scala:15:987 time=0ms
	C    :16:1597 time=0ms
	Scala:16:1597 time=0ms
	C    :17:2584 time=0ms
	Scala:17:2584 time=1ms
	C    :18:4181 time=0ms
	Scala:18:4181 time=0ms
	C    :19:6765 time=0ms
	Scala:19:6765 time=0ms
	C    :20:10946 time=0ms
	Scala:20:10946 time=1ms
	C    :21:17711 time=0ms
	Scala:21:17711 time=0ms
	C    :22:28657 time=0ms
	Scala:22:28657 time=0ms
	C    :23:46368 time=1ms
	Scala:23:46368 time=0ms
	C    :24:75025 time=1ms
	Scala:24:75025 time=0ms
	C    :25:121393 time=1ms
	Scala:25:121393 time=0ms
	C    :26:196418 time=3ms
	Scala:26:196418 time=0ms
	C    :27:317811 time=3ms
	Scala:27:317811 time=1ms
	C    :28:514229 time=6ms
	Scala:28:514229 time=2ms
	C    :29:832040 time=9ms
	Scala:29:832040 time=2ms
	C    :30:1346269 time=14ms
	Scala:30:1346269 time=3ms
	C    :31:2178309 time=25ms
	Scala:31:2178309 time=4ms
	C    :32:3524578 time=38ms
	Scala:32:3524578 time=6ms
	C    :33:5702887 time=66ms
	Scala:33:5702887 time=10ms
	C    :34:9227465 time=102ms
	Scala:34:9227465 time=16ms
	C    :35:14930352 time=168ms
	Scala:35:14930352 time=26ms
	C    :36:24157817 time=261ms
	Scala:36:24157817 time=40ms
	C    :37:39088169 time=415ms
	Scala:37:39088169 time=61ms
	C    :38:63245986 time=632ms
	Scala:38:63245986 time=107ms
	C    :39:102334155 time=1031ms
	Scala:39:102334155 time=164ms
	C    :40:165580141 time=1646ms
	Scala:40:165580141 time=266ms
	C    :41:267914296 time=2754ms
	Scala:41:267914296 time=463ms
	C    :42:433494437 time=4349ms
	Scala:42:433494437 time=687ms
	C    :43:701408733 time=7007ms
	Scala:43:701408733 time=1115ms
	C    :44:1134903170 time=11406ms
	Scala:44:1134903170 time=1800ms
	C    :45:1836311903 time=18215ms
	Scala:45:1836311903 time=2910ms

结论：三次运行，可以看的出来，scala调用c实现fibonacci比只使用scala实现慢很多，到后面能差六七倍


参考

	【1】https://github.com/xubo245
	【2】http://blog.csdn.net/xubo245/
