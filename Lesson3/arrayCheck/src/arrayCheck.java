import java.util.Scanner;

public class arrayCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] students = {"Leesin", "Vi", "Fiora", "Lux","Kaisa","Nami"};

        System.out.println("Nhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(name)){
                System.out.println("Sinh viên: " + name + " đứng vị trí: " + (i + 1) + " trong danh sách");
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Ko tìm thấy tên " + name + " trong danh sách");
    }
}
