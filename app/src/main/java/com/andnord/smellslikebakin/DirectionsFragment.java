package com.andnord.smellslikebakin;

/**
 * Created by Andreas on 11.07.2017.
 */

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
