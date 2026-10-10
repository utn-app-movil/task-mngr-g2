package cr.ac.utn.taskmanagerg2.domain.repository

import cr.ac.utn.taskmanagerg2.domain.model.Task

interface ITaskRepository {
    fun getTasks(): List<Task>
    fun getById(id: String): Task?
    fun addTasK(task: Task)
    fun updateTask(task:Task)
    fun deleteTask(id: String)
}