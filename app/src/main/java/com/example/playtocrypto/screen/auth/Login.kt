package com.example.playtocrypto.screen.auth


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.playtocrypto.R
import com.example.playtocrypto.componat.LocalDimensions
import com.example.playtocrypto.componat.Outlinetextfildname
import com.example.playtocrypto.componat.PasswordTextfild
import com.example.playtocrypto.ui.theme.Backround
import com.example.playtocrypto.ui.theme.green
import com.example.playtocrypto.ui.theme.litewihet
import com.example.playtocrypto.ui.theme.with

@Preview(showSystemUi = true)
@Composable
fun Login() {
    val respon = LocalDimensions.current
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize()

            .background(
                Backround
            )
            .padding(respon.dp(8)),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Spacer(Modifier.height(respon.dp(120)))
        Text("Welcome Back",
            color = with,
            fontSize = respon.sp(45f),
            fontWeight = FontWeight.W600
        )
        Spacer(Modifier.height(respon.dp(10)))
        Text(
            "Login to your account",
            fontSize = respon.sp(20f),
            color = litewihet,


            )
        Spacer(Modifier.height(respon.dp(30)))

        Outlinetextfildname(
            value = name,
            onvaluechange = { name = it },
            label = ("user@gmail.com"),
            icon = R.drawable.user
        )
        Spacer(Modifier.height(respon.dp(8)))
        PasswordTextfild(
            value = password,
            onvaluechange = { password = it },
            label = ("Password"),
            icon = R.drawable.lock
        )
        Spacer(Modifier.height(respon.dp(12)))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = checked,
                    onCheckedChange = { checked = it },
                    colors = CheckboxDefaults.colors(
                        uncheckedColor = litewihet, checkedColor = green
                    )

                )
                Text("Remember Me", color = litewihet, fontSize = respon.sp(16f))
            }


            TextButton(onClick = {}) {
                Text("Forgot Password ?", color = litewihet, fontSize = respon.sp(16f))
            }
        }
        Spacer(Modifier.height(respon.dp(70)))

        Button(
            onClick = {},
            modifier = Modifier.size(width = respon.dp(300), height = respon.dp(45)),

            shape = RoundedCornerShape(respon.dp(8)),
            colors = ButtonDefaults.buttonColors(containerColor = green, contentColor = litewihet),
            enabled = if (!checked) {
                false
            } else true


        ) { Text("Login", fontSize = respon.sp(18f), fontWeight = FontWeight.W600) }

        Spacer(Modifier.height(respon.dp(70)))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Divider(Modifier.width(respon.dp(100)))
            Text("Or Continue With", color = litewihet, fontSize = respon.sp(16f))
            Divider(Modifier.width(respon.dp(100)))


        }
        Spacer(Modifier.height(respon.dp(40)))

        IconButton(onClick = {}, Modifier.size(respon.dp(40))) {
            Image(painter = painterResource(R.drawable.google), contentDescription = null)
        }
        Spacer(Modifier.height(respon.dp(40)))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Don't have an account?", color = litewihet, fontSize = respon.sp(16f))
            TextButton(onClick = {}) {
                Column {
                    Text("Sign Up", color = green, fontSize = respon.sp(16f))
                    Divider(Modifier.width(respon.dp(60)))

                }

            }
        }


    }

}