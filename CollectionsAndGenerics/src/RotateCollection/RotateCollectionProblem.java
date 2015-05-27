package RotateCollection;
import java.util.Collection;

public class RotateCollectionProblem {

    public static void rotate(Collection<Integer> collection, int rotateStep ){
        Object[] swap = new Object[Math.abs(rotateStep)];
        Object[] copyCollection = new Object[collection.size() - Math.abs(rotateStep)];
        int currentSwapIndex = 0;
        if(rotateStep > 0){
            for (int i = collection.size() - rotateStep; i < collection.size(); i++){
                swap[currentSwapIndex] = collection.toArray()[i];
                currentSwapIndex++;
            }
            for (int i = 0; i < collection.size() - rotateStep; i++){
                copyCollection[i] = collection.toArray()[i];
            }
            collection.clear();
            for (int i = 0; i < currentSwapIndex; i++){
                collection.add((Integer)swap[i]);
            }
            for (int i = 0; i < copyCollection.length; i++){
                collection.add((Integer)copyCollection[i]);
            }
        } else if(rotateStep < 0) {//asdasdasd
            rotateStep = Math.abs(rotateStep);
            for (int i = 0; i < rotateStep; i++){
                swap[currentSwapIndex] = collection.toArray()[i];
                currentSwapIndex++;
            }
            for (int i = 0; i < collection.size() - rotateStep; i++){
                copyCollection[i] = collection.toArray()[i + rotateStep];
            }
            collection.clear();
            for (int i = 0; i < copyCollection.length; i++){
                collection.add((Integer)copyCollection[i]);
            }
            for (int i = 0; i < currentSwapIndex; i++){
                collection.add((Integer)swap[i]);
            }
            
        }
    }
}
