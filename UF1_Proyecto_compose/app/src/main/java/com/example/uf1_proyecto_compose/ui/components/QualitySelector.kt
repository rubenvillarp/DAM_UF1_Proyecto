@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.components

import android.widget.Toast
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.uf1_proyecto_compose.ui.utils.HIGH_QUALITY
import com.example.uf1_proyecto_compose.ui.utils.LOW_QUALITY
import com.example.uf1_proyecto_compose.ui.utils.MEDIUM_QUALITY
import com.example.uf1_proyecto_compose.ui.utils.quality

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun qualitySelector() {
    val context = LocalContext.current
    var expanded by remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = !expanded }) {

        TextField(
            value = "Selecciona la calidad",
            onValueChange = {},
            readOnly = true,
            modifier = Modifier.menuAnchor()
        )
        ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(
                text = { Text(text = "Low") },
                onClick = {
                    expanded = false
                    Toast.makeText(
                        context,
                        "Low Selected",
                        Toast.LENGTH_SHORT
                    ).show()
                    quality = LOW_QUALITY
                })
            DropdownMenuItem(
                text = { Text(text = "Medium") },
                onClick = {
                    expanded = false
                    Toast.makeText(
                        context,
                        "Medium Selected",
                        Toast.LENGTH_SHORT
                    ).show()
                    quality = MEDIUM_QUALITY
                })
            DropdownMenuItem(
                text = { Text(text = "High") },
                onClick = {
                    expanded = false
                    Toast.makeText(
                        context,
                        "High Selected",
                        Toast.LENGTH_SHORT
                    ).show()
                    quality = HIGH_QUALITY
                })
        }
    }
}