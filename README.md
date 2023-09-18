# Дипломный проект профессии «Тестировщик ПО» #

Дипломный проект представляет собой автоматизацию тестирования комплексного сервиса, взаимодействующего с СУБД и API Банка.

# Документы: #

* План Автоматизации
* Отчет опроведенном тестировании
* Отчет о проведенной автоматизации
* Баги

# Инструкция по запуску(для Windows): #

1. Клонировать текущий репозиторий
2. Перейти в директорию с клонированным репозиторием
3. Из папки с репозиторием запустить контейнеры : docker-compose up -d
4. Запустить SUT
* Для работы с MySQL : java -Dspring.datasource.url=jdbc:mysql://192.168.99.100:3306/app -jar artifacts/aqa-shop.jar
* Для работы с Postgres: java -Dspring.datasource.url=jdbc:postgresql://192.168.99.100:5432/app -jar artifacts/aqa-shop.jar
5. Запустить тесты
* Для работы с MySQL: gradlew test

Запуск в mysql установлен по умолчанию параметры:
db.url=jdbc:mysql://192.168.99.100:3306/app
user=app
password=pass

* Для работы с Postgres: gradlew test -Ddb.url=jdbc:postgresql://192.168.99.100:5432/app

6. Для формирования отчета Allure и его открытия в браузере выполнить команды
* gradlew allureReport
* gradlew allureServe

7. Остановить и удалить контейнеры
* docker-compose down