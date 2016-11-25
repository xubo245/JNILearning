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
