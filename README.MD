## Добавление jar-файла в локальный репозиторий

```bash
mvn install:install-file -Dfile=/path/to/my/jar_file/name.jar
-DgroupId=ru.clevertec.utils
-DartifactId=utils
-Dversion=1.3.5
-Dpackaging=jar
```

/Users/julia/IdeaProjects/clevertec_course/task-gradle/libs/utils-1.3.5.jar - путь к моему jar-файлу

В проекте jar-ник находится в папке ./libs/utils-1.3.5.jar.

## Описание

Использован utils-1.3.5.jar, сделанный в ветке feature-util. Jar-ник подтягивается из локального репозитория.
Приложение содержит два модуля:
в api есть class App с методом main, из которого вызывается метотд .isAllPositiveNumbers(Strings... str);
в core есть class Utils с методом boolean isAllPositiveNumbers(String… str).

## Стек

1. **Java 21**
2. **Gradle 8.5**

## Пример использования

Собраем .jar:

   ```bash
    ./gradlew jar
   ```

Собранный jar-ник в ./build/libs/task-1.0.0.jar. Запускаем командой java -jar task-1.0.0.jar 1 2 3 4 5(указываем полный
путь, [1 2 3 4] - аргументы строки):

   ```bash
     java -jar /Users/julia/IdeaProjects/clevertec_course/task-gradle/api/build/libs/task-1.0.0.jar 1 2 3 4 5
   ```

Если все переданные аргументы являются положительными числами, то получаем вывод в консоль:

   ```bash
All numbers are positive : [1, 2, 3, 4, 5]
   ```

Если хотя бы один переданный аргумент не является положительным числом, вывод в консоль:

   ```bash
All numbers are not positive : [1, 2, -1]
   ```

Если в качестве аргументов строки передаются буквы или символы, вывод в консоль:

   ```bash
Invalid data. Please try again.
   ```
## Реализация плагина

Идея плагина заключалась в сохранении отчета по покрытию тестами (jacoco) в pdf формате. Плагин реализован,  пример вывода отчета можно посмотерть в файле output.pdf (p.s. отображение не очень симпатично выглядит, скорее всего потому что не применялись стили). Плагин подкючен в модуле core.

![Screeshot2](https://github.com/JuliaRusakevich/TaskBuildTools/blob/master/Снимок%20экрана%202024-08-25%20в%2022.29.52.png)



![Screeshot1](https://github.com/JuliaRusakevich/TaskBuildTools/blob/master/Снимок%20экрана%202024-08-25%20в%2022.29.16.png)
