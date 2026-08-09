package me.matsubara.realisticvillagers.compatibility;

import org.bukkit.entity.Villager;

import java.lang.reflect.Method;

public class EMCompatibility implements Compatibility {

    private static final String TAGGER_CLASS = "com.magmaguy.elitemobs.tagger.PersistentTagger";

    @Override
    public boolean shouldTrack(Villager villager) {
        try {
            Class<?> tagger = Class.forName(TAGGER_CLASS);
            return !isTagged(tagger, "isNPC", villager)
                    && !isTagged(tagger, "isEliteProjectile", villager)
                    && !isTagged(tagger, "isEliteEntity", villager)
                    && !isTagged(tagger, "isSuperMob", villager)
                    && !isTagged(tagger, "isVisualEffect", villager);
        } catch (ReflectiveOperationException exception) {
            // EliteMobs is optional; never prevent ordinary villagers from loading.
            return true;
        }
    }

    private boolean isTagged(Class<?> tagger, String methodName, Villager villager) throws ReflectiveOperationException {
        Method method = tagger.getMethod(methodName, org.bukkit.entity.Entity.class);
        return Boolean.TRUE.equals(method.invoke(null, villager));
    }
}
