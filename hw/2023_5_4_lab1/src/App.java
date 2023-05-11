public class App {
    public static void main(String[] args) throws Exception {
        Furniture bed = new Furniture("床", 4);
        Furniture wardrobe = new Furniture("衣柜", 2);
        Furniture table = new Furniture("餐桌", 1.5);
        House house = new House("三室一厅", 120);
        house.addFurniture(bed);
        house.addFurniture(wardrobe);
        house.addFurniture(table);
        System.out.println(house);

        Soldier soldier = new Soldier();
        soldier.fire();
        soldier.fire();
        soldier.fire();
        soldier.reload(5);
        for (int i = 0; i < 10; i++) {
            soldier.fire();
        }
        System.out.println("----------");
        Gun gun = new Gun("AK47");
        Soldier soldier2 = new Soldier("Jack", gun);
        soldier2.fire();
        soldier2.fire();
        soldier2.reload(5);
        for (int i = 0; i < 10; i++) {
            soldier2.fire();
        }

        Book book = new Book("Java Programming", "O'Reilly Media", "Kathy Sierra and Bert Bates", 39);
        // Create a student object
        Student student = new Student("123456", "Class 1A", "Alice", "female");

        // Create a teacher object
        Teacher teacher = new Teacher("Java Programming", "Class 1A", "Bob", "male");

        // Call methods on the student and teacher objects to get information
        String studentInfo = teacher.getStudentInfo(student);
        System.out.println(studentInfo);

        String bookInfo = student.getBookInfo(book);
        System.out.println(bookInfo);
    }

}
