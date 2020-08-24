package Models;

import java.util.ArrayList;
import java.util.List;

public class OfficersManagement {

    public static List<Officer> list = new ArrayList<>();
    public static int id = 0;
    static {
        Officer officer1 = new Officer(++id, "Phạm Anh Nghĩa", "Nam", "Hà Nội", 1994, "Công nghệ thông tin",
                "Đại học", (float)10.5, (float) 0.2,20000,2020,"Xuất sắc" );
        Officer officer2 = new Officer(++id, "Đoàn Hùng Dũng", "Nam", "Nam Định", 1992, "Kế toán",
                "Đại học", (float)10.7, (float) 0.5,20000,2019,"Xuất sắc" );
        Officer officer3 = new Officer(++id, "Jenny Kim", "Nữ", "Hàn Quốc", 1997, "Thanh nhạc",
                "Cao đẳng", (float)11.0, (float) 0.2,20000,2022,"Xuất sắc" );

        list.add(officer1);
        list.add(officer2);
        list.add(officer3);
    }





}
