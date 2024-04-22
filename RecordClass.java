// class Alien {
//     private int age;
//     private String name;

//     public Alien(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public String getName() {
//         return name;
//     }
//     @Override
//     public String toString() {
//         return "Alien [age=" + age + ", name=" + name + "]";
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + age;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

// }
//now thwe thing is above 45 lines of code can be implemented in single line of code using Record class

record Alien(int age, String name) {
}
// methods like equalsto, toString are already impleemted in the record class,
// used for storing data
// all variables are private and final(immutable data)
// record class cannot extend any other class

public class RecordClass {

    public static void main(String[] args) {
        Alien alien = new Alien(20, "Alien");
        Alien alien2 = new Alien(20, "Alien");

        System.out.println(alien.equals(alien2));

        System.out.println(alien);

    }

}
