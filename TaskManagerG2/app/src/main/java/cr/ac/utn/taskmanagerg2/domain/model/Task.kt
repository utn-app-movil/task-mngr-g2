package cr.ac.utn.taskmanagerg2.domain.model

import java.time.LocalDate

data class Task(
    val id: String,
    val title: String,
    val description: String,
    val creationDate: LocalDate,
    val dueDate: LocalDate,
    val status: TaskStatus,
    val assignedTo: String,
    val priority: TaskPriority,
    val notes: String
)
