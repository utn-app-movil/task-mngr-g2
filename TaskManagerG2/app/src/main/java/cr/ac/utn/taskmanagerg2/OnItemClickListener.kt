package cr.ac.utn.taskmanagerg2

import cr.ac.utn.taskmanagerg2.domain.model.Task

interface OnItemClickListener {
    fun onItemClick(task: Task)
}