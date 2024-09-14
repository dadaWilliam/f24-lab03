/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

import { SortedIntLinkedList } from "./hidden/SortedIntListLibrary";
import { IntegerList } from "./IntegerList";

class DelegationSortedIntList implements IntegerList{
  private sortedList: SortedIntLinkedList = new SortedIntLinkedList;
  private totalAdded:number = 0
  constructor () {
  }

  add(num: number): boolean {
    this.totalAdded++
    return this.sortedList.add(num);
  }

  addAll(list: IntegerList) {
    this.totalAdded = this.totalAdded+list.size()
    return this.sortedList.addAll(list);

  };
  get(index: number) {
    return this.sortedList.get(index);
  };
  remove (num: number) { return this.sortedList.remove(num);};
  removeAll(list: IntegerList) { return this.sortedList.removeAll(list);};
  size() { return this.sortedList.size();};

  getTotalAdded():number{
    return this.totalAdded
  }
  // Write your implementation below with API documentatioin
}

export { DelegationSortedIntList }
