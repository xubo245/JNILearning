
之前总是报错：

java.lang.UnsatisfiedLinkError: no bwa in java.library.path

解决办法：
在系统中加入：java.library.path

步骤：

	vi /etc/profile

加入

	export LD_LIBRARY_PATH=/home/hadoop/xubo/tools/SparkBWA/build:$LD_LIBRARY_PATH

使生效：

	source /etc/profile

然后就可以运行SparkBWA的local模式了：
	
	[Java_BwaJni_bwa_1jni] Arg 0 'bwa'
	[Java_BwaJni_bwa_1jni] Algorithm found 1 'mem'
	[Java_BwaJni_bwa_1jni] Arg 1 'mem'
	[Java_BwaJni_bwa_1jni] Filename parameter -f found 2 '-f'
	[Java_BwaJni_bwa_1jni] Arg 2 '-f'
	[Java_BwaJni_bwa_1jni] Filename found 3 '/home/hadoop/cloud/workspace/tmpSparkBWA_GRCH38chr1L3556522N10L50paired1.fastq-4-NoSort-local-1466759288766-0.sam'
	[Java_BwaJni_bwa_1jni] Arg 3 '/home/hadoop/cloud/workspace/tmpSparkBWA_GRCH38chr1L3556522N10L50paired1.fastq-4-NoSort-local-1466759288766-0.sam'
	[Java_BwaJni_bwa_1jni] Arg 4 '/home/hadoop/xubo/ref/GRCH38L1Index/GRCH38chr1L3556522.fasta'
	[Java_BwaJni_bwa_1jni] Arg 5 '/home/hadoop/cloud/workspace/tmplocal-1466759288766-RDD0_1'
	[Java_BwaJni_bwa_1jni] Arg 6 '/home/hadoop/cloud/workspace/tmplocal-1466759288766-RDD0_2'
	[Java_BwaJni_bwa_1jni] option[0]: bwa.
	[Java_BwaJni_bwa_1jni] option[1]: mem.
	[Java_BwaJni_bwa_1jni] option[2]: /home/hadoop/xubo/ref/GRCH38L1Index/GRCH38chr1L3556522.fasta.
	[Java_BwaJni_bwa_1jni] option[3]: /home/hadoop/cloud/workspace/tmplocal-1466759288766-RDD0_1.
	[Java_BwaJni_bwa_1jni] option[4]: /home/hadoop/cloud/workspace/tmplocal-1466759288766-RDD0_2.
	[M::bwa_idx_load_from_disk] read 0 ALT contigs
	/usr/lib/jvm/jdk1.7.0/bin/java: symbol lookup error: /home/hadoop/xubo/tools/SparkBWA/build/libbwa.so: undefined symbol: gzdopen

其他情况请参考【2】  

参考：
【1】http://james23dier.iteye.com/blog/763274
【2】http://blog.csdn.net/larrylgq/article/details/7515362
【3】http://blog.sina.com.cn/s/blog_48a45b9501015m7v.html