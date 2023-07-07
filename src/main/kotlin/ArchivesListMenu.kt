class ArchivesListMenu() : Menu() {
    override var validNumber = Memento.myArchive.size
    override fun printScreen(): Unit {
        if (Memento.myArchive.size == 0) {
            println("--Список архивов на данный момент пуст--")
        } else {
            println("--Список архивов--")
        }
        println("0. Назад")
        for ((index, e) in Memento.myArchive.withIndex()) {
            println("${index + 1}. ${e.name}")
        }

    }

    override fun onClick(i: Int): Unit {
        when (i) {
            0 -> Memento.numberScreen = 0
            else -> {
                Memento.numberScreen = 2
                Memento.indexArchive = i - 1
            }
        }
    }
}
