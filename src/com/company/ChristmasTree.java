package com.company;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.*;

public class ChristmasTree {
    private List<ChristmasToy> pull = new LinkedList<>();
    private String name;
     public ChristmasTree(String name){
         this.name = name;
     }

    public void putOnTree(ChristmasToy toy,ChristmasTree tree){
        tree.getPull().add(toy);
    }
    public void getInfo(ChristmasTree tree){
         int countOfRed = 0;
        System.out.format("Дерево: %s\nЧисло игрушек: %d\nПараметры игрушек:\n",tree.name,tree.getPull().size());
         for (int i =0;i<tree.getPull().size();i++){
             ChristmasToy toy = tree.getPull().get(i);
             System.out.format("---------------------------\n" +
                     "Игрушка № %d\nРазмер %d\nЦвет %s\n" +
                     "---------------------------\n",i+1,toy.getSize(),toy.getColor());
             if (toy.getColor() == "Красный"){
                countOfRed++;
             }
         }
        System.out.println("Число красных игрушек: "+countOfRed);
    }
    public void sortToy(ChristmasTree tree){
        Collections.sort(tree.getPull(),new Comparator<ChristmasToy>() {
            @Override
            public int compare(ChristmasToy o1, ChristmasToy o2) {
                return Collator.getInstance().compare(o1, o2);
            }
        });
     }

     public void sort1(ChristmasTree tree){

         Collections.sort(tree.getPull(), new MyComparator() {
         });
     }

     public void sort2(ChristmasTree tree){
         TreeSet sortedSet = new TreeSet( new MyComparator());
         sortedSet.addAll(tree.getPull());
         tree.getPull().clear();
         tree.getPull().addAll(new LinkedList<ChristmasToy> (sortedSet));

     }

    public List<ChristmasToy> getPull() {
        return pull;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChristmasTree that = (ChristmasTree) o;
        return Objects.equals(pull, that.pull) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pull, name);
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "pull=" +Arrays.toString(pull.toArray())+
                ", name='" + name + '\'' +
                '}';
    }
}
