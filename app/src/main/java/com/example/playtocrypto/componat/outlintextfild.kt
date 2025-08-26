package com.example.playtocrypto.componat

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.example.playtocrypto.ui.theme.comla
import com.example.playtocrypto.ui.theme.green
import com.example.playtocrypto.ui.theme.with


@Composable
fun Outlinetextfildname(
    value : String,
    onvaluechange : (String)-> Unit,
    label : String,
    icon : Int,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
       keyboardType = KeyboardType.Text,
        imeAction = ImeAction.Next
   )
) {

    val respons = LocalDimensions.current
    OutlinedTextField(
        value = value,
        onValueChange = { onvaluechange (it)},
        label = { Text(label) },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = respons.dp(12),end = respons.dp(12)),
        shape = RoundedCornerShape(respons.dp(12)),
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = with,
            unfocusedTextColor = green,
            focusedBorderColor = green,
            unfocusedBorderColor = comla,
            focusedLabelColor = with,
            unfocusedLabelColor = with
        ),
        keyboardOptions = keyboardOptions,
        leadingIcon = {
            Icon(
                painter = painterResource(icon), contentDescription = null,
                Modifier.size(respons.dp(25))
            )
        },
        textStyle = TextStyle(
            fontSize = respons.sp(18f),
            fontWeight = FontWeight.W500
        )


    )
}