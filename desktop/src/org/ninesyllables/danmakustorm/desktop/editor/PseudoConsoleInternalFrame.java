package org.ninesyllables.danmakustorm.desktop.editor;

import org.ninesyllables.danmakustorm.ILoggingService;

import javax.swing.*;
import java.awt.*;

/**
 * Created by LBQ on 1/3/15.
 */
public class PseudoConsoleInternalFrame extends JInternalFrame implements ILoggingService {
    JTextArea console;
    public PseudoConsoleInternalFrame(){
        super("Pseudo Console", true, true, false, false);
        initComponents();
        pack();
    }

    public void log(String text){
        console.append(text + "\n");
    }

    void initComponents(){
        console = new JTextArea(5, 60);
        console.setEditable(false);
        JScrollPane scroll = new JScrollPane(console);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(scroll, BorderLayout.CENTER);
    }

}
