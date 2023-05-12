package com.easy.kotlin

interface ProjectService {
    fun print() {
        println("I am project")
    }
}
interface MilestoneService{
    fun print(){
        println("I am milestone")
    }
}
class ProjectServiceImpl:ProjectService,MilestoneService{
    override fun print() {
        super<ProjectService>.print()
        super<MilestoneService>.print()
    }
}