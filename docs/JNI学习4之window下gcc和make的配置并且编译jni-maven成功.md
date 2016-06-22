更多代码请见：https://github.com/xubo245/JNILearning

同样的是运行jni-maven项目，window下本地也需要配置特别的环境
   
由于之前配置过MinGW，gcc成功了，但是找不到make：
    
	C:\Users\xubo>make -v
	'make' 不是内部或外部命令，也不是可运行的程序
	或批处理文件。
	
	C:\Users\xubo>gcc -v
	Using built-in specs.
	COLLECT_GCC=gcc
	COLLECT_LTO_WRAPPER=d:/1win7/mingw/bin/../libexec/gcc/mingw32/4.9.3/lto-wrapper.
	exe
	Target: mingw32
	Configured with: ../src/gcc-4.9.3/configure --build=x86_64-pc-linux-gnu --host=m
	ingw32 --prefix=/mingw --disable-win32-registry --target=mingw32 --with-arch=i58
	6 --enable-languages=c,c++,objc,obj-c++,fortran,ada --enable-static --enable-sha
	red --enable-threads --with-dwarf2 --disable-sjlj-exceptions --enable-version-sp
	ecific-runtime-libs --enable-libstdcxx-debug --with-tune=generic --enable-nls
	Thread model: win32
	gcc version 4.9.3 (GCC)

MinGW安装请参考【1】

make不成功原因：

	没有make.exe 

解决办法：

	拷贝MinGW/bin下的mingw-make.exe并重命名为make.exe 

我的安装路径为：

	D:\1win7\MinGW\bin

make可以使用了：

	C:\Users\xubo>make -v
	GNU Make 3.82.90
	Built for i686-pc-mingw32
	Copyright (C) 1988-2012 Free Software Foundation, Inc.
	License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>
	This is free software: you are free to change and redistribute it.
	There is NO WARRANTY, to the extent permitted by law.

window下jni-maven本地编译成功：

	[INFO] 
	[INFO] --- maven-jar-plugin:2.3.2:jar (default-jar) @ jni-maven ---
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 5.608s
	[INFO] Finished at: Tue Jun 21 22:36:17 CST 2016
	[INFO] Final Memory: 11M/165M
	[INFO] ------------------------------------------------------------------------

参考：
【1】 http://yuanzhifei89.iteye.com/blog/1955433

	
	
附录：

window下mvn package成功：
	
	D:\1win7\java\jdk\bin\java "-Dmaven.home=D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\plugins\maven\lib\maven3" "-Dclassworlds.conf=D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\plugins\maven\lib\maven3\bin\m2.conf" -Didea.launcher.port=7534 "-Didea.launcher.bin.path=D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\plugins\maven\lib\maven3\boot\plexus-classworlds-2.4.jar;D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain org.codehaus.classworlds.Launcher -Didea.version=15.0.4 package
	[INFO] Scanning for projects...
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building jni-maven 1.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ jni-maven ---
	[debug] execute contextualize
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory D:\all\idea\jni-maven-master\src\main\resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ jni-maven ---
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (default) @ jni-maven ---
	[INFO] Executing tasks
	
	jni:
	     [echo] Generating JNI headers
	     [exec] �Ҳ����ļ� - *.cpp
	     [exec] �Ҳ����ļ� - *.cpp
	     [exec] gcc -fPIC -shared  -o target/classes/libagisoft.so
	     [exec] �Ҳ����ļ� - *.cpp
	     [exec] Makefile:15: recipe for target 'target/classes/libagisoft.so' failed
	     [exec] gcc: fatal error: no input files
	     [exec] compilation terminated.
	     [exec] make: *** [target/classes/libagisoft.so] Error 1
	[INFO] Executed tasks
	[INFO] 
	[INFO] --- maven-resources-plugin:2.5:testResources (default-testResources) @ jni-maven ---
	     [exec] Result: 2
	[debug] execute contextualize
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory D:\all\idea\jni-maven-master\src\test\resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ jni-maven ---
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ jni-maven ---
	[INFO] Surefire report directory: D:\all\idea\jni-maven-master\target\surefire-reports
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Running ie.agisoft.AppTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.034 sec
	
	Results :
	
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
	
	[INFO] 
	[INFO] --- maven-jar-plugin:2.3.2:jar (default-jar) @ jni-maven ---
	[INFO] Building jar: D:\all\idea\jni-maven-master\target\jni-maven-1.0-SNAPSHOT.jar
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESS
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 7.415s
	[INFO] Finished at: Tue Jun 21 22:30:16 CST 2016
	[INFO] Final Memory: 10M/116M
	[INFO] ------------------------------------------------------------------------
	
	Process finished with exit code 0
	
	
