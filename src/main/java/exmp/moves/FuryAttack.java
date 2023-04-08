package exmp.moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class FuryAttack extends PhysicalMove {
    private static final double[] PROBABILITIES = {0, 0, 3.0 / 8.0, 3.0 / 8.0, 1.0 / 8.0, 1.0 / 8.0};
    private static final int[] POWERS = {0, 0, 30, 45, 60, 75};

    public FuryAttack() {
        super(Type.NORMAL, 0.0, 85.0);
    }

    public int chooseFuryAttackHits(double[] probabilities) {
        Random random = new Random();
        double p = random.nextDouble();
        double cumulativeProbability = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            cumulativeProbability += probabilities[i];
            if (p < cumulativeProbability) {
                return i + 2;
            }
        }
        return 2;
    }

    @Override
    protected void applyOppDamage(Pokemon defender, double damage) {
        int hits = chooseFuryAttackHits(PROBABILITIES);
        for (int i = 0; i < hits; i++) {
            defender.setMod(Stat.HP, -POWERS[i]);
        }
    }

    @Override
    public String describe() {
        return "uses Fury Attack";
    }
}
