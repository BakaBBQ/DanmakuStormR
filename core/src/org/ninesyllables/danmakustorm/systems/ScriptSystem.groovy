package org.ninesyllables.danmakustorm.systems

import com.artemis.Aspect
import com.artemis.ComponentMapper
import com.artemis.Entity
import com.artemis.EntitySystem
import com.artemis.annotations.Mapper
import com.artemis.systems.EntityProcessingSystem
import com.artemis.utils.ImmutableBag
import org.ninesyllables.danmakustorm.components.ScriptComponent

/**
 * Created by LBQ on 1/6/15.
 */
class ScriptSystem extends EntityProcessingSystem {
    @Mapper ComponentMapper<ScriptComponent> scriptMapper;

    ScriptSystem() {
        super(Aspect.getAspectFor(ScriptComponent.class))
    }

    @Override
    protected void process(Entity e) {
        ScriptComponent sc = scriptMapper.get(e);
        Script gScript = sc.script
    }

}
