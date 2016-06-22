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


