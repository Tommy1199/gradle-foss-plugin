package de.codecrafters.fossplugin

import org.gradle.api.Project
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging

class FossReportConfiguration {

    private static final Logger LOGGER = Logging.getLogger(FossReportPlugin.class)

    private String outputDir

    void init(Project project) {
        LOGGER.debug("Initialize configuration for Project '${project.name}'")
        if (!outputDir) {
            outputDir = "${project.buildDir}/reports/foss"
        }
    }

    String getOutputDir() {
        outputDir
    }
}
