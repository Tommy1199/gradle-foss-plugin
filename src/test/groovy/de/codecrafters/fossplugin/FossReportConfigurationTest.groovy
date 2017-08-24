package de.codecrafters.fossplugin

import org.gradle.api.Project
import spock.lang.Specification

/*
 * This Spock specification is checking the FossReportConfiguration.
 */

class FossReportConfigurationTest extends Specification {

    def "Extension should give default output directory"() {
        setup:
        def extensionConfig = new FossReportConfiguration()
        def project = [getName    : { "test" },
                       getBuildDir: { new File("testBuildDir") }] as Project

        when:
        extensionConfig.init(project)

        then:
        extensionConfig.outputDir == "testBuildDir/reports/foss"
    }
}
