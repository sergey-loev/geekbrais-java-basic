package geekbrains.basic.lesson6;

public class HomeWorkApp {
    /** 1. Создать классы Собака и Кот с наследованием от класса Животное.
     *  2. Все животные могут бежать и плыть. В качестве параметра каждому
     * методу передается длина препятствия. Результатом выполнения действия
     * будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     *  3. У каждого животного есть ограничения на действия (бег: кот 200 м.,
     * собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     *  4.  Добавить подсчет созданных котов, собак и животных.*/
    public static void main(String[] args) {
        Animal[] animals = {new dog("Бобик"),new cat("Мяука")};

        animals[0].run(150);
        animals[0].swim(20);

        animals[1].run(230);
        animals[1].swim(10);




    }



}
