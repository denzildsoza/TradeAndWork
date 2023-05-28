package com.example.workntrade

import android.os.Bundle
//import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
//import android.widget.Toast
import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.workntrade.ui.theme.WorknTradeTheme
import com.example.workntrade.SendMail

class MainActivity : ComponentActivity() {
    val SendEmailInstance: SendMail = SendMail()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Level:EditText = findViewById(R.id.level)
        val Quantity:EditText = findViewById(R.id.quantity)
        val Target:EditText = findViewById(R.id.target)
        val Type:EditText = findViewById(R.id.type)
        val OrderType:Switch = findViewById(R.id.OrderType)
        val button: Button = findViewById(R.id.submit)
        button.setOnClickListener { view ->
            val payload = "{" +
                            "level:${Level.text},"+
                            "quantity:${Quantity.text},"+
                            "target:${Target.text},"+
                            "OrderType:${if(OrderType.isChecked())"Resistance" else "Support"},"
                    "}"
            SendEmailInstance.SendEmail("abc")
        }

    }
}
