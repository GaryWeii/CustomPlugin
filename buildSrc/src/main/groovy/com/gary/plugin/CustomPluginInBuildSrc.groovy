package com.gary.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by garretwei on 2018/5/23.
 */
class CustomPluginInBuildSrc implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('showCustomPluginInBuildSrc') {
            doLast {
                println('task in CustomPluginInBuildSrc')
            }
        }
    }
}
