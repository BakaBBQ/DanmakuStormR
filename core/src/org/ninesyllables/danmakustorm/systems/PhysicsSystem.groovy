package org.ninesyllables.danmakustorm.systems

import com.artemis.Aspect
import com.artemis.ComponentMapper
import com.artemis.Entity
import com.artemis.EntitySystem
import com.artemis.annotations.Mapper
import com.artemis.systems.EntityProcessingSystem
import com.artemis.systems.VoidEntitySystem
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.physics.box2d.World

/**
 * Created by LBQ on 1/14/15.
 */
class PhysicsSystem extends VoidEntitySystem{
    World box2dWorld

    public PhysicsSystem(){
        setBox2dWorld(new World(new Vector2(0,0), false))
    }

    @Override
    protected void processSystem() {
        getBox2dWorld().step((1/60) as float, 6, 2) // I probably do not even need the last two arguments
    }
}
