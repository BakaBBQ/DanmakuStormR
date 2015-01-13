package org.ninesyllables.danmakustorm.components;

import com.artemis.Component;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import org.ninesyllables.danmakustorm.utils.ContactInformation;

/**
 * Created by LBQ on 1/6/15.
 */
public class KinematicPhysicsComponent extends Component {
    public Body body;
    public ContactInformation contactInformation;
    public KinematicPhysicsComponent(){

    }

    public KinematicPhysicsComponent(World box2dWorld, FixtureDef fixtureDef, BodyDef bodyDef){
        body = box2dWorld.createBody(bodyDef);
        body.createFixture(fixtureDef);
        body.setUserData(contactInformation);
    }
}
