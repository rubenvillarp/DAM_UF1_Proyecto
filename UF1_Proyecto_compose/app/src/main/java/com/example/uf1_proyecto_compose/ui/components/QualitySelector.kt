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
import androidx.compose.ui.res.stringResource
import com.example.uf1_proyecto_compose.R
import com.example.uf1_proyecto_compose.ui.utils.RadioPlayerHelper

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QualitySelector() {
    val context = LocalContext.current
    val selectQuality = stringResource(id = R.string.select_quality)
    var expanded by remember { mutableStateOf(false) }
    var quality by remember { mutableStateOf(selectQuality) }
    ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = !expanded }) {
        val low = stringResource(id = R.string.low)
        val medium = stringResource(id = R.string.medium)
        val high = stringResource(id = R.string.high)
        TextField(
            value = quality,
            onValueChange = {},
            readOnly = true,
            modifier = Modifier.menuAnchor()
        )
        ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(
                text = { Text(text = stringResource(R.string.low)) },
                onClick = {
                    Toast.makeText(
                        context,
                        R.string.low_selected,
                        Toast.LENGTH_SHORT
                    ).show()
                    quality = low
                    RadioPlayerHelper.quality = RadioPlayerHelper.LOW_QUALITY
                    expanded = false
                })
            DropdownMenuItem(
                text = { Text(text = stringResource(R.string.medium)) },
                onClick = {
                    expanded = false
                    Toast.makeText(
                        context,
                        R.string.medium_selected,
                        Toast.LENGTH_SHORT
                    ).show()
                    quality = medium
                    RadioPlayerHelper.quality = RadioPlayerHelper.MEDIUM_QUALITY
                })
            DropdownMenuItem(
                text = { Text(text = stringResource(R.string.high)) },
                onClick = {
                    expanded = false
                    Toast.makeText(
                        context,
                        R.string.high_selected,
                        Toast.LENGTH_SHORT
                    ).show()
                    quality = high
                    RadioPlayerHelper.quality = RadioPlayerHelper.HIGH_QUALITY
                })
        }

    }
}