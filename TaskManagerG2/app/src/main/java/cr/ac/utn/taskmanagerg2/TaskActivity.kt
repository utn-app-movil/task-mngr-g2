package cr.ac.utn.taskmanagerg2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cr.ac.utn.taskmanagerg2.domain.model.TaskPriority

class TaskActivity : AppCompatActivity() {
    private lateinit var txtId: EditText
    private lateinit var txtTittle: EditText
    private lateinit var txtDescription: EditText
    private lateinit var txtStatus: EditText
    private lateinit var txtPriority: EditText
    private lateinit var txtAssignTo: EditText
    private lateinit var txtObservation: EditText
    private lateinit var tvDueDate: EditText
    private var dueDay: Int = 0
    private var dueMonth: Int = 0
    private var dueYear: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtId = findViewById<EditText>(R.id.txtId_Task)
        txtTittle = findViewById<EditText>(R.id.txtTitle_Task)
        txtDescription = findViewById<EditText>(R.id.txtDescription_Task)
        txtStatus = findViewById<EditText>(R.id.txtStatus_Task)
        txtPriority = findViewById<EditText>(R.id.txtPriority_Task)
        txtAssignTo = findViewById<EditText>(R.id.txtAssignTo_Task)
        txtObservation = findViewById<EditText>(R.id.txtObservation_Task)
        tvDueDate = findViewById<EditText>(R.id.tvDueDate_Task)

        val btnSave = findViewById<Button>(R.id.btnSave_Task)
        val btnRemove = findViewById<Button>(R.id.btnDelete_Task)
        val btnCancel = findViewById<Button>(R.id.btnCancel_Task)
        val btnSearch = findViewById<ImageButton>(R.id.btnSearch_Task)
        val btnDueDate = findViewById<ImageButton>(R.id.btnDueDate_Task)

        btnSave.setOnClickListener {

        }

        btnRemove.setOnClickListener {

        }

        btnCancel.setOnClickListener {

        }

        btnSearch.setOnClickListener {

        }

        btnDueDate.setOnClickListener {

        }


    }
}