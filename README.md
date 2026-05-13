# MultiScreenApp 📱

Лабораторна робота №3. Застосунок із мультиекранною навігацією, збереженням стану через ViewModel та підтримкою Deep Links.

## Функціонал
- **Navigation Compose**: переходи між екранами.
- **ViewModel & StateFlow**: збереження стану імені користувача.
- **State Hoisting**: керування станом інпутів.
- **Deep Linking**: прямий перехід у профіль за ID.

## Тестування Deep Link
Виконайте команду в терміналі (емулятор має бути запущений):
```bash
adb shell am start -a android.intent.action.VIEW -d "myapp://profile/777" com.example.multiscreenapp
```

> **Підказка для запуску на вашому ПК (через повний шлях до ADB):**
> ```powershell
> & "C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe" shell am start -W -a android.intent.action.VIEW -d "myapp://profile/777" com.example.multiscreenapp
> ```

## Автор
**Білоус Владислав**, група К-31
Ірпінський фаховий коледж економіки та права
