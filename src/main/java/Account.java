public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверяем длину строки
        if (name.length() < 3 || name.length() > 19 || !name.contains(" ")) {
            return false;
        }
        // Находим индекс первого пробела
        int firstSpace = name.indexOf(" ");
        // Находим индекс последнего пробела
        int lastSpace = name.lastIndexOf(" ");
        // Проверяем, что индексы равны и не равны 0 или name.length()-1
        return firstSpace == lastSpace && firstSpace != 0 && firstSpace != name.length() - 1;
    }
}

