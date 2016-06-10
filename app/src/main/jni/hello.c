#include <string.h>
#include <jni.h>

jstring
Java_ph_edu_dlsu_hellondk_MainActivity_helloFromNDK(JNIEnv*pEnv, jobject pObj)
{
    return (*pEnv)->NewStringUTF(pEnv, "Hello from Native!\n \t\t - by mkc, 6/10/16");
}