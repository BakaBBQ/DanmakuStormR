package org.ninesyllables.danmakustorm.systems

import com.artemis.Aspect
import com.artemis.ComponentMapper
import com.artemis.Entity
import com.artemis.annotations.Mapper
import com.artemis.systems.EntityProcessingSystem
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.physics.box2d.Body
import org.ninesyllables.danmakustorm.DanmakuGameR
import org.ninesyllables.danmakustorm.components.KinematicPhysicsComponent
import org.ninesyllables.danmakustorm.components.SpriteComponent
import org.ninesyllables.danmakustorm.components.TextureComponent

/**
 * Created by LBQ on 1/6/15.
 */
class TwoDimensionalRenderingSystem extends EntityProcessingSystem{
    @Mapper ComponentMapper<KinematicPhysicsComponent> kinematicPhysicsComponentComponentMapper;
    @Mapper ComponentMapper<SpriteComponent> spriteComponentComponentMapper

    TwoDimensionalRenderingSystem() {
        super(Aspect.getAspectFor(KinematicPhysicsComponent.class, SpriteComponent.class))
    }

    private SpriteBatch batch
    @Override
    protected void initialize(){
        batch = new SpriteBatch()
    }

    @Override
    protected void begin() {
        batch.begin()
    }

    @Override
    protected void process(Entity entity) {
        KinematicPhysicsComponent kinematicPhysicsComponent = getKinematicPhysicsComponentComponentMapper().get(entity)
        SpriteComponent spriteComponent = getSpriteComponentComponentMapper().get(entity)
        smashOnScreen(kinematicPhysicsComponent.body, spriteComponent.sprite)
    }

    @Override
    protected void end() {
        batch.end()
    }

    void smashOnScreen(Body body, Sprite sprite){
        int renderX = DanmakuGameR.PIXELS_PER_METER * (body.getWorldCenter().x) - texture.getWidth() / 2
        int renderY = DanmakuGameR.PIXELS_PER_METER * (body.getWorldCenter().y) - texture.getHeight() / 2
        sprite.draw(batch)
        sprite.setX(renderX)
        sprite.setY(renderY)
    }
}
