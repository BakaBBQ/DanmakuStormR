package org.ninesyllables.danmakustorm.desktop.editor;

import javax.swing.*;

import com.alee.laf.desktoppane.WebDesktopPane;
import com.alee.laf.desktoppane.WebInternalFrame;

import java.awt.*;

/**
 * Created by LBQ on 1/2/15.
 */
public class GameEditor extends JFrame {
    WebDesktopPane desktop;
    GridBagConstraints gbc = new GridBagConstraints();
    public GameEditor(){
        super("DanmakuStormR Editor");
        setSize(640 * 2, 480 * 3/2);
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    void initComponents(){
        addDesktop();
        addGame();
        addConsole();
        associate();
        //addTestFrames();
    }

    void addDesktop(){
        desktop = new WebDesktopPane();
        desktop.setOpaque(false);
        getContentPane().add(desktop, BorderLayout.CENTER);
    }

    GameInternalFrame gameInternalFrame;
    void addGame(){
        gameInternalFrame = new GameInternalFrame();
        gameInternalFrame.setVisible(true);
        desktop.add(gameInternalFrame);
    }

    PseudoConsoleInternalFrame pseudoConsoleInternalFrame;
    void addConsole(){
        pseudoConsoleInternalFrame = new PseudoConsoleInternalFrame();
        pseudoConsoleInternalFrame.setVisible(true);

        desktop.add(pseudoConsoleInternalFrame);
    }

    void associate(){
        gameInternalFrame.game.registerLogger(pseudoConsoleInternalFrame); //damn, ugly code again
    }


    void addTestFrames(){
        WebInternalFrame internal = new WebInternalFrame("Lorem Ipsum",true,true,true,true);
        internal.setBounds(0,0,640,480);
        internal.setVisible(true);
        desktop.add(internal);
    }
}
