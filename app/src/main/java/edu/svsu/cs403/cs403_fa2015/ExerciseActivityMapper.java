package edu.svsu.cs403.cs403_fa2015;

import android.app.Activity;
import java.util.HashMap;


public class ExerciseActivityMapper {
    private static ExerciseActivityMapper singleton;
    private HashMap<String, Class<? extends Activity>> exerciseClassMap;

    public ExerciseActivityMapper() {
        defineExerciseMappings();
    }

    // ExerciseActivityMapper.getExerciseClass("chap1ex1");
    public static Class<? extends Activity> getExerciseClass(String exerciseId) {
        return getSingleton().exerciseClassMap.get(exerciseId);
    }

    private static ExerciseActivityMapper getSingleton() {
        if (singleton == null) {
            singleton = new ExerciseActivityMapper();
        }
        return singleton;
    }

    private void defineExerciseMappings() {
        exerciseClassMap = new HashMap<String, Class<? extends Activity>>();

        //Declare your Java classes here
        exerciseClassMap.put("gpcorser1", gpcorser_chap1.class);
        exerciseClassMap.put("gpcorser2", gpcorser_chap2.class);
        exerciseClassMap.put("kafzal1", kafzal1_chap1.class);
        exerciseClassMap.put("bjcobb1", bjcobb_chap1.class);
        exerciseClassMap.put("alpero1", alpero_chap1.class);
        exerciseClassMap.put("alpero2", alpero_chap2.class);
        exerciseClassMap.put("alpero3", alpero_chap3.class);
    }
}

