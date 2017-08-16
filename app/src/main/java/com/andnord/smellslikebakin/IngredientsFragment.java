package com.andnord.smellslikebakin;

/**
 * Created by Andreas on 11.07.2017.
 */

public class IngredientsFragment extends CheckBoxesFragment {


    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
