package com.javaapi.test.test.testReflect.genericType;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created by user on 17/6/22.
 */
public class ClientClass {
    private ClientClass clientClass;


    /**
     */
    @Test
    public void getGenericDeclaration() throws NoSuchFieldException {
        Field fieldList = ClientTypeVariable.class.getDeclaredField("clientClass");
        Type genericType = fieldList.getGenericType();
        System.out.println("genericType = " + genericType);
    }
}
