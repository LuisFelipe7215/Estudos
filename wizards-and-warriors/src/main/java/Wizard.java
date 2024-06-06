public class Wizard extends Fighter {
    boolean isSpellPrepared = false;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        isSpellPrepared = true;
    }
}
