package com.example.playtocrypto.componat

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.playtocrypto.R
import com.example.playtocrypto.ui.theme.comla
import com.example.playtocrypto.ui.theme.green
import com.example.playtocrypto.ui.theme.with


@Composable
fun PasswordTextfild(
    value : String,
    onvaluechange : (String)-> Unit,
    label : String,
    icon : Int,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Text,
        imeAction = ImeAction.Done
    )
) {

    val respons = LocalDimensions.current
    var passwordVisible by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current
    OutlinedTextField(
        value = value,
        onValueChange = { onvaluechange(it) },
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
                Modifier.size(respons.dp(24))
            )
        },
        textStyle = TextStyle(
            fontSize = respons.sp(18f),
            fontWeight = FontWeight.W500
        ),
        visualTransformation = if (passwordVisible) VisualTransformation.None
        else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (passwordVisible)
                painterResource(id = R.drawable.no_hide)
            else
                painterResource(id = R.drawable.hide)
            IconButton(
                onClick = { passwordVisible = !passwordVisible },
                Modifier.size(height = 25.dp, width = 25.dp)
            ) {
                Icon(painter = image, contentDescription = "Toggle password visibility")
            }
        },
        keyboardActions = KeyboardActions(
            onDone = { focusManager.clearFocus() }
        ),


    )
}