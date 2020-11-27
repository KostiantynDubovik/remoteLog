package com.github.kostiantyndubovik.remotelog.services

import com.intellij.openapi.project.Project
import com.github.kostiantyndubovik.remotelog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
