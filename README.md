DanmakuStormR
================
DanmakuStormR is the complete rewritten version of the aborted DanmakuStorm, still in early development.

###What is wrong with DanmakuStorm?
As DanmakuStorm's code grows larger, some design flaws emerged. The original code consists of plastered-together code, terrible asset management, and a failed scripting system.
The lackluster performance also provoked me to start again. DanmakuStrom started as my stepping-stone to Java, and I definitely have learnt a lot during this half a year. That is why I initiated a remaster of the system.

###Then what is primary goal?
There are two; one is to warp up my current knowledge about game development by imbuing my recent learning about code patterns into this love of mine. The second is to fiddle around with JVM languages to expand my ken.

##About this Project Itself
Coming from a RPG Maker background, I separated this project into three parts: the assets, the engine, and the editor.

###Assets
Due to aspirations to actually publish games, the assets, after the prototyping stage is over, will be substituted with original content. (I know it is a lot of work...)

###Engine
An entity-component system (backed by artemis) underlies the engine. The engine will still utilize box2d as its collision-detection engine, and will use pooling to eliminate the bottleneck.
The engine itself is written in a mix of Java and Groovy (messy indeed), infused with scripting system powered by groovy. (the scripts are not provided yet)

###Editor
Aimed to be completely separated from the engine, the editor will (at least I hope so) be written in clojure using seesaw. Planned features include bullet hitbox editing, script editor and spellcard editor.

##Other Thoughts
I currently feel great resentment towards these projects. I dreamed over completing DanmakuStorm; I marveled that I was creating a tool that has utility. Yet now I feel only ennui; I want to drop this project off to tread on a little Rust as it is an emeraging system programming language. I will see about this...

###You did XXX the anti-pattern/wrong/inefficient/stupid way!
I would be glad to hear about my flaws when programming on this project. Any thoughts are welcomed, or if you find the code completely unbearable, aggressive PRs are always welcomed.
