package finalwork;

import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Computer computer1 = new Computer(1, "белый", "Mac", 8, 512);
    	Computer computer2 = new Computer(2, "красный", "Linux", 16, 256);
    	Computer computer3 = new Computer(3, "черный", "Windows", 8, 128);
    	Computer computer4 = new Computer(4, "белый", "Windows", 8, 128);
    	Computer computer5 = new Computer(5, "красный", "Windows", 16, 256);
        

        Set<Computer> setComputer = new HashSet<>();
        setComputer.add(computer1);
        setComputer.add(computer2);
        setComputer.add(computer3);
        setComputer.add(computer4);
        setComputer.add(computer5);
       

        MySort.filter(setComputer);
    }
}
