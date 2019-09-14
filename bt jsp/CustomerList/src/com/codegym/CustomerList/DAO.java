package com.codegym.CustomerList;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    public static List<Users> exportUsers() {
        List<Users> list = new ArrayList<Users>();
        list.add(new Users("Mai Van Hoan", "1983-08-20", "Ha Noi", "null"));
        list.add(new Users("Nguyen Van Nam", "1983-08-21", "Bac Giang", "null"));
        list.add(new Users("Nguyen Thai Hoa", "1983-08-22", "Nam Dinh", "null"));
        list.add(new Users("Tran Dang Khoa", "1983-08-17", "Ha Tay", "null"));
        list.add(new Users("Nguyen Dinh Thi", "1983-08-19", "Ha Noi", "null"));

        return list;
    }
}
