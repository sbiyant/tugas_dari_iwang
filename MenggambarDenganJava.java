class MenggambarDenganJava {

    void gambarKotak() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    void gambarSegitiga() {
        for (int i=0; i<5; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    void gambarSegitigaTerbalik() {
        for (int i=5; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    void gambarSelangSeling() {
        for (int i=5; i>0; i--) {
            for (int j=i; j>0; j--) {
                if (j%2 == 0) {
                    System.out.print("|");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void gambarKotakPola() {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (i%2 == 0) {
                    if (j==2) {
                        System.out.print("|");
                    }else {
                        System.out.print("*");
                    }
                }else if(j==1) {
                    System.out.print("|");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void gambarAxisTengah() {
        for (int i=0; i<=9; i++) {
            for (int j=0; j<=9; j++) {
                if (i == 0) {
                    System.out.print(+j);
                }else if (j == 0) {
                    System.out.print(+i);
                }else if (j == 6) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {

        MenggambarDenganJava mdj = new MenggambarDenganJava();

        mdj.gambarKotak();
        mdj.gambarSegitiga();
        mdj.gambarSegitigaTerbalik();
        mdj.gambarSelangSeling();
        mdj.gambarKotakPola();
        mdj.gambarAxisTengah();
    }
}