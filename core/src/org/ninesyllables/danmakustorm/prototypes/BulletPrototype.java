package org.ninesyllables.danmakustorm.prototypes;
import groovy.lang.GroovyClassLoader;
/**
 * Created by LBQ on 1/3/15.
 */
public class BulletPrototype {
    public BulletPrototype(String prototypeName){
        ClassLoader parent = getClass().getClassLoader();
        GroovyClassLoader loader = new GroovyClassLoader(parent);
        //Class groovyClass = loader.parseClass();
    }
}
