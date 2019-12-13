class ValuesList {
    void print () {
        MyList<Integer> myList = new MyList<>();

        myList.add(10);
        myList.add(130);
        myList.add(250);
        myList.add(-20);
        myList.add(-200);
        myList.add(-40);

        System.out.println("Largest:" + myList.largest());
        System.out.println("Smallest:" + myList.smallest());
    }
}