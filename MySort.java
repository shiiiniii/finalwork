package finalwork;

import java.util.Scanner;
import java.util.Set;

public class MySort {
   public static void filter(Set<Computer> setComputer){
       Scanner sc = new Scanner(System.in);
       do {
           Menu.print();
           String number = sc.next();
           switch (number) {
               case "0":
                   System.exit(0);
               case "1":
                   System.out.println("Введите ОЗУ: ");
                   int op = sc.nextInt();
                   System.out.println( "   Ноутбуки по запросу: ");
                   setComputer.stream().filter(lp -> lp.getOp() >= op).forEach(System.out::println);
                   break;
               case "2":
                   System.out.println("Введите oбъем ЖД ноутбука: ");
                   int ssd = sc.nextInt();
                   System.out.println( "   Ноутбуки по запросу: ");
                   setComputer.stream().filter(lp -> lp.getSsd() >= ssd).forEach(System.out::println);
                   break;
               case "3":
                   System.out.println("Введите OS ноутбука: ");
                   String os = sc.next();
                   System.out.println( "   Ноутбуки по запросу: ");
                   setComputer.stream().filter(lp -> lp.getOs().equalsIgnoreCase(os.trim())).forEach(System.out::println);
                   break;
               case "4":
                   System.out.println("Введите цвет ноутбука: ");
                   String color = sc.next();
                   System.out.println( "   Ноутбуки по запросу: ");
                   setComputer.stream().filter(lp -> lp.getColor().equalsIgnoreCase(color.trim())).forEach(System.out::println);
                   break;
               default:
                   System.out.println("Некорректный ввод.");
                   break;
           }
       } while (sc.hasNextLine());
       sc.close();
   }
}
