/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import animals.Animal;
import ultility.AnimalModel;
import ultility.DataSetup;
import view.SearchMenu;
import view.View;

/**
 *
 * @author fernandoms
 */
public class Controller {
    private View view;
    private AnimalModel animalModel;
    
    
    
    public void start(){
        DataSetup ds = new DataSetup();
        animalModel = new AnimalModel(ds.generateAnimals(20));
        view = new SearchMenu();
        
    }
    public void update(){
        view.fetchData(animalModel);
        view.display();
        view = view.getOpt();
    }
    
    public boolean exit(){
        if(view == null){
            return true;
        }
        return false;
    }
    
}
