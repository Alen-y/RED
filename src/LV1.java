import java.util.Scanner;

public class LV1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1选择普通煎饼");
      int choice = sc.nextInt();

        Pancake pancake = PancakeFactory.getPancake(choice);

        System.out.println(pancake.show());
    }
}
    class PancakeFactory {
        private int choice;


        public static Pancake getPancake(int choice) {//父类作方法的返回值，返回的是子类
            Pancake pancake = null;
            Scanner sc = new Scanner(System.in);

            switch (choice) {
                case 1:

                    System.out.println("请输入面粉克数：");
                    int gram = sc.nextInt();
                    System.out.println("请输入煎饼的大小：");
                    int size = sc.nextInt();
                    System.out.println("请输入煎饼价格：");
                    double price = sc.nextDouble();


                    //调用有参构造方法并赋值

                    pancake= new Simpecake("红岩煎饼", price, size, gram);

                    try {


                        if (size > 20||gram>50) {

                            throw new AddException("值太大");

                        }

                    } catch (Exception e) {

                        e.printStackTrace();

                    }


            }

return pancake;
        }
    }

