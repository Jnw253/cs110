public class Learning {

    public static void main(String[] args) {
//        String nameQuestion = "what is your name?";
//        System.out.println(nameQuestion);
//
//        Scanner scanner = new Scanner(System.in);
//
//        String name  = scanner.next();
//
//        String concat = "hello " + name;
//        System.out.println(concat);
//
//        String nameQuestion1 = "how old are you?";
//                System.out.println(nameQuestion1);
//
//        System.out.println("Input age");
//
//        int num = scanner.nextInt();
//
//        System.out.println(String.format("Wow you are really %d years old", num));
//
//        String nameQuestion2 = "Where are you from?";
//                System.out.println(nameQuestion2);
//
//                String location = scanner.next();
//
//                //System.out.println("My name is " + name + " I am " + num + " years old. " + " I was born in " + location);
//        System.out.println(String.format("My name is %s I am %d years old. I was born in %s", name, num, location));
        TimeConverter converter = new TimeConverter();
        System.out.println(String.format("Converted by TimeConverter %d", converter.getSeconds(1, 1, 1, 1)));
    }


}
