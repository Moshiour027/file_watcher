package com.company;


import javax.swing.*;
import java.io.IOException;

// Replace <package> with your package name

public class Main {

    //private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            DirectoryWatchService watchService = new SimpleDirectoryWatchService(); // May throw
            watchService.register( // May throw
                    new DirectoryWatchService.OnFileChangeListener() {
                        @Override
                        public void onFileCreate(String filePath) {
                            System.out.println(filePath);
                            System.out.println("File Created");

                            // File created
                        }

                        @Override
                        public void onFileModify(String filePath) {
                            System.out.println(filePath);
                            System.out.println("File MODIFIED");
                        }

                        @Override
                        public void onFileDelete(String filePath) {
                            System.out.println(filePath);
                            System.out.println("File DELETED");
                        }
                    },
                    "D:\\",//<directory>, // Directory to watch
                    "*.*" //<file-glob-pattern-1>, // E.g. "*.log"
                    //<file-glob-pattern-2>, // E.g. "input-?.txt"
                    //<file-glob-pattern-3>, // E.g. "config.ini"
                    //... // As many patterns as you like
            );
            JFrame frame = new JFrame("APp");
            frame.setContentPane(new APp().panelMain);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);


            watchService.start();

            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    watchService.stop();
                    // LOGGER.error("Main thread interrupted.");
                    break;
                }
            }
        } catch (IOException e) {
            // LOGGER.error("Unable to register file change listener for " + fileName);
        }


    }
}