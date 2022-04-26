public class Plane {
    public static void main(String[] args) {
        System.out.println();
    }
    private int x, y, z;
    private int countBombs;
    private int fuel;
    private int dir = 0;
    public Plane() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }
public Plane(int x, int y, int z, int countBombs, int fuel){
        this.x = x;
        this.y = y;
        this.z = z;
        this.countBombs = countBombs;
        this.fuel = fuel;
}
public void flyStraight(int i){
        switch (dir){
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case  2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
        this.fuel--;
        if(this.fuel <= 0 && this.z > 0){
            System.out.println("Кончилост топливо(. Игра окончена");
        }else{
            System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x = "+this.x+", y = "+this.y+", z = "+this.z +". Топлива осталось = "+ this.fuel);
        }
}

}
