package org.ninesyllables.danmakustorm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import groovy.lang.Binding;
import groovy.util.ResourceException;
import groovy.util.ScriptException;
import org.ninesyllables.danmakustorm.screens.SandboxScreen;

/**
 * Created by LBQ on 1/3/15.
 */
public class DanmakuGameR extends Game{

    SpriteBatch batch;
    public ILoggingService loggingService;
    public AssetManager assetManager;
    public DynamicGroovySupport dgs;
    @Override
    public void create() {
        batch = new SpriteBatch();


        dgs = new DynamicGroovySupport();

        Binding binding = new Binding();

        assetManager = new AssetManager();

        binding.setVariable("manager", assetManager);
        binding.setVariable("dgs", dgs);
        try {
            dgs.getGse().run("assets.groovy",binding);
        } catch (ResourceException e) {
            e.printStackTrace();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        //AssetDescriptor<Texture> bullet = new AssetDescriptor<Texture>(dgs.getProjectFile("graphics/bullet.png"), Texture.class);
        //assetManager.load(bullet);
        this.setScreen(new SandboxScreen(this));
    }

    public void render() {
        if(assetManager.update()) {
            // done loading
            super.render();
        }
    }

    public void registerLogger(ILoggingService newLoggingService){
        loggingService = newLoggingService;
    }
}
