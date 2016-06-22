// jniTest.cpp : 定义 DLL 应用程序的导出函数。
//

#include "stdafx.h"
#include <jni.h>
#include <stdio.h>
#include "ie_agisoft_printN.h"
#include "org_jni_java_printN.h"

JNIEXPORT void JNICALL Java_ie_agisoft_printN_printN(JNIEnv *, jobject){
	printf("Hello World\n");
	printf("hello print N");
	for (int i = 1; i < 10; i++){
		printf("\n%d",i);
	}
	printf("\nfor end\n");


#ifdef __cplusplus
	printf("__cplusplus is defined\n");
#else
	printf("__cplusplus is NOT defined\n");
#endif
	return;
}

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

