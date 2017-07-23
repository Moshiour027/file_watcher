package com.company;

import com.badlogicgames.packr.Packr;
import com.badlogicgames.packr.PackrConfig;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by moshiour.rahman on 7/23/2017.
 */
public class MainBuild {
    public static void main(String[] args) throws IOException {
        PackrConfig config = new PackrConfig();
        config.platform = PackrConfig.Platform.Windows64;
        config.jdk = "C:/Users/moshiour.rahman/Downloads/openjdk-1.7.0-u80-unofficial-windows-i586-image.zip";
        config.executable = "fileWatcher";
        config.classpath = Arrays.asList("C:\\Users\\moshiour.rahman\\Desktop\\file_watcher\\out\\artifacts\\file_watcher_jar\\file_watcher.jar");
        config.mainClass = "com.company.Main";
        config.vmArgs = Arrays.asList("Xmx1G");
        config.minimizeJre = "soft";
        config.outDir = new java.io.File("out-watcher");
        new Packr().pack(config);
        System.out.println("D TE ----!!");
    }
}

