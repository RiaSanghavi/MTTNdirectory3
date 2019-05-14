package com.example.mahe.mttndirectory.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static TitleCreator _titleCreator;
    List<TitleParent> _titleParents;

    public TitleCreator(Context context) {
        _titleParents = new ArrayList<>();
        for (int i = 1; i < 12; i++) {
            TitleParent title = new TitleParent(String.format("main #%d", i));

            switch (i) {
                case 1:
                    title = new TitleParent(String.format("Auto Services"));
                    break;
                case 2:
                    title = new TitleParent(String.format("Eateries"));
                    break;
                case 3:
                    title = new TitleParent(String.format("Emergency and Important Contact"));
                    break;
                case 4:
                    title = new TitleParent(String.format("Grocery Stores"));
                    break;
                case 5:
                    title = new TitleParent(String.format("Hostel and accommodation"));
                    break;
                case 6:
                    title = new TitleParent(String.format("MAHE Colleges'Department"));
                    break;
                case 7:
                    title = new TitleParent(String.format("Medical Services"));
                    break;
                case 8:
                    title = new TitleParent(String.format("Miscellaneous Services"));
                    break;
                case 9:
                    title = new TitleParent(String.format("Project Work and Tech Stores"));
                    break;
                case 10:
                    title = new TitleParent(String.format("Rent a bike"));
                    break;
                case 11:
                    title = new TitleParent(String.format("Travel agencies"));
                    break;

            }
            _titleParents.add(title);
        }
    }

    public static TitleCreator get(Context context) {
        if (_titleCreator == null)
            _titleCreator = new TitleCreator(context);
        return _titleCreator;
    }


    public List<TitleParent> getAll() {



                return _titleParents;



    }
}


