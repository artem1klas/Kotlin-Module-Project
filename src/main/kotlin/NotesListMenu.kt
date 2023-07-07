class NotesListMenu() : Menu() {
    override var validNumber = Memento.myArchive[Memento.indexArchive].archiev.size
    val selectedArchive = Memento.myArchive[Memento.indexArchive]
    override fun printScreen() {
        if (selectedArchive.archiev.size == 0) {
            println("\"--Список заметок архива \"${selectedArchive.name}\" пуст--")
        } else {
            println("\"--Список заметок архива \"${selectedArchive.name}\"--")
        }
        println("0. Назад")
        for ((index, e) in selectedArchive.archiev.withIndex()) {
            println("${index + 1}. ${e.name}")
        }

    }

    override fun onClick(i: Int): Unit {
        when (i) {
            0 -> Memento.numberScreen = 2
            else -> {
                Memento.numberScreen = 4
                Memento.indexNote = i - 1
            }
        }
    }
}
