# nsmp.sdk.global_variables

[![GitHub stars](https://img.shields.io/github/stars/exeki/nsmp.sdk.global_variables)](https://github.com/exeki/nsmp.sdk.global_variables/stargazers)

**Плейсхолдер глобальных переменных для NSMP** — чистая, лёгкая и IDE-ориентированная библиотека, предоставляющая статические классы с глобальными переменными для автодополнения и удобства разработки.

В NSMP скрипты зачастую используют глобальные переменные runtime контекста (Например `subject`, `user`, `api`, `utils`). IDE не понимает эти переменные из коробки, что усложняет разработку и снижает developer experience.

**nsmp.sdk.global_variables** решает эту проблему структурно:
- Предоставляет **статические классы-плейсхолдеры** для всех ключевых NSMP-переменных,
- Повышает IDE-поддержку (автодополнение, навигация по коду),
- Снижает число ошибок во время разработки.

## 🧪 Сценарии применения
- Разработка NSMP-скриптов в IntelliJ IDEA и других Java-IDE
- Повышение читаемости и поддержки кода
- Минимизация ошибок на этапе написания логики

## 🚀 Quick Start

### Подключение зависимости ###

> [!TIP]  
> Всегда используйте актуальную версию из репозитория.

1. Добавьте репозиторий в конфигурационный файл gradle `build.gradle.kts` вашего проекта:
```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/exeki/*")
        credentials {
            username = System.getenv("GITHUB_USERNAME")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
    mavenCentral()
}
```
2. Добавьте туда же библиотеку:
```kotlin
dependencies {
    implementation("ru.kazantsev.nsmp:sdk.global_variables:<version>")
}
```

Для maven алгоритм такой же, но синтаксис будет другой. 

## 🧩 Использование
Для получения автодополнения и подсказок IDE подключите статические импорты в свой скрипт:
```java
import static ru.kazantsev.nsmp.global_variables.ApiPlaceholder.*;
import static ru.kazantsev.nsmp.global_variables.GlobalVariablesPlaceholder.*;
```

Пример:
```groovy
ISDtObject employee = utils.find('employee', [:])
ISDtObject comment = utils.create(comment, [
        source: subject,
        author: employee,
])
```
> [!WARNING]  
> Если хотите переносить скрипты с использованием данных плейсхолдеров в NSMP без удаления импортов из скриптов, нужно добавить модуль [sdkPlaceholder](sdkPlaceholder.groovy) в инсталляцию.

## 🗂 Структура проекта

### Основные компоненты
```
src/main/java/ru/kazantsev/nsmp/sdk/global_variables/
├── ApiPlaceholder.java
├── GlobalVariablesPlaceholder.java
├── MailVariablePlaceholder.java
└── ...
```

- **ApiPlaceholder** — Глобальные API-объекты (`api`, `utils` и др.).
- **GlobalVariablesPlaceholder** — Базовые переменные контекста (`subject`, `user` и др.).
- **MailVariablePlaceholder** — Переменные, используемые в обработчиках почты.

## 🤝 Contributing
PR и идеи по расширению списка плейсхолдеров приветствуются (если по делу).

Рекомендуемый flow:
```
git fork https://github.com/exeki/nsmp.sdk.global_variables
git checkout -b feature/<name>
git commit -m "feat: description"
git push origin feature/<name>
```
