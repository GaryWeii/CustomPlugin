package com.gary.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by garretwei on 2018/5/26.
 */
class StandAlonePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('showStandAlonePlugin') {
            doLast {
                println('task in StandAlonePlugin')
            }
        }
    }
}
