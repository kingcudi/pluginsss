rootProject.name = "ocplugins"

include(":occore")

include(":ocgarden")
include(":ocrift")
include(":ocbloods")
include(":ocsepulchre")
include(":ocbarbfishing")
include(":occlicker")
include(":ocbarbfishing")
include(":ocblastfurnace")
include(":ocbankskills")
include(":ocbwans")
include(":ocnightmarezone")
include(":ocgranite")
include(":octodt")
include(":ocsalamanders")
include(":ocdancing")
include(":ocflyfishing")
include(":ocpickpocket")
include(":ocspells")
include(":octrawler")

for (project in rootProject.children) {
    project.apply {
        projectDir = file(name)
        buildFileName = "$name.gradle.kts"

        require(projectDir.isDirectory) { "Project '${project.path} must have a $projectDir directory" }
        require(buildFile.isFile) { "Project '${project.path} must have a $buildFile build script" }
    }
}
