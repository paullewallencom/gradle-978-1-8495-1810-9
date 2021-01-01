package sample

import org.gradle.api.*

class InfoPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.extensions.create('info', InfoPluginExtension)

        project.task('info') << {
            println "$project.info.prefix: $project.gradle.gradleVersion"
        }
    }

}
