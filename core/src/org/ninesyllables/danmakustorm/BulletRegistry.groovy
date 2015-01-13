package org.ninesyllables.danmakustorm

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.physics.box2d.Shape
import com.badlogic.gdx.utils.Array

/**
 * Created by LBQ on 1/14/15.
 */
class BulletRegistry {
    static HashMap<String, BulletRegistry> registries = new HashMap<String, BulletRegistry>()
    Texture texture;
    Shape shape;
    BulletRegistry(Texture texture, Shape shape){
        setTexture(texture)
        setShape(shape)
    }

    static register(String name, BulletRegistry registry){
        getRegistries().put(name,registry)
    }

    static get(String name){
        getRegistries().get(name)
    }
}
