# MultiScreenApp

Лабораторна робота №3 з дисципліни «Розробка мобільних застосунків».

## Опис
Мультиекранний застосунок з навігацією, ViewModel, StateFlow та deep link.

## Як запустити
1. Відкрийте проєкт у Android Studio (Iguana або новіше).
2. Дайте Gradle синхронізуватися. Якщо немає gradlew — Android Studio створить wrapper автоматично, або згенеруйте через `gradle wrapper`.
3. Run на емуляторі (API 26+) або реальному пристрої.

## Як протестувати Deep Link
Виконайте наступну команду в терміналі при запущеному емуляторі:
```bash
adb shell am start -W -a android.intent.action.VIEW -d "myapp://profile/123" com.example.multiscreenapp
```

## Як завантажити на GitHub
1. Створіть новий репозиторій на GitHub.
2. Виконайте команди в терміналі:
```bash
git init
git add .
git commit -m "Initial commit: Lab 3 MultiScreenApp"
git branch -M main
git remote add origin ВАШ_URL_РЕПОЗИТОРІЮ
git push -u origin main
```

## Автор
Білоус Владислав, група К-31, Ірпінський фаховий коледж економіки та права.
