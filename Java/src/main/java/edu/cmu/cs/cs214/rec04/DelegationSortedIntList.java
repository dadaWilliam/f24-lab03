package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {

    private SortedIntList sortedIntList = new SortedIntList();
    private int totalAdded = 0;

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public boolean add(int num) {
        this.totalAdded++;
        return sortedIntList.add(num);
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return sortedIntList.addAll(list);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public int get(int index) {
        return sortedIntList.get(index);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public boolean remove(int num) {
        return sortedIntList.remove(num);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public int size() {
        return sortedIntList.size();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    // Write your implementation below with API documentation

}