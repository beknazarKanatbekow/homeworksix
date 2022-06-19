public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setDamage(25);
        boss.setHealth(150);
        System.out.println(boss.getHealth() + " " + boss.getDamage());
        boss.weapon.setPistol("pistol");
        boss.weapon.setEagle("eagle");
        System.out.println(boss.weapon.getEagle() + " " + boss.weapon.getPistol);



    }
}