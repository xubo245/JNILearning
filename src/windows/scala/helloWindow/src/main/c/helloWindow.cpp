// helloWindow.cpp : 定义 DLL 应用程序的导出函数。
//

#include "stdafx.h"
#include "helloWindow.h"
#include "jni.h"

JNIEXPORT jint JNICALL Java_helloWindow_add
(JNIEnv *, jobject obj, jint value1, jint value2){
	//printf("add scala ");
	return (value1 + value2);

}

/*
* Class:     helloWindow
* Method:    hello
* Signature: ()Ljava/lang/String;
*/
JNIEXPORT jstring JNICALL Java_helloWindow_hello
(JNIEnv * env, jobject){
	printf("hello scala ");
	return (*env).NewStringUTF("hello");

}



