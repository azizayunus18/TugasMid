// Nama Nuraziza yunus
// Stambuk 13020210126

interface A {
    public void aaa();
}

interface B extends A {

}

class Central4DigitTerakhirStambuk implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central4DigitTerakhirStambuk obj = new Central4DigitTerakhirStambuk();
        obj.aaa();
    }
}
