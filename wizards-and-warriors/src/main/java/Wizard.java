public class Wizard extends Fighter {
    boolean isSpellNotPrepared = true;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        isSpellNotPrepared = false;
    }

    @Override
    boolean isVulnerable() {
        return isSpellNotPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return isSpellNotPrepared ? 3 : 12;
    }
}
