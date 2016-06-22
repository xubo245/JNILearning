
1.指令：

	git clone https://github.com/gkubisa/jni-maven.git jni-maven
	cd jni-maven
	mvn package
	java -cp target/jni-maven-1.0-SNAPSHOT.jar ie.agisoft.App

2.编译成功

	[INFO] [jar:jar {execution: default-jar}]
	[INFO] Building jar: /home/hadoop/xubo/tools/JNI/jni-maven/target/jni-maven-1.0-SNAPSHOT.jar
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESSFUL
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 6 minutes 10 seconds
	[INFO] Finished at: Tue Jun 21 21:57:11 CST 2016
	[INFO] Final Memory: 19M/114M
	[INFO] ------------------------------------------------------------------------
	

3.运行成功：
	
	hadoop@Mcnode1:~/xubo/tools/JNI/jni-maven$ java -cp target/jni-maven-1.0-SNAPSHOT.jar ie.agisoft.App
	Hello World!
	Hello World
	__cplusplus is defined

参考：
【1】 https://github.com/xubo245/jni-maven

附录：
编译记录：

	hadoop@Mcnode1:~/xubo/tools/JNI/jni-maven$ mvn package
	[INFO] Scanning for projects...
	[INFO] ------------------------------------------------------------------------
	[INFO] Building jni-maven
	[INFO]    task-segment: [package]
	[INFO] ------------------------------------------------------------------------
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-resources-plugin/2.3/maven-resources-plugin-2.3.pom
	4K downloaded  (maven-resources-plugin-2.3.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-plugins/12/maven-plugins-12.pom
	11K downloaded  (maven-plugins-12.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-parent/9/maven-parent-9.pom
	32K downloaded  (maven-parent-9.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-resources-plugin/2.3/maven-resources-plugin-2.3.jar
	20K downloaded  (maven-resources-plugin-2.3.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/2.5.1/maven-compiler-plugin-2.5.1.pom
	7K downloaded  (maven-compiler-plugin-2.5.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-plugins/22/maven-plugins-22.pom
	12K downloaded  (maven-plugins-22.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/2.5.1/maven-compiler-plugin-2.5.1.jar
	31K downloaded  (maven-compiler-plugin-2.5.1.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.10/maven-surefire-plugin-2.10.pom
	10K downloaded  (maven-surefire-plugin-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire/2.10/surefire-2.10.pom
	11K downloaded  (surefire-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-parent/20/maven-parent-20.pom
	24K downloaded  (maven-parent-20.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/apache/9/apache-9.pom
	14K downloaded  (apache-9.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.10/maven-surefire-plugin-2.10.jar
	29K downloaded  (maven-surefire-plugin-2.10.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-jar-plugin/2.3.2/maven-jar-plugin-2.3.2.pom
	5K downloaded  (maven-jar-plugin-2.3.2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-plugins/21/maven-plugins-21.pom
	12K downloaded  (maven-plugins-21.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-jar-plugin/2.3.2/maven-jar-plugin-2.3.2.jar
	31K downloaded  (maven-jar-plugin-2.3.2.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/1.7/maven-antrun-plugin-1.7.pom
	4K downloaded  (maven-antrun-plugin-1.7.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/1.7/maven-antrun-plugin-1.7.jar
	30K downloaded  (maven-antrun-plugin-1.7.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-beta-2/wagon-provider-api-1.0-beta-2.pom
	680b downloaded  (wagon-provider-api-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon/1.0-beta-2/wagon-1.0-beta-2.pom
	5K downloaded  (wagon-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-parent/4/maven-parent-4.pom
	9K downloaded  (maven-parent-4.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/shared/maven-filtering/1.0-beta-2/maven-filtering-1.0-beta-2.pom
	3K downloaded  (maven-filtering-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/shared/maven-shared-components/10/maven-shared-components-10.pom
	8K downloaded  (maven-shared-components-10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-file/1.0-beta-2/wagon-file-1.0-beta-2.pom
	637b downloaded  (wagon-file-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-providers/1.0-beta-2/wagon-providers-1.0-beta-2.pom
	1K downloaded  (wagon-providers-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-http-lightweight/1.0-beta-2/wagon-http-lightweight-1.0-beta-2.pom
	1K downloaded  (wagon-http-lightweight-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-http-shared/1.0-beta-2/wagon-http-shared-1.0-beta-2.pom
	845b downloaded  (wagon-http-shared-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/jtidy/jtidy/4aug2000r7-dev/jtidy-4aug2000r7-dev.pom
	1K downloaded  (jtidy-4aug2000r7-dev.pom)
	Downloading: http://repo1.maven.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom
	2K downloaded  (xml-apis-1.0.b2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-ssh-external/1.0-beta-2/wagon-ssh-external-1.0-beta-2.pom
	1K downloaded  (wagon-ssh-external-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-ssh-common/1.0-beta-2/wagon-ssh-common-1.0-beta-2.pom
	851b downloaded  (wagon-ssh-common-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-7/plexus-container-default-1.0-alpha-7.pom
	1K downloaded  (plexus-container-default-1.0-alpha-7.pom)
	Downloading: http://repo1.maven.org/maven2/plexus/plexus-containers/1.0.2/plexus-containers-1.0.2.pom
	471b downloaded  (plexus-containers-1.0.2.pom)
	Downloading: http://repo1.maven.org/maven2/plexus/plexus-root/1.0.3/plexus-root-1.0.3.pom
	5K downloaded  (plexus-root-1.0.3.pom)
	Downloading: http://repo1.maven.org/maven2/plexus/plexus-utils/1.0.2/plexus-utils-1.0.2.pom
	740b downloaded  (plexus-utils-1.0.2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-ssh/1.0-beta-2/wagon-ssh-1.0-beta-2.pom
	1K downloaded  (wagon-ssh-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/com/jcraft/jsch/0.1.27/jsch-0.1.27.pom
	965b downloaded  (jsch-0.1.27.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-interpolation/1.6/plexus-interpolation-1.6.pom
	2K downloaded  (plexus-interpolation-1.6.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/1.5.6/plexus-utils-1.5.6.jar
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/shared/maven-filtering/1.0-beta-2/maven-filtering-1.0-beta-2.jar
	32K downloaded  (maven-filtering-1.0-beta-2.jar)
	244K downloaded  (plexus-utils-1.5.6.jar)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-interpolation/1.6/plexus-interpolation-1.6.jar
	49K downloaded  (plexus-interpolation-1.6.jar)
	[INFO] [resources:resources {execution: default-resources}]
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /home/hadoop/xubo/tools/JNI/jni-maven/src/main/resources
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/wagon/wagon-webdav/1.0-beta-2/wagon-webdav-1.0-beta-2.pom
	1K downloaded  (wagon-webdav-1.0-beta-2.pom)
	Downloading: http://repo1.maven.org/maven2/slide/slide-webdavlib/2.1/slide-webdavlib-2.1.pom
	648b downloaded  (slide-webdavlib-2.1.pom)
	Downloading: http://repo1.maven.org/maven2/commons-httpclient/commons-httpclient/2.0.2/commons-httpclient-2.0.2.pom
	6K downloaded  (commons-httpclient-2.0.2.pom)
	Downloading: http://repo1.maven.org/maven2/commons-logging/commons-logging/1.0.3/commons-logging-1.0.3.pom
	866b downloaded  (commons-logging-1.0.3.pom)
	Downloading: http://repo1.maven.org/maven2/jdom/jdom/1.0/jdom-1.0.pom
	1K downloaded  (jdom-1.0.pom)
	Downloading: http://repo1.maven.org/maven2/de/zeigermann/xml/xml-im-exporter/1.1/xml-im-exporter-1.1.pom
	248b downloaded  (xml-im-exporter-1.1.pom)
	Downloading: http://repo1.maven.org/maven2/commons-logging/commons-logging/1.0.4/commons-logging-1.0.4.pom
	5K downloaded  (commons-logging-1.0.4.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-toolchain/1.0/maven-toolchain-1.0.pom
	3K downloaded  (maven-toolchain-1.0.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.9.1/plexus-compiler-api-1.9.1.pom
	867b downloaded  (plexus-compiler-api-1.9.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler/1.9.1/plexus-compiler-1.9.1.pom
	3K downloaded  (plexus-compiler-1.9.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-components/1.1.20/plexus-components-1.1.20.pom
	2K downloaded  (plexus-components-1.1.20.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus/3.1/plexus-3.1.pom
	18K downloaded  (plexus-3.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler-manager/1.9.1/plexus-compiler-manager-1.9.1.pom
	692b downloaded  (plexus-compiler-manager-1.9.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler-javac/1.9.1/plexus-compiler-javac-1.9.1.pom
	688b downloaded  (plexus-compiler-javac-1.9.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compilers/1.9.1/plexus-compilers-1.9.1.pom
	1K downloaded  (plexus-compilers-1.9.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler-api/1.9.1/plexus-compiler-api-1.9.1.jar
	20K downloaded  (plexus-compiler-api-1.9.1.jar)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler-manager/1.9.1/plexus-compiler-manager-1.9.1.jar
	4K downloaded  (plexus-compiler-manager-1.9.1.jar)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-compiler-javac/1.9.1/plexus-compiler-javac-1.9.1.jar
	13K downloaded  (plexus-compiler-javac-1.9.1.jar)
	[INFO] [compiler:compile {execution: default-compile}]
	[INFO] Compiling 3 source files to /home/hadoop/xubo/tools/JNI/jni-maven/target/classes
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-plugin-api/2.0.11/maven-plugin-api-2.0.11.pom
	1K downloaded  (maven-plugin-api-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven/2.0.11/maven-2.0.11.pom
	21K downloaded  (maven-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-parent/12/maven-parent-12.pom
	21K downloaded  (maven-parent-12.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-project/2.0.11/maven-project-2.0.11.pom
	2K downloaded  (maven-project-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-settings/2.0.11/maven-settings-2.0.11.pom
	2K downloaded  (maven-settings-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-model/2.0.11/maven-model-2.0.11.pom
	3K downloaded  (maven-model-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-interpolation/1.1/plexus-interpolation-1.1.pom
	1K downloaded  (plexus-interpolation-1.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-profile/2.0.11/maven-profile-2.0.11.pom
	1K downloaded  (maven-profile-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-artifact-manager/2.0.11/maven-artifact-manager-2.0.11.pom
	2K downloaded  (maven-artifact-manager-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-repository-metadata/2.0.11/maven-repository-metadata-2.0.11.pom
	2K downloaded  (maven-repository-metadata-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-artifact/2.0.11/maven-artifact-2.0.11.pom
	1K downloaded  (maven-artifact-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-plugin-registry/2.0.11/maven-plugin-registry-2.0.11.pom
	1K downloaded  (maven-plugin-registry-2.0.11.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom
	3K downloaded  (plexus-utils-2.0.5.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
	16K downloaded  (plexus-2.0.6.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/ant/ant/1.8.2/ant-1.8.2.pom
	9K downloaded  (ant-1.8.2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/ant/ant-parent/1.8.2/ant-parent-1.8.2.pom
	4K downloaded  (ant-parent-1.8.2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/ant/ant-launcher/1.8.2/ant-launcher-1.8.2.pom
	2K downloaded  (ant-launcher-1.8.2.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.jar
	Downloading: http://repo1.maven.org/maven2/org/apache/ant/ant/1.8.2/ant-1.8.2.jar
	217K downloaded  (plexus-utils-2.0.5.jar)
	1888K downloaded  (ant-1.8.2.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/ant/ant-launcher/1.8.2/ant-launcher-1.8.2.jar
	12K downloaded  (ant-launcher-1.8.2.jar)
	[INFO] [antrun:run {execution: default}]
	[INFO] Executing tasks
	
	jni:
	     [echo] Generating JNI headers
	     [exec] gcc -fPIC -shared target/c++/ie_agisoft_Test.o -o target/classes/libagisoft.so
	[INFO] Executed tasks
	[INFO] [resources:testResources {execution: default-testResources}]
	[INFO] Using 'UTF-8' encoding to copy filtered resources.
	[INFO] skip non existing resourceDirectory /home/hadoop/xubo/tools/JNI/jni-maven/src/test/resources
	[INFO] [compiler:testCompile {execution: default-testCompile}]
	[INFO] Compiling 1 source file to /home/hadoop/xubo/tools/JNI/jni-maven/target/test-classes
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-booter/2.10/surefire-booter-2.10.pom
	2K downloaded  (surefire-booter-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-api/2.10/surefire-api-2.10.pom
	2K downloaded  (surefire-api-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.10/maven-surefire-common-2.10.pom
	3K downloaded  (maven-surefire-common-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-toolchain/2.0.9/maven-toolchain-2.0.9.pom
	3K downloaded  (maven-toolchain-2.0.9.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/1.3/maven-common-artifact-filters-1.3.pom
	3K downloaded  (maven-common-artifact-filters-1.3.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/2.1/plexus-utils-2.1.jar
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-booter/2.10/surefire-booter-2.10.jar
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/1.3/maven-common-artifact-filters-1.3.jar
	30K downloaded  (maven-common-artifact-filters-1.3.jar)
	33K downloaded  (surefire-booter-2.10.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-api/2.10/surefire-api-2.10.jar
	157K downloaded  (surefire-api-2.10.jar)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.10/maven-surefire-common-2.10.jar
	59K downloaded  (maven-surefire-common-2.10.jar)
	219K downloaded  (plexus-utils-2.1.jar)
	[INFO] [surefire:test {execution: default-test}]
	[INFO] Surefire report directory: /home/hadoop/xubo/tools/JNI/jni-maven/target/surefire-reports
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-junit3/2.10/surefire-junit3-2.10.pom
	1K downloaded  (surefire-junit3-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-providers/2.10/surefire-providers-2.10.pom
	2K downloaded  (surefire-providers-2.10.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/surefire/surefire-junit3/2.10/surefire-junit3-2.10.jar
	25K downloaded  (surefire-junit3-2.10.jar)
	
	-------------------------------------------------------
	 T E S T S
	-------------------------------------------------------
	Running ie.agisoft.AppTest
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.067 sec
	
	Results :
	
	Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
	
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-archiver/2.4.2/maven-archiver-2.4.2.pom
	3K downloaded  (maven-archiver-2.4.2.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/shared/maven-shared-components/16/maven-shared-components-16.pom
	8K downloaded  (maven-shared-components-16.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-parent/19/maven-parent-19.pom
	24K downloaded  (maven-parent-19.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-archiver/2.0.1/plexus-archiver-2.0.1.pom
	2K downloaded  (plexus-archiver-2.0.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-io/2.0.1/plexus-io-2.0.1.pom
	1K downloaded  (plexus-io-2.0.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.pom
	890b downloaded  (plexus-interpolation-1.13.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-components/1.1.15/plexus-components-1.1.15.pom
	2K downloaded  (plexus-components-1.1.15.pom)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus/2.0.3/plexus-2.0.3.pom
	15K downloaded  (plexus-2.0.3.pom)
	Downloading: http://repo1.maven.org/maven2/commons-lang/commons-lang/2.1/commons-lang-2.1.pom
	9K downloaded  (commons-lang-2.1.pom)
	Downloading: http://repo1.maven.org/maven2/org/apache/maven/maven-archiver/2.4.2/maven-archiver-2.4.2.jar
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-archiver/2.0.1/plexus-archiver-2.0.1.jar
	Downloading: http://repo1.maven.org/maven2/commons-lang/commons-lang/2.1/commons-lang-2.1.jar
	19K downloaded  (maven-archiver-2.4.2.jar)
	202K downloaded  (commons-lang-2.1.jar)
	175K downloaded  (plexus-archiver-2.0.1.jar)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-io/2.0.1/plexus-io-2.0.1.jar
	56K downloaded  (plexus-io-2.0.1.jar)
	Downloading: http://repo1.maven.org/maven2/org/codehaus/plexus/plexus-interpolation/1.13/plexus-interpolation-1.13.jar
	59K downloaded  (plexus-interpolation-1.13.jar)
	[INFO] [jar:jar {execution: default-jar}]
	[INFO] Building jar: /home/hadoop/xubo/tools/JNI/jni-maven/target/jni-maven-1.0-SNAPSHOT.jar
	[INFO] ------------------------------------------------------------------------
	[INFO] BUILD SUCCESSFUL
	[INFO] ------------------------------------------------------------------------
	[INFO] Total time: 6 minutes 10 seconds
	[INFO] Finished at: Tue Jun 21 21:57:11 CST 2016
	[INFO] Final Memory: 19M/114M
	[INFO] ------------------------------------------------------------------------
	hadoop@Mcnode1:~/xubo/tools/JNI/jni-maven$ 
