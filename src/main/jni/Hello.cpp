#include <jni.h>
#include "july_appn_July.h"
#include "log.h"
JNIEXPORT jstring JNICALL Java_july_appn_July_hello
        (JNIEnv *env, jclass thiz){
    LOGD("jni=%s","hello word");
    return env->NewStringUTF("hello lady.....");
}

