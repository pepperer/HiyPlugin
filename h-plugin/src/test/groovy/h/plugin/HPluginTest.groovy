/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package h.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'h.plugin.greeting' plugin.
 */
public class HPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("h.plugin.greeting")

        then:
        project.tasks.findByName("greeting") != null
    }
}
