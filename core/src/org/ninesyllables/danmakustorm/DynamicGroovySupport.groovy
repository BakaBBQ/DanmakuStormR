package org.ninesyllables.danmakustorm

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.files.FileHandle
import groovy.lang.Binding
import groovy.util.GroovyScriptEngine
import org.pmw.tinylog.Logger
/**
 * Created by LBQ on 1/3/15.
 */
class DynamicGroovySupport {
    GroovyScriptEngine gse;
    String projectRoot = System.getProperty("user.home") + "/" + DynamicGroovySupport.PROJECT_NAME;
    static final String PROJECT_NAME = "DanmakuStormR"
    static {
        Logger.info("Only for testing")

    }
    public DynamicGroovySupport(){
        loadScriptEngine()
        startInitScript()

    }



    void loadScriptEngine(){
        String[] roots = [ getProjectRoot() ]
        try {
            gse = new GroovyScriptEngine(roots);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    FileHandle getProjectFile(String filename){
        return Gdx.files.external(getProjectRoot() + "/assets/" + filename)
    }

    void runSingleFile(String scriptName){
        runSingleFile(scriptName, new Binding())
    }

    void runSingleFile(String scriptName, Binding binding){
        // the core method
        Logger.info("GSE running groovy script: $scriptName in binding of $binding")
        getGse().run(scriptName, binding)
    }

    void startInitScript(){
        runSingleFile('init.groovy')
    }
}
