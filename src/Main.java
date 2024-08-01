//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 4
        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // task 5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        // task 6
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var allWeight = firstWeight + secondWeight;
        System.out.println(allWeight);
        var diffWeight = secondWeight - firstWeight;
        System.out.println(diffWeight);

        // task 7
        var remainderWeight = secondWeight % firstWeight;
        System.out.println(remainderWeight);

        // task 8
        var allHours = 640;
        var hoursPerONe = 8;
        var workers = allHours / hoursPerONe;
        System.out.println("Всего в работников в компании - " + workers + " человек");
        workers = workers + 94;
        var planHours = workers * hoursPerONe;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + planHours+ " часов работы может быть поделено между сотрудниками");






    }
}