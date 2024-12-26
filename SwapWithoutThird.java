class SwapWithoutThird {
    private int a;
    private int b;
// constructor
    public SwapWithoutThird(int a, int b) {
        this.a = a;
        this.b = b;
    }
//method for swapping
    public void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
//method for displaying the swaped numbers
    public void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        SwapWithoutThird obj = new SwapWithoutThird(10, 20);
        System.out.println("Before Swapping:");
        obj.display();

        obj.swap();

        System.out.println("After Swapping:");
        obj.display();
    }
}
