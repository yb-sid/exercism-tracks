package com.ybsid.exercism.flexiple;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MethodListHelper {

    public Collection<MethodInfo> listMethods(Class<?> aClass, boolean includeAbstract, boolean includeSuperclass) {
        List<MethodInfo> methodInfos = new ArrayList<>();

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            if (includeAbstract || !java.lang.reflect.Modifier.isAbstract(method.getModifiers())) {
                List<Class> parameterTypes = List.of(method.getParameterTypes());
                Class<?> returnType = method.getReturnType();

                methodInfos.add(new MethodInfo(method.getName(), Modifier.isAbstract(method.getModifiers()),
                        parameterTypes, returnType));
            }
        }

        if (includeSuperclass && aClass.getSuperclass() != null) {
            Class<?> superClass = aClass.getSuperclass();
            methodInfos.addAll(listMethods(superClass, includeAbstract, false));
        }

        return methodInfos;
    }
}
