

public class Simpecake extends Pancake {
        private int gram;//克重

        //创建set get方法
        public int getGram() {
            return gram;
        }

        public void setGram(int gram) {
            this.gram = gram;
        }
//创建构造器，空构造器一般都是会写出来的

        public Simpecake() {
            super();
        }

        //创建带三个父类属性和一个子类属性的构造方法，以备后面重载
        public Simpecake (String name, double price, int size, int gram) {
           super(name, price, size);
            this.gram = gram;
        }

        //重写父类的show方法
        public String show (){
            return "名称：" +getName()+" \n价格："+getPrice()+ "\n大小:"+getSize()+"\n培根克数："+gram;
        }

    }


