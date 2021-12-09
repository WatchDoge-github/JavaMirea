package java_prog.pr9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class SolarSystem {
    private ArrayList<String> solarSystem; //Список названий планет солнечной системы

    public SolarSystem() {
        solarSystem = new ArrayList<>();
    } //Конструктор

    public List<String> getUnmodifiableSolarSystem() {
        return Collections.unmodifiableList(solarSystem);
    } //Метод, отвечающий за возврат немодифицируемого списка

    public void addPlanet(String name) {
        solarSystem.add(name);
    } //Метод записи названия планеты

    public void removePlanet(String name) {
        solarSystem.remove(name);
    } //Метод удаления названия планеты

    public void changePlanet(int index, String value) {
        solarSystem.set(index, value);
    } //Метод изменения планеты по индексу

    public void shufflePlanets() {
        Collections.shuffle(solarSystem);
    } //Метод перемешивания планет

    public String getRandomPlanet() {
        Random random = new Random();
        return solarSystem.get(random.nextInt(solarSystem.size()));
    } //Метод получения случайной планеты

    public int getIndexOfPlanet(String name) {
        return solarSystem.indexOf(name);
    } //Метод получения индекса планеты по названию

    public boolean planetExists(String name) {
        return solarSystem.contains(name);
    } //Метод проверки наличия планеты в списке

    public String[] getSolarSystemArray() {
        return solarSystem.toArray(new String[solarSystem.size()]);
    } //Метод преобразования списка в массив

    public int getSolarSystemSize() {
        return solarSystem.size();
    } //Метод нахождения размера солнечной системы

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Solar system: ");
        for(String planet : solarSystem){
            temp.append("[").append(planet).append("] ");
        }
        return String.valueOf(temp);
    }
}

public class Test {
    public static void main(String[] args) {
        SolarSystem system = new SolarSystem(); //Инициализация объекта класса SolarSystem

        //Добавление планет:
        system.addPlanet("Mercury");
        system.addPlanet("Venus");
        system.addPlanet("Earth");
        system.addPlanet("Mars");
        system.addPlanet("Jupiter");
        system.addPlanet("Saturn");
        system.addPlanet("Uranus");
        system.addPlanet("Neptune");

        System.out.println(system.toString()); //Вывод списка

        system.removePlanet("Mars"); //Удаление планеты
        System.out.println(system.toString());

        system.addPlanet("Mars"); //Добавление планеты
        System.out.println(system.toString());

        system.changePlanet(1, "UFO"); //Изменение планеты
        System.out.println(system.toString());

        system.shufflePlanets(); //Перемешивание планет
        System.out.println(system.toString());

        System.out.println("Random planet -> " + system.getRandomPlanet()); //Вывод случайной планеты
        System.out.println("Index of UFO -> " + system.getIndexOfPlanet("UFO")); //Вывод индекса планеты
        System.out.println("Planet \"Pluto\" exists -> " + system.planetExists("Pluto")); //Проверка существования планеты
    }
}
