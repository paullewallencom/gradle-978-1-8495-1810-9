package sample

import org.gradle.api.*
import org.gradle.api.tasks.*

class InfoTask extends DefaultTask {

    String prefix = 'Current Gradle version'

    @TaskAction
    def info() {
        println "$prefix: $project.gradle.gradleVersion"
    }
}
