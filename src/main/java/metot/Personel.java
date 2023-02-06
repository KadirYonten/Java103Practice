class Personel {
    String name;
    int age;

    void Personel(String n, int a) {
        name = n;
        age = a;
    }

    void printPersonel() {
        System.out.print("Hi, my name is " + name);
        System.out.println(". I am " + age + " years old.");
    }

    public static void main (String args[]) {
        Personel p = new Personel();

        p.Personel("Laura", 20);
        p.printPersonel(); 
        System.out.println("--------"); 
    

        p.Personel("Dan", 30);
        p.printPersonel(); 
        System.out.println("--------"); 
    }
} 