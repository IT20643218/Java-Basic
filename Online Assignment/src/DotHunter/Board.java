package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :1.50AM;
 * @since :2021.09.11;
 **/

//Board Class
public class Board {
    //identify variable

    private int NumOfDot = 97;
    private int NUmOfSuperDot = 3;
    private static String dot_type;
    private Hunter newHunter;
    private Soldier threeSoldier[];

    //static
    static {
        Hunter.init();
    }

    public Board(String dot_type,Hunter newHunter,Soldier threeSoldier[]){
        this.dot_type = dot_type;
        this.newHunter = newHunter;
        this.threeSoldier =threeSoldier;

        newloop();
    }

    private void newloop(){
        for(int i=0; i<3; ++i) {
            if(threeSoldier[i] == new RedSoldier()) {
                threeSoldier[i].init();
            } else if(threeSoldier[i] == new GreenSoldier()) {
                threeSoldier[i].init();
            } else {
                threeSoldier[i].init();
            }
        }
    }//end newloop

    public static String getDotType( ) {
        return dot_type;
    }
}//end Board class

