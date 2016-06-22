#include <jni.h>  
#include <stdio.h>  
#include "HelloWorld.h"  
JNIEXPORT void JNICALL Java_HelloWorld_print  
  (JNIEnv *env, jobject obj)  
{  
        printf("HelloWorld JNI!/n");  
        return;  
} 
