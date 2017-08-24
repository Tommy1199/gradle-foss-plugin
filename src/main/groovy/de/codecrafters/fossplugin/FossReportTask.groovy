package de.codecrafters.fossplugin

import org.gradle.api.DefaultTask
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging
import org.gradle.api.tasks.TaskAction

class FossReportTask extends DefaultTask {

    private static final Logger LOGGER = Logging.getLogger(FossReportTask.class)

    @TaskAction
    void generateFossReport() {
        LOGGER.info("Processing dependencies for project ${getProject().name}")
        FossReportConfiguration fossReportConfiguration = getProject().fossReportConfiguration
        fossReportConfiguration.init(getProject())

        // create output directory
        new File(fossReportConfiguration.outputDir).mkdirs()

        // generate the report
        // TODO
    }
}