编译不成功记录：
	
	D:\1win7\java\jdk\bin\java "-Dmaven.home=D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\plugins\maven\lib\maven3" "-Dclassworlds.conf=D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\plugins\maven\lib\maven3\bin\m2.conf" -Didea.launcher.port=7537 "-Didea.launcher.bin.path=D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\plugins\maven\lib\maven3\boot\plexus-classworlds-2.4.jar;D:\1win7\idea\IntelliJ IDEA Community Edition 15.0.4\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain org.codehaus.classworlds.Launcher -Didea.version=15.0.4 package -e
	[INFO] Error stacktraces are turned on.
	[INFO] Scanning for projects...
	[INFO]                                                                         
	[INFO] ------------------------------------------------------------------------
	[INFO] Building jni-maven 1.0-SNAPSHOT
	[INFO] ------------------------------------------------------------------------
	[INFO] 
	[INFO] --- maven-resources-plugin:2.5:resources (default-resources) @ jni-maven ---
	[debug] execute contextualize
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory D:\all\idea\jni-maven-master\src\main\resources
	[INFO] 
	[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ jni-maven ---
	[INFO] Nothing to compile - all classes are up to date
	[INFO] 
	[INFO] --- maven-antrun-plugin:1.7:run (default) @ jni-maven ---
	[INFO] Executing tasks
	
	jni:
	     [echo] Generating JNI headers
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD FAILURE
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 3.512s
	[INFO] Finished at: Tue Jun 21 22:32:00 CST 2016
	[INFO] Final Memory: 8M/115M
	[INFO] ------------------------------------------------------------------------
	[ERROR] Failed to execute goal org.apache.maven.plugins:maven-antrun-plugin:1.7:run (default) on project jni-maven: An Ant BuildException has occured: Execute failed: java.io.IOException: Cannot run program "make": CreateProcess error=2, ϵͳÕҲ»µ½ָ¶
	[ERROR] around Ant part ...<exec executable="make"></exec>... @ 13:27 in D:\all\idea\jni-maven-master\target\antrun\build-jni.xml
	[ERROR] -> [Help 1]
	org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-antrun-plugin:1.7:run (default) on project jni-maven: An Ant BuildException has occured: Execute failed: java.io.IOException: Cannot run program "make": CreateProcess error=2, ϵͳÕҲ»µ½ָ¶
	around Ant part ...<exec executable="make"></exec>... @ 13:27 in D:\all\idea\jni-maven-master\target\antrun\build-jni.xml
		at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:217)
		at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
		at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
		at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:84)
		at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:59)
		at org.apache.maven.lifecycle.internal.LifecycleStarter.singleThreadedBuild(LifecycleStarter.java:183)
		at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:161)
		at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:320)
		at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:156)
		at org.apache.maven.cli.MavenCli.execute(MavenCli.java:537)
		at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:196)
		at org.apache.maven.cli.MavenCli.main(MavenCli.java:141)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
		at java.lang.reflect.Method.invoke(Unknown Source)
		at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:290)
		at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:230)
		at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:409)
		at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:352)
		at org.codehaus.classworlds.Launcher.main(Launcher.java:47)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
		at java.lang.reflect.Method.invoke(Unknown Source)
		at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
	Caused by: org.apache.maven.plugin.MojoExecutionException: An Ant BuildException has occured: Execute failed: java.io.IOException: Cannot run program "make": CreateProcess error=2, ϵͳÕҲ»µ½ָ¶
	around Ant part ...<exec executable="make"></exec>... @ 13:27 in D:\all\idea\jni-maven-master\target\antrun\build-jni.xml
		at org.apache.maven.plugin.antrun.AntRunMojo.execute(AntRunMojo.java:355)
		at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:101)
		at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:209)
		... 25 more
	Caused by: D:\all\idea\jni-maven-master\target\antrun\build-jni.xml:13: Execute failed: java.io.IOException: Cannot run program "make": CreateProcess error=2, ϵͳÕҲ»µ½ָ¶
		at org.apache.tools.ant.taskdefs.ExecTask.runExec(ExecTask.java:675)
		at org.apache.tools.ant.taskdefs.ExecTask.execute(ExecTask.java:498)
		at org.apache.tools.ant.UnknownElement.execute(UnknownElement.java:291)
		at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
		at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
		at java.lang.reflect.Method.invoke(Unknown Source)
		at org.apache.tools.ant.dispatch.DispatchUtils.execute(DispatchUtils.java:106)
		at org.apache.tools.ant.Task.perform(Task.java:348)
		at org.apache.tools.ant.Target.execute(Target.java:390)
		at org.apache.tools.ant.Target.performTasks(Target.java:411)
		at org.apache.tools.ant.Project.executeSortedTargets(Project.java:1399)
		at org.apache.tools.ant.Project.executeTarget(Project.java:1368)
		at org.apache.maven.plugin.antrun.AntRunMojo.execute(AntRunMojo.java:327)
		... 27 more
	Caused by: java.io.IOException: Cannot run program "make": CreateProcess error=2, ϵͳÕҲ»µ½ָ¶
		at java.lang.ProcessBuilder.start(Unknown Source)
		at java.lang.Runtime.exec(Unknown Source)
		at org.apache.tools.ant.taskdefs.Execute$Java13CommandLauncher.exec(Execute.java:862)
		at org.apache.tools.ant.taskdefs.Execute.launch(Execute.java:481)
		at org.apache.tools.ant.taskdefs.Execute.execute(Execute.java:495)
		at org.apache.tools.ant.taskdefs.ExecTask.runExecute(ExecTask.java:631)
		at org.apache.tools.ant.taskdefs.ExecTask.runExec(ExecTask.java:672)
		... 40 more
	Caused by: java.io.IOException: CreateProcess error=2, ϵͳÕҲ»µ½ָ¶
		at java.lang.ProcessImpl.create(Native Method)
		at java.lang.ProcessImpl.<init>(Unknown Source)
		at java.lang.ProcessImpl.start(Unknown Source)
		... 47 more
	[ERROR] 
	[ERROR] Re-run Maven using the -X switch to enable full debug logging.
	[ERROR] 
	[ERROR] For more information about the errors and possible solutions, please read the following articles:
	[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
	
	Process finished with exit code 1
