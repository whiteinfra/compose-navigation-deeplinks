package com.example.multiscreenapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SettingsViewModel : ViewModel() {
    private val _username = MutableStateFlow("Гість")
    val username: StateFlow<String> = _username

    fun updateUsername(newName: String) {
        _username.value = newName
    }
}

@Composable
fun SettingsScreen(
    navController: NavController,
    viewModel: SettingsViewModel
) {
    val username by viewModel.username.collectAsState()

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "⚙️ Налаштування",
                style = MaterialTheme.typography.headlineMedium
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Використовуємо TextField з розширеними налаштуваннями сумісності
            OutlinedTextField(
                value = username,
                onValueChange = { 
                    // Примусово оновлюємо значення без фільтрації
                    viewModel.updateUsername(it) 
                },
                label = { Text("Ваше ім'я") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                singleLine = true
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Збережене ім'я:", style = MaterialTheme.typography.labelMedium)
                    // Тут ми просто відображаємо те, що в стейті
                    Text(text = username, style = MaterialTheme.typography.headlineSmall)
                }
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            Button(onClick = { navController.popBackStack() }) {
                Text("Повернутися додому")
            }
        }
    }
}
