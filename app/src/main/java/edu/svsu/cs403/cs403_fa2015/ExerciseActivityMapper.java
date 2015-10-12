package edu.svsu.cs403.cs403_fa2015;

import android.app.Activity;
import java.util.HashMap;


public class ExerciseActivityMapper {
    private static ExerciseActivityMapper singleton;
    private HashMap<String, Class<? extends Activity>> exerciseClassMap = new HashMap<>();

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

        //Declare your Java classes here


        exerciseClassMap.put("gpcorser1", gpcorser_chap1.class);

        exerciseClassMap.put("gpcorser2", gpcorser_chap2.class);
        exerciseClassMap.put("kafzal1", kafzal1_chap1.class);
        exerciseClassMap.put("bjcobb1", bjcobb_chap1.class);
		
        exerciseClassMap.put("alpero1", alpero_chap1.class);
        exerciseClassMap.put("alpero2", alpero_chap2.class);
        exerciseClassMap.put("alpero3", alpero_chap3.class);

        exerciseClassMap.put("zmmetiva1", zmmetiva_chap1.class);
        exerciseClassMap.put("zmmetiva2", zmmetiva_chap2.class);
        exerciseClassMap.put("zmmetiva3", zmmetiva_chap3.class);

        exerciseClassMap.put("tpmetiva1", tpmetiva_chap1.class);
        exerciseClassMap.put("tpmetiva2", tpmetiva_chap2.class);
        exerciseClassMap.put("tpmetiva3", tpmetiva_chap3.class);

        exerciseClassMap.put("gpcorser1", gpcorser.class);
        exerciseClassMap.put("gxhender1", gxhender_chap1.class);
        exerciseClassMap.put("gxhender2", gxhender_AboutUs.class);

        exerciseClassMap.put("pjessenm2", pjessenm_chap12.class);


        exerciseClassMap.put("gpcorser1", gpcorser_chap1.class);
        exerciseClassMap.put("gpcorser2", gpcorser_chap2.class);
        exerciseClassMap.put("jmwalter1", jmwalter_chap1.class);
        exerciseClassMap.put("jmwalter2", jmwalter_chap2.class);
        exerciseClassMap.put("jmwalter3", jmwalter_chap3.class);
        exerciseClassMap.put("jmwalter4", jmwalter_chap4.class);
        exerciseClassMap.put("bjcobb1", bjcobb_chap1.class);


    }
}

