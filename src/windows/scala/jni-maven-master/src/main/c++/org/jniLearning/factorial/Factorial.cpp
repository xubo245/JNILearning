#include "stdafx.h"
#include <jni.h>
#include "org_jniLearning_factorial_Factorial.h"

JNIEXPORT jint JNICALL Java_org_jniLearning_factorial_Factorial_run
(JNIEnv * env, jobject obj, jint value1){
	int sum = 1;
	int i = 1;
	for (i = 1; i <= value1; i++){
		sum = sum*i;

	}
	return sum;
}


JNIEXPORT jstring JNICALL Java_org_jniLearning_factorial_Factorial_hello
(JNIEnv * env, jobject){
	return (*env).NewStringUTF("hello Factorial");
}