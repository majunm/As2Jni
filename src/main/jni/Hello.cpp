#include <jni.h>
#include "july_appn_July.h"
JNIEXPORT jstring JNICALL Java_july_appn_July_hello
        (JNIEnv *env, jclass thiz){
    return env->NewStringUTF("hello lady.....");
}

