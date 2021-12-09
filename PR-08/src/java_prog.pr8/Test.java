package java_prog.pr8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Pet {
    private final String name; //Поле имени
    public String getName() {
        return name;
    } //Метод получения имени
    public Pet(String name) {
        this.name = name;
    } //Параметризированный конструктор
}

class Cat extends Pet //Наследуемый класс Cat
{
    public Cat(String name) {
        super(name);
    } //Параметризированный конструктор
}

class Dog extends Pet //Наследуемый класс Dog
{
    public Dog(String name) {
        super(name);
    } //Параметризированный конструктор
}

class Owl extends Pet //Наследуемый класс Owl
{
    public Owl(String name) {
        super(name);
    } //Параметризированный конструктор
}

public class Test {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<String, Pet>(); //Инициализация объекта класса HaspMap

        hashMap.put("Cat", new Cat("Kit")); //Тестовый пример
        hashMap.put("Dog", new Dog("Sobaka")); //Тестовый пример
        hashMap.put("Owl", new Owl("Sova")); //Тестовый пример

        for (Map.Entry temp : hashMap.entrySet()) //Вывод элементов HaspMap
        {
            System.out.println(temp.getKey() + " -> " + ((Pet)temp.getValue()).getName());
        }

        System.out.println("\"Dog\" exists -> " + hashMap.containsKey("Dog")); //Проверка наличия ключа в HaspMap
        System.out.println("\"Shark\" exists -> " + hashMap.containsKey("Shark")); //Проверка наличия ключа в HaspMap
        System.out.println("\"Error\" exists -> " + hashMap.containsKey("Error")); //Проверка наличия ключа в HaspMap

        Pet dog = hashMap.get("Dog"); //Вывод значения по ключу
        System.out.println("\"Dog\" value is " + dog.getName());

        System.out.println(hashMap); //Вывод hashMap

        Random random = new Random(); //Инициализация объекта класса Random

        // Инициализируем объект класса HaspMap.
        Map<Integer, Integer> randomHashMap = new HashMap<>(); //Инициализация объекта класса hashMap

        for (int i = 0; i < 5; i++) //Создаём 5 чисел
        {
            int temp = random.nextInt(100); //Генерируем число от 0 до 100
            Integer freq = randomHashMap.get(temp); //Количество повторов

            if (freq == null) randomHashMap.put(temp, 1);
            else randomHashMap.put(temp, freq + 1); //Если все ключи уникальны, перемещаем индекс на единицу и вносим в hashMap сгенерированное число
        }
        System.out.println(randomHashMap); //Вывод randomHashMap
    }
}
