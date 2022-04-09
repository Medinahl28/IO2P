package com.company;

public class Main {

    public static void main(String[] args) {
        Marana foundingMother = new Marana(); //Creates Marana object
        Marana foundingMothersSon = new Callisto(); //Creates Callisto object
        Marana allyofFranklynfamily = new Kenzo(); //Creates Kenzo object
        foundingMother.lightningstyle();
        foundingMothersSon.lightningstyle();
        allyofFranklynfamily.lightningstyle();
    }
}

package com.company;

public class Marana {
    public void lightningstyle() {
        System.out.println("Marana, the founding mother and owns the largest and longest range of lightning, able to kill an opponent" +
                "by the range of almost 10 kilometers");
    }
}

package com.company;

public class Callisto extends Marana{
    @Override
    public void lightningstyle() {
        System.out.println("Callisto invented the Lightning Balls, which able to kill opponents with only 10 seconds");
    }
}

package com.company;

public class Kenzo extends Marana {
    @Override
    public void lightningstyle() {
        System.out.println("Kenzo was able to combine lightning and flight, so he can strike lightning by flying");
    }
}

