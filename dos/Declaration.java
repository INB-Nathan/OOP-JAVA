import java.util.Scanner;

class Declaration {
    private int gun;

    public int getGun(){
        return gun;
    }
    public void setGun(int gun){
        this.gun = gun;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Declaration c = new Declaration();
        System.out.println("Enter value of gun: ");
        int gunVal = myObj.nextInt();
        c.setGun(gunVal);
        System.out.println("The value of gun is: " + c.getGun());
    }
}