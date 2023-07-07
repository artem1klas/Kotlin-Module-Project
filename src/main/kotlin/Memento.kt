object Memento {
    var myArchive = mutableListOf<Archiev>() //список архивов приложения
    var start =
        true //Условие завершения цикла в фунции майн. Доступ к переменной из MainMenu.onClick
    var numberScreen =
        0 //Номер текущего экрана. Аргумент для фунции createMenu. Доступ из всех экранов меню.
    var indexArchive = 0 //Индекс текущего архива
    var indexNote = 0 //Индекс текущей заметки
}