package cr.ac.utn.taskmanagerg2.data.memory

import cr.ac.utn.taskmanagerg2.domain.model.Task
import cr.ac.utn.taskmanagerg2.domain.repository.ITaskRepository

class TaskMemoryManager: ITaskRepository {
    private val tasks = mutableListOf<Task>()

    override fun addTasK(task: Task) {
        tasks.add(task)
    }

    override fun deleteTask(id: String) {
        tasks.removeIf{ it.id.trim() == id.trim() }
    }

    override fun updateTask(task: Task) {
        deleteTask(task.id)
        addTasK(task)
    }

    override fun getTasks()= tasks

    override fun getById(id: String): Task? {
        val result = tasks.filter { it.id.trim() == id.trim() }
        return if(result.any()) result[0] else null
    }

}