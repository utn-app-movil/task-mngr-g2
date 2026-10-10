package cr.ac.utn.taskmanagerg2.viewmodel

import androidx.lifecycle.ViewModel
import cr.ac.utn.taskmanagerg2.domain.model.Task
import cr.ac.utn.taskmanagerg2.domain.repository.ITaskRepository

class TaskViewModel(private val repository: ITaskRepository):
        ViewModel() {

    fun getTasks(): List<Task>{
        return repository.getTasks()
    }

    fun getTaskById(id: String): Task?{
        return repository.getById(id)
    }

    fun createTask (task: Task){
        try {
            if (repository.getById(task.id)== null)
                repository.addTasK(task)
            else
                throw Exception("The task is duplicated. " +
                        "Please add a new one.")
        }catch (e: Exception){
            throw e
        }
    }

    fun updateTask(task: Task){
        try {
            if (repository.getById(task.id) != null)
                repository.updateTask(task)
            else
                throw Exception("It's not possible to update the task. " +
                        "because it does not exist.")
        }catch (e: Exception){
            throw e
        }
    }

    fun removeTask(id: String){
        try {
            if (repository.getById(id) != null)
                repository.deleteTask(id)
            else
                throw Exception("It's not possible to delete the task. " +
                        "because it does not exist.")
        }catch (e: Exception){
            throw e
        }
    }
}