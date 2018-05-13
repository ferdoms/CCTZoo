/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import animal.Animal;
import animal.AnimalModel;
import ultility.DataSetup;
import keeper.KeeperModel;
import view.*;

/**
 * Purpose: it control the basics of the system, setup data, updates the view and
 * exits the system.
 * @author thiago silva farias
 * @author fernandoms
 */
public class Controller {
    private View view;
    private AnimalModel animalModel;
    private KeeperModel keeperModel;
    
    /**
     * Purpose: it starts the system by setting up the basic data and calling the 
     * initial screen
     */
    public void start(){
        DataSetup ds = new DataSetup();
        animalModel = new AnimalModel(ds.generateAnimals(300));
        keeperModel = new KeeperModel(ds.generateKeepers(40));
        keeperModel.autoAssignAnimals(animalModel);
        view = new MainMenu();
        
    }

    /**
     * Purpose: updates the view.
     * 
     */
    public void update(){
        view.fetchData(animalModel, keeperModel);
        view.display();
        view = view.getOpt();
    }
    
    /**
     * Purpose: check if a view object has been selected and stored to the 'view'
     * variable. if the 'view' variable is null it means that the system has been 
     * exited.
     * @return a boolean; true if the system has been exited
     */
    public boolean exit(){
        if(view == null){
            return true;
        }
        return false;
    }
    
}
