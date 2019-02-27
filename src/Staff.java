public class Staff {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Staff(String name, String position, String email, String phoneNumber, int salary, int age){

        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        if (this.age > 40) {System.out.println(this.name + ", " + this.age + ", " + "работает в должности " + "'" +
                this.position + "'" + ", " + "ежемесячная заработная плата " +
                this.salary + " тыс.руб." + " Контактные данные - email: " + this.email + ", телефон: " + this.phoneNumber + ".");}

    }

    public static void main(String[] args) {

        System.out.println("Cписок сотрудников фирмы 'Bad OOP lessons' старше 40 лет:");

        Staff[] persArray = new Staff[5];
        persArray[0] = new Staff("Иванов Иван", "Оператор", "ivivan@mailbox.com ", "89231231212", 30000, 30);
        persArray[1] = new Staff("Андреев Андрей", "Программист", "anandrey@mailbox.com ", "89231231213", 45000, 25);
        persArray[2] = new Staff("Зинченко Зинаида", "Бухгалтер", "zinzinaida@mailbox.com ", "89231231214", 30000, 33);
        persArray[3] = new Staff("Иванов Игорь", "Лектор", "ivigor@mailbox.com ", "89231231215", 30000, 41);
        persArray[4] = new Staff("Владимиров Владимир", "Директор", "ceovlad@mailbox.com ", "89231231216", 100000, 55);

    }

}