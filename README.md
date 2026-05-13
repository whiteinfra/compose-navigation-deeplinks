# MultiScreenApp 📱

Лабораторна робота №3. Застосунок із мультиекранною навігацією, збереженням стану через ViewModel та підтримкою Deep Links.

## Функціонал
- **Navigation Compose**: переходи між HomeScreen, ProfileScreen та SettingsScreen.
- **ViewModel & StateFlow**: збереження імені користувача при зміні конфігурації.
- **State Hoisting**: керування станом інпутів.
- **Deep Linking**: прямий перехід у профіль.

## Тестування Deep Link
Виконайте команду в терміналі (емулятор має бути запущений):
```bash
adb shell am start -a android.intent.action.VIEW -d "myapp://profile/777" com.example.multiscreenapp
```
*Якщо `adb` не розпізнано, використовуйте повний шлях до файлу `adb.exe` у вашому Android SDK.*

## Автор
**Білоус Владислав**, група К-31
Ірпінський фаховий коледж економіки та права
