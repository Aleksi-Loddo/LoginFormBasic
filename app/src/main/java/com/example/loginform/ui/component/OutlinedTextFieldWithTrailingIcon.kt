package com.example.loginform.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun OutlinedTextFieldWithTrailingIcon(label: String,icon: ImageVector, contentdescription: String= ""){

    OutlinedTextField (
        value = "",
        onValueChange = {},
        textStyle = MaterialTheme.typography.bodyMedium,
        label = { Text( label , color = Color.Gray) },
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp), //.padding(start = 10.dp, end = 10.dp),
        trailingIcon = {
            //IconButton(onClick = {} ) {
            Icon(icon, contentDescription = contentdescription)


        }
    )
}

