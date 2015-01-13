package org.ninesyllables.danmakustorm.desktop.editor;

import com.badlogic.gdx.backends.lwjgl.LwjglCanvas;
import org.ninesyllables.danmakustorm.DanmakuGameR;

import javax.swing.*;
import java.awt.*;

/**
 * Created by LBQ on 1/3/15.
 */
public class GameInternalFrame extends JInternalFrame {
    LwjglCanvas canvas;
    DanmakuGameR game;
    public GameInternalFrame(){
        super("Game",true,true,false,false);
        setBounds(0,0,640,480);
        initComponents();
    }

    void initComponents(){
        game = new DanmakuGameR();
        canvas = new LwjglCanvas(game);
        getContentPane().add(canvas.getCanvas(), BorderLayout.CENTER);
    }
}
