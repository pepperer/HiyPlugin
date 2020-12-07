/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package com.hiy.plugin

import com.android.build.gradle.AppPlugin
import com.android.build.gradle.LibraryPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * A simple 'hello world' plugin.
 * com.hiy.plugin.HPlugin
 */
public class HPlugin implements Plugin<Project> {
    public void apply(Project project) {
        println("开始12")
        if (project.plugins.hasPlugin(AppPlugin)) {
            println("当前是application插件")
        } else if (project.plugins.hasPlugin(LibraryPlugin)) {
            println("当前是Library插件")
        } else {
            throw new IllegalArgumentException('img-optimizer gradle plugin only works in with Android module.')
        }
    }
}
