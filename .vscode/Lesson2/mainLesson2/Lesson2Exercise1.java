package mainLesson2;
public class Lesson2Exercise1 {

    public static void main(String[] args) {
        Resume resume1 = new Resume("John", "Doe", "Smith");
        Resume resume2 = new Resume("John", "Doe", "Smith", 30, "Engineer");
        Resume resume3 = new Resume("John", "Doe", "Smith", 30, "Engineer", 5);

        resume1.printResume();
        resume2.printResume();
        resume3.printResume();
    }

    public static class Resume {
        private String firstName;
        private String lastName;
        private String middleName;
        private Integer age;
        private String profession;
        private Integer experience;

        public Resume(String firstName, String lastName, String middleName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
        }

        public Resume(String firstName, String lastName, String middleName, int age, String profession) {
            this(firstName, lastName, middleName); // вызов другого конструктора класса
            this.age = age;
            this.profession = profession;
        }

        public Resume(String firstName, String lastName, String middleName, int age, String profession, int experience) {
            this(firstName, lastName, middleName, age, profession); // вызов другого конструктора класса
            this.experience = experience;
        }

        public void printResume() {
            System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
            if (age != null) System.out.println("Age: " + age);
            if (profession != null) System.out.println("Profession: " + profession);
            if (experience != null) System.out.println("Experience: " + experience + " years");
        }
    }

    public static void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}