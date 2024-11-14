class p1{
    public static void main(String[] args) {
        int n = 7;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || i == n-1 ||j == 0 ||j == n-1 || i == j || i+j == n-1 ||j == n/2 || i == n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p2{
    public static void main(String[] args){
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i >= j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}

class p3{
    public static void main(String[] args){
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i <= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p4{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j >= n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p5{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j <= n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p6{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i < n;i++){
            for(int j = 0;j<n;j++){
                if(i >= j && i+j >= n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p7{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i<=j && i+j <= n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p8{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if((i <= j && i+j <= n-1) || (i >= j && i+j >= n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p9{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j <= n-1 && i >= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}

class p10{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i <= j && i+j >= n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }System.out.println();
        }
    }
}

class p11{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if((i <= j && i+j >= n-1) || (i>=j && i+j <= n-1 ))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println();
        }
    }
}