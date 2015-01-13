package org.ninesyllables.danmakustorm.desktop;

import com.alee.laf.WebLookAndFeel;
import org.ninesyllables.danmakustorm.desktop.editor.GameEditor;

import javax.swing.*;

/**
 * Created by LBQ on 1/2/15.
 */
public class EditorLauncher {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable ()
        {
            @Override
            public void run() {
                WebLookAndFeel.install ();
                GameEditor editor = new GameEditor();
            }
        });

    }
}
