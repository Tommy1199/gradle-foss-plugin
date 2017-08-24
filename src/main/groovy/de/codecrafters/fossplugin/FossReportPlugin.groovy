package de.codecrafters.fossplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class FossReportPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        FossReportConfiguration ext = new FossReportConfiguration()
        project.extensions.add('fossReportConfiguration', ext)
        project.task(['type': FossReportTask.class], "generateFossReport")
        project.afterEvaluate {
            ext.init(project)
        }
    }
}
