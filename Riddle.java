public class Riddle {
    public static void main(String [] args){
        int mew = 0;
        for(float raltz = 1; raltz < 1000; raltz++){
            for(float kirlia = 1; kirlia < 1000; kirlia++){
                for(float gardavoir = 1; gardavoir < 1000; gardavoir++){
                    for(float galade = 1; galade < 1000; galade++){
                        float hoenn = ((raltz / kirlia) + (gardavoir / galade));
                        if(hoenn == 1.0) {
                            int eevee =Math.round(raltz);
                            int flareon =Math.round(kirlia);
                            int vaporeon =Math.round(gardavoir);
                            int jolteon =Math.round(galade);
                            String sinnoh = (eevee + "/" + flareon + " + " + vaporeon + "/" + jolteon);
                            char[] unkown = sinnoh.toCharArray();
                            int ekans = sinnoh.length();
                            int mrmime = 0;
                            for (int psy = 0; psy < 10; psy++) {
                                char chimego = (char)(psy+'0');
                                int mimejr = 0;
                                for (int cic = 0; cic < ekans; cic++) {
                                    if (unkown[cic] == chimego) {
                                        mimejr++;
                                    }
                                }
                                if (mimejr == 1) {
                                    mrmime++;
                                }
                            }
                            if (mrmime == 10) {
                                mew++;
                                System.out.println(sinnoh + " = 1");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("True for " + (mew / 2 ) + " outcomes");
    }
}
