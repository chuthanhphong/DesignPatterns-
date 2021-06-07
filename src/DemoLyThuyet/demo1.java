package DemoLyThuyet;

public class demo1 {
            public static final demo1 Instance = new demo1();
            private demo1(){};
            public static demo1 getInstance(){
                return Instance;
            }

}
