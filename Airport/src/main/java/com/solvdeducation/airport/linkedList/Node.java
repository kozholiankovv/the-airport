package com.solvdeducation.airport.linkedList;

    public class Node<T>{
     T value;
     Node<T> next;


    public Node(){

    }

    public Node(T value) {
        this.value = value;
    }


        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
