package org.ninesyllables.danmakustorm.screens;

import com.artemis.World;
import com.artemis.managers.GroupManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import groovy.lang.Binding;
import org.ninesyllables.danmakustorm.DanmakuGameR;
import org.ninesyllables.danmakustorm.DynamicGroovySupport;
import org.ninesyllables.danmakustorm.systems.ScriptSystem;
import org.ninesyllables.danmakustorm.systems.TwoDimensionalRenderingSystem;

/**
 * Created by LBQ on 1/3/15.
 */
public class SandboxScreen implements Screen{
    final DanmakuGameR game;
    public int timer;

    private World world;
    public SandboxScreen(final DanmakuGameR gam){
        game = gam;
        timer = 0;

        world = new World();
        world.setManager(new GroupManager());



        Binding b = new Binding();
        b.setVariable("world", world);
        game.dgs.runSingleFile("systems.groovy", b);
        world.initialize();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        timer++;
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        world.setDelta(delta);
        world.process();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
