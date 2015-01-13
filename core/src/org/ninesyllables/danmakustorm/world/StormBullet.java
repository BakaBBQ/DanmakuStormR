package org.ninesyllables.danmakustorm.world;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.utils.Pool;
import org.ninesyllables.danmakustorm.prototypes.BulletPrototype;

/**
 * Created by LBQ on 1/3/15.
 */
public class StormBullet extends StormEntity implements Pool.Poolable{
    public Sprite sprite;
    public Body body;
    public BulletPrototype prototype;

    public StormBullet(BulletPrototype prototype){

    }
    @Override
    public void reset() {

    }
}
