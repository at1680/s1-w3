public class ClassroomMain {
    public static void main(String[] args) {
        Classroom morris = new Classroom("Morris");
        Classroom becker = new Classroom("Becker", 35, 32);

        morris.setDesks(30);

        System.out.println("The teacher is, " + becker.teacher() + "; and there are this many desks, " + becker.desks() + "; and this many students, " + becker.students());
    }
}
