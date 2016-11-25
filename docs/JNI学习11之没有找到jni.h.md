
更多代码请见：https://github.com/xubo245

基因数据处理系列

# 1.解释

在vs下运行找不到jni.h


# 2.解决办法：

在%JAVA_HOME%/include/下找到 jni.h,在%JAVA_HOME%/include/win32/下找到jni_md.h,复制到“Visual Studio目录/VC/include/”下,即可解决问题 

# 3.结果：

![](http://i.imgur.com/CGrXVYh.png)

参考

	【1】https://github.com/xubo245
	【2】http://blog.csdn.net/xubo245/
