package org.ninesyllables.danmakustorm

import com.artemis.Entity
import com.artemis.World
import com.artemis.managers.GroupManager
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import org.ninesyllables.danmakustorm.components.KinematicPhysicsComponent
import org.ninesyllables.danmakustorm.components.SpriteComponent

/**
 * Created by LBQ on 1/14/15.
 */
class EntityFactory {
    public static Entity createBullet(World world, BulletRegistry registry, float x, float y, boolean enemyBullet){
        Entity e = world.createEntity()

        //TODO implement logic
        KinematicPhysicsComponent  physics= new KinematicPhysicsComponent()
        e.addComponent(physics)

        SpriteComponent sprite = new SpriteComponent()
        sprite.sprite = new Sprite(registry.getTexture())
        e.addComponent(sprite)

        def group = enemyBullet ? Constants.Groups.ENEMY_BULLETS : Constants.Groups.PLAYER_BULLETS
        world.getManage(GroupManager.class).add(e, group)

        return e
    }
}
