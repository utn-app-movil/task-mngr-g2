package cr.ac.utn.taskmanagerg2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TaskActivity : AppCompatActivity() {
    private lateinit var txtId: EditText
    private lateinit var TxtTitle: EditText
    private lateinit var TxtDescription: EditText
    private lateinit var TxtStatus: EditText
    private lateinit var TxtPriority: EditText
    private lateinit var TxtAssingTo: EditText
    private lateinit var TxtObservation: EditText
    private lateinit var TvDueDate: TextView
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
        TxtTitle = findViewById<EditText>(R.id.txtTitle_Task)
        TxtDescription = findViewById<EditText>(R.id.txtDescription_Task)
        TxtStatus = findViewById<EditText>(R.id.txtStatus_Task)
        TxtPriority = findViewById<EditText>(R.id.txtPriority_Task)
        TxtAssingTo = findViewById<EditText>(R.id.txtAssignTo_Task)
        TxtObservation = findViewById<EditText>(R.id.txtObservation_Task)
        TvDueDate = findViewById<EditText>(R.id.tvDueDate_Task)

        val btnSave = findViewById<Button>(R.id.btnSave_Task)

        btnSave.setOnClickListener {
        }

        val btnDelete = findViewById<Button>(R.id.btnDelete_Task)

        btnDelete.setOnClickListener {

        }


        val btnCancel = findViewById<Button>(R.id.btnCancel_Task)

        btnCancel.setOnClickListener {

        }
        val btnSearch = findViewById<ImageButton>(R.id.btnSearch_Task)

        btnSearch.setOnClickListener {

        }
        val btnDueData = findViewById<ImageButton>(R.id.btnDueDate_Task)

        btnDueData.setOnClickListener {

        }




    }

    }

