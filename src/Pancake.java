public class Pancake {

        private String name;
        private double price ;
        private int size ;
        //创建get set方法
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }

        public Pancake() {
            super();
        }

        public Pancake(String name, double price, int size) {
            super();
            this.name = name;
            this.price = price;
            this.size = size;
        }
        //创建一个展示的方法
      public String show () {
          return "名称：" +getName()+" \n价格："+getPrice()+ "\n大小:"+getSize()+"\n培根克数：";


      }
    }

