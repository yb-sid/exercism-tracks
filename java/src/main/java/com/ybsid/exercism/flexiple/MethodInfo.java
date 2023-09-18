package com.ybsid.exercism.flexiple;

import java.util.List;

record MethodInfo(String name , boolean isAbstract , List<Class> args, Class returnType){
}
