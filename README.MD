## Описание

Собран .jar файл - utils-1.3.5.jar, в котором есть class StringUtils с методом boolean isPositiveNumber(String str),
который проверяет переданные числа на положительность. Вывод в консоль в формате str - true/false.
Манифест содержит имя и версию .jar файла.

## Стек

1. **Java 21**
2. **Gradle 8.5**

## Пример использования

Собранный .jar файл нахоится в директории ./libs проекта.
Для запуска воспользуйтесь командой java -jar utils-1.3.5.jar. В моем случае я указывала полный путь к .jar файлу:

   ```bash
    java -jar /Users/julia/IdeaProjects/clevertec_course/task-gradle/libs/utils-1.3.5.jar
   ```

В качестве аргументов можно передавать любые значения. Если данные невалидные - пользователю будет выведено
соответсвующее сообщение.

   ```bash
     java -jar /Users/julia/IdeaProjects/clevertec_course/task-gradle/libs/utils-1.3.5.jar 4 54 -3 = 90 ^
   ```

Вывод в консоли:

   ```bash
4 - true
54 - true
-3 - false
= - Invalid data. Please enter numbers.
90 - true
^ - Invalid data. Please enter numbers.
   ```